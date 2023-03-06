package Interface;

import models.Products;

public interface CustomerService {
    public void payForGoods(double amount);
    public void addGoods (Products products, int volume);
}
