package models;

import java.util.ArrayList;

public class Cashier extends Person{

    private String workID;
    private Mall mall;
    private boolean employed;
    public Cashier(String name, String role) {
        super(name, role);
    }

    public Cashier(String name, String role, String workID, Mall mall) {
        super(name, role);
        this.workID = workID;
        this.mall = mall;
        this.employed = false;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public Mall getMall() {
        return mall;
    }

    public void setMall(Mall mall) {
        this.mall = mall;
    }

    public boolean isEmployed() {
        return employed; }
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String payBill(Customer customer) {
        double totalPrice = 0.0;
        System.out.println();
        for(Products items : customer.getGoods()) {
            System.out.println("item: " + items.getName() + " volume: " + items.getVolume());
            totalPrice += items.getPrice() * items.getVolume();

        }
        System.out.println("Goods Total: " + totalPrice);

        if(customer.getFunds() >= totalPrice) {
            customer.payForGoods(totalPrice);
            issueReceipt(customer, customer.getGoods(), totalPrice);
        }else {
            return "Insufficient Balance.";
        }
        return "Thank You";
    }

    public void issueReceipt(Customer customer, ArrayList<Products> goods, double totalPrice) {
        System.out.println();
        System.out.println("Receipt");
        System.out.println("Name " + customer.getName());
        System.out.println("Total " + totalPrice);
        //System.out.println("Balance " + );
        System.out.println("sold by " + getName() + " " + workID);
        System.out.println("Thanks for Your Patronage");
        System.out.println("****************");
        System.out.println("Items Purchased");

        for(Products item : getMall().getProducts()) {
            System.out.println(item.toString());
        }
        customer.getGoods().clear();
    }

    public void remove(Cashier cashier) {
    }
}
