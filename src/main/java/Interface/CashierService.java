package Interface;

import models.Customer;
import models.Products;

import java.util.ArrayList;

public interface CashierService {
String payBill(Customer customer);

String issueReceipt (Customer customer, ArrayList<Products> goods, double totalPrice);
}
