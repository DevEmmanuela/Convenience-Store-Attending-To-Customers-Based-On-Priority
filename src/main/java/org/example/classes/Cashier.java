package org.example.classes;

import org.example.Exceptions.OutOfStockException;
import org.example.enums.Level;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Cashier extends Staff{

    public Cashier(String name, String qualification, Integer age, String phoneNumber, Address houseAddress, String email, Level staffLevel) {
        super(name, qualification, age, phoneNumber, houseAddress, email, staffLevel);
    }



//    public static void sell(Store store, String productName, int quantity)  {
//        List<Products> productsList = org.example.classes.ReadExcel.reader();
//        LinkedList<CustomerOrder> customerOrderList = store.getCustomerOrderList();
//        for(int i = 0; i < productsList.size(); i++){
//            if(productsList.get(i).getProductName().equals(productName)){
//                if(productsList.get(i).getQuantity() < quantity){
//                    throw new OutOfStockException("OUT OF STOCK!!!");
//                }
//                else if(productsList.get(i).getQuantity() > 0){
//                    //productsList.get(i).setQuantity(productsList.get(i).getQuantity() - quantity);
//                    Receipts.dispenseReceipt(productsList.get(i).getProductName(), productsList.get(i).getPrice(), quantity);
//                }
//
//            }
//        }
//
//    }

    public static void sell(Store store, LinkedList<CustomerOrder> customerOrderList )  {
        List<Products> productsList = ReadExcel.reader();
        LinkedList<CustomerOrder> newCustomerOrderList  = store.getNewCustomerOrderList();
        for(int k = 0; k < newCustomerOrderList.size(); k++){
            for(int i = 0; i < productsList.size(); i++){
                if(!(productsList.get(i).getProductName().equals(newCustomerOrderList.get(k).getProductName()))) {
                    continue;
                }
                if(productsList.get(i).getProductName().equals(newCustomerOrderList.get(k).getProductName())){
                    if(productsList.get(i).getQuantity() < newCustomerOrderList.get(k).getQuantity()){
                        System.out.println("OUT OF STOCK!!!");
                    }
                    else if(productsList.get(i).getQuantity() > 0){
                        productsList.get(i).setQuantity(productsList.get(i).getQuantity() - newCustomerOrderList.get(k).getQuantity());
                        Receipts.dispenseReceipt(newCustomerOrderList.get(k).getCustomerName(), productsList.get(i).getProductName(), productsList.get(i).getPrice(), newCustomerOrderList.get(k).getQuantity());
                    }
            }

            }
        }

    }

}
