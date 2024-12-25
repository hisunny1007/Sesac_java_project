package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // user
        User sunny = new User("sunny", 10000, PaymentMethod.CARD, UserType.USER);
        User heather = new User("heather", 5000, PaymentMethod.CASH, UserType.ADMIN);

        // 상품 정의
        Product chocolate = new Snack("chocolate", 2000, 5);
        Product coke = new Drink("coke", 2500, 10);
        Product lemonade = new Drink("lemonade", 1800, 3);


//        // usertype 입력받기
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("click your userType (user or admin) ");
//
//        try {
//            String input1 = scanner.next().toUpperCase(); // -> 대문자로 변환
//            UserType userType = UserType.valueOf(input1); // 문자열 -> enum 변환
//
//            // 입력값의 대소문자가 enum값과 정확히 일치해야 됨!!
//            if(userType == UserType.USER) {
//                System.out.println("user");
//            } else {
//                System.out.println("admin");
//            }
//        }
//        catch (IllegalArgumentException e) { // 타입은 어떻게? 어떤 에러였지 ? -> 에러 내보고 실행시킨 후 옆에 error 창 눌러
//            System.out.println("error!");
//        }
//
//        System.out.println("select your product ");
//        String orderItem = scanner.next();
//
//        // if문에서 사용하려면 그 이전에 선언되어야 함
//        if(orderItem.equals("coke")) {
//          coke.showProduct();
//        } else {
//            System.out.println("product name is wrong");
//        }
//
//        System.out.println("select payment method (cash or card");
//        try {
//            String input2 = scanner.next().toUpperCase(); // -> 대문자로 변환
//            PaymentMethod paymentMethod = PaymentMethod.valueOf(input2); // 문자열 -> enum 변환
//
//            // 입력값의 대소문자가 enum값과 정확히 일치해야 됨!!
//            if(paymentMethod == PaymentMethod.CASH) {
//                System.out.println("cash");
//            } else {
//                System.out.println("card");
//            }
//        }
//        catch (IllegalArgumentException e) { // 타입은 어떻게? 어떤 에러였지 ? -> 에러 내보고 실행시킨 후 옆에 error 창 눌러
//            System.out.println("error!");
//        }

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.putItemOnList(chocolate);
        vendingMachine.putItemOnList(coke);
        vendingMachine.putItemOnList(lemonade);
        System.out.println(vendingMachine.getProductList());


//        PaymentMethod[] paymentMethods = PaymentMethod.values();
//        System.out.println(Arrays.toString(paymentMethods));

        // 자판기가 상품 포함

//        VendingMachine vendingMachine = new VendingMachine();
//        vendingMachine.showInfo();






    }

}

//        if (userType.equals("admin")) {
//            // admin 관련 로직
//        } else if (userType.equals.("customer")) {
//            // customer 관련 로직
//        }