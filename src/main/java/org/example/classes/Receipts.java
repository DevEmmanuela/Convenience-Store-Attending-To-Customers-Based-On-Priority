package org.example.classes;

public class Receipts {
    public static void dispenseReceipt(String customerName, String name, Integer price, Integer quantity){
        System.out.println("..................................................");
        System.out.println(customerName + ": Your order " + quantity + " " + name + " was purchased at " + (price * quantity));
        System.out.println("Thanks for patronizing us.");
    }
}
