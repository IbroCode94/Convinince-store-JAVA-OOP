package models;

import java.util.List;

public class Manager extends Person {

    private Mall mall;


    public Manager(String name, String role, Mall mall) {
        super(name, role);
        this.mall = mall;
    }

    public Mall getMall() {
        return mall;
    }

    public void setMall(Mall mall) {
        this.mall = mall;
    }

    public List<Products> getProductList(){
        return mall.getProducts();
    }


}