package org.example;

public class VendingMachine implements CardPayable, CashPayable {
    // 자판기는 상품을 가지고 있다(포함 관계) : 컴포지션
    // => 클래스를 변수로 받음

    private Product product;




    public void start() {
        System.out.println("start vending-machine");
    }

    @Override
    public void payWithCard(int amount) {

    }

    @Override
    public void payWithCash(int amount) {

    }
}
