package org.example;

public abstract class Product {
    // 추상 클래스 : 완성되지 않은 클래스 (추상 클래스를 상속한 자식 클래스를 실질적으로 사용함)
    // 다형성을 위한 상위 타입의 역할만 수행 / 자식 클래스를 어떻게 구현할 것인지에 대한 틀 제시

    private String name;
    private int price;
    private int stockQuantity;

    public Product(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


    // 추상 메서드 - 자식 클래스인 drink랑 snack에서 오버라이딩해서 구현부 정의
    public abstract void showProduct();

}
