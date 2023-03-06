package models;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double funds = 10_000.00;
    private ArrayList<Products> Goods;

    public Customer(String name, double balance, String goods) {
        this.name = name;
        this.funds = funds;
        this.Goods = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFunds() {
        return funds;
    }

    public void setBalance(double balance) {
        funds = funds;
    }

    public ArrayList<Products> getGoods() {
        return Goods;
    }

    public void payForGoods(double amount) {
        this.funds -= amount;
        System.out.println("You have paid " + amount);
        System.out.println("Your balance is : " + funds);
    }

    public void addGoods(Products products, int volume) {
        Products selected = new Products(products.getName(), products.getPrice(), volume);
        Goods.add(selected);
        System.out.println(name + " Added " + selected.getName() + " to the cart");
    }
    public void setGoods(ArrayList<Products> goods) {
        Goods = goods;
    }
}
