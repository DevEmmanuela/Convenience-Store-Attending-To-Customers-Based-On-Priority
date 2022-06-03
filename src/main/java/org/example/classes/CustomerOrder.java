package org.example.classes;

import java.io.IOException;
import java.util.Comparator;

public class CustomerOrder implements Comparable<CustomerOrder>{

    private String customerName;
    private String productName;
    private int quantity;

    public CustomerOrder() {
    }

    public CustomerOrder(String customerName, String productName, int quantity) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "CustomerOrder{" +
                ", customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }



    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    @Override
//    public int compare(CustomerOrder o1, CustomerOrder o2) {
//        if(o1.productName.equals(o2.productName) && o1.quantity < o2.quantity){
//            return 1;
//        }
//        else if(!(o1.productName.equals(o2.productName) && o1.quantity < o2.quantity)){
//            return 1;
//        }else {
//            return -1;
//        }
//
//    }


    @Override
    public int compareTo(CustomerOrder o) {
        if(o.productName == this.productName){
            return 1;
        }
        else {
            if(o.quantity > this.quantity){
                return 1;
            }
            else if (o.quantity == this.quantity){
                return 1;
            }
            else {
                return -1;
            }
        }

    }

}
