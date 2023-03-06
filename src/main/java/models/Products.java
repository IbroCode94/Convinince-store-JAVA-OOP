package models;


public class Products {

    private String name;
    private double price;
    private int volume;

    public Products(String name, double price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}


