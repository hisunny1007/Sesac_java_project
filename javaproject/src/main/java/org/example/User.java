package org.example;

public class User{

    private String name;
    private int budget;
    private PaymentMethod paymentMethod;

    public User(String name, int budget, PaymentMethod paymentMethod) {
        this.name = name;
        this.budget = budget;
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
