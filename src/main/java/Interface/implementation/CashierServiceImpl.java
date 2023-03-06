package Interface.implementation;

import models.Customer;
import models.Products;
import Interface.CashierService;

import java.util.ArrayList;

public class CashierServiceImpl implements CashierService {

    @Override
    public String payBill(Customer customer) {
        return null;
    }

    @Override
    public String issueReceipt(Customer customer, ArrayList<Products> goods, double totalPrice) {
        return null;
    }
}
