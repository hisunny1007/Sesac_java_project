package org.example;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine implements CardPayable, CashPayable {
    // 자판기는 상품을 가지고 있다(포함 관계) : 컴포지션
    // => 클래스를 변수로 받음

    private Map<String, Product> productList;


    // 객체를 생성할 때는 hashmap이나 arraylist..
    public VendingMachine() {
        this.productList = new HashMap<String, Product>(); // 빈 map을 만들어서 집어넣어
    }

    public Map<String, Product> getProductList() {
        return productList;
    }

    public void putItemOnList(Product product) {
        productList.put(product.getName(), product);
    }


    @Override
    public void payWithCard(int amount) {

    }

    @Override
    public void payWithCash(int amount) {

    }
}
