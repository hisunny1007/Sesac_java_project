package org.example;

public class Drink extends Product {

    public Drink(String name, int price, int stockQuantity) {
        super(name, price, stockQuantity);
    }

    @Override
    public void showProduct() {
        System.out.println("product name : " + this.getName());
        System.out.println("product price : " + this.getPrice());
    }

    // 상품 종류별

}
