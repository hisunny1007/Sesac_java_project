package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String productName = scanner.next();
//
//
//        System.out.println(productName);

        // 일반 사용자
        User sunny = new User("sunny", 10000, PaymentMethod.CARD);
        new User("heather", 5000, PaymentMethod.CASH);
        System.out.println(sunny.getPaymentMethod());

//        PaymentMethod[] paymentMethods = PaymentMethod.values();
//        System.out.println(Arrays.toString(paymentMethods));

        // 상품
        Snack chocolate = new Snack("chocolate", 2000, 5);
        Drink coke = new Drink("coke", 2500, 10);
        Drink lemonade = new Drink("lemonade", 1800, 3);


    }

}
