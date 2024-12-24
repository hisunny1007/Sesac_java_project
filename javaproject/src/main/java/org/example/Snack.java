package org.example;

public class Snack extends Product {

    public Snack(String name, int price, int stockQuantity) {
        super(name, price, stockQuantity);
    }

    @Override
    public void showProduct() {
        System.out.println(this.getName());
        System.out.println(this.getPrice());
    }

}
