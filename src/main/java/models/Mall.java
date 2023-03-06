package models;

import java.util.ArrayList;
import java.util.List;

public class Mall {
    private String name;
    private List<Products> products;
    private  List<Cashier> cashiers;

    public Mall(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.cashiers = new ArrayList<>();

    }



    public Products pickItems(String name) {
        for(Products products1 : products) {
            if (products1.getName().equals(name))
                return products1;
        }
        return  null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public List<Cashier> getCashiers() {
        return cashiers;
    }

    public void setCashiers(List<Cashier> cashiers) {
        this.cashiers = cashiers;
    }



    public void setCashierList(Cashier cashiers) {
    }

    public List<Cashier> getCashierList() {
        return cashiers;
    }
}
