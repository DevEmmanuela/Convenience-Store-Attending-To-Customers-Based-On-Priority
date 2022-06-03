package org.example.classes;

import org.example.interfaces.CustomerBuy;

import java.io.IOException;

public class Customers {
    private String name;
    private String phoneNumber;
    private String emailAddress;



    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }




//    @Override
//    public void buy(Store store, String productName, int quantity) throws IOException {
//            Cashier.sell(store, productName, quantity);
//
//
//    }

}
