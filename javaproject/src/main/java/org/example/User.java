package org.example;

public class User implements CardPayable, CashPayable{

    private String name;
    private int budget;
    private PaymentMethod paymentMethod;
    private UserType userType;

    public User(String name, int budget, PaymentMethod paymentMethod, UserType userType) {
        this.name = name;
        this.budget = budget;
        this.paymentMethod = paymentMethod;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public UserType getUserType() {
        return userType;
    }


    // 입력한 금액
    @Override
    public void payWithCard(int amount) {
        System.out.println("pay with card : " + amount);
    }

    @Override
    public void payWithCash(int amount) {
        System.out.println("pay with cash : " + amount);
    }
}
