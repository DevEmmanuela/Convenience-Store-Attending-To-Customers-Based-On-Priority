package org.example.classes;
import java.util.Collections;
import java.util.LinkedList;
import static org.example.classes.ReadExcel.reader;

public class Main {
    public static void main(String[] args) {
        reader();

        Store store = new Store();


        Customers customer = new Customers();
        customer.setName("Peace");
        customer.setPhoneNumber("12345");
        customer.setEmailAddress("peace@gmail.com");

        Customers customer2 = new Customers();
        customer2.setName("Uchechi");
        customer2.setPhoneNumber("6790");
        customer2.setEmailAddress("uchechi@gmail.com");

        Customers customer3 = new Customers();
        customer3.setName("Enoch");
        customer3.setPhoneNumber("43527");
        customer3.setEmailAddress("enoch@gmail.com");


        CustomerOrder customerOrder = new CustomerOrder(customer.getName(), "Chocolate", 2);
        CustomerOrder customerOrder2 = new CustomerOrder(customer2.getName(), "Lettuce", 1);
        CustomerOrder customerOrder3 = new CustomerOrder(customer3.getName(), "Television", 3);


        LinkedList<CustomerOrder> customerOrderList = store.getCustomerOrderList();

        customerOrderList.add(customerOrder);

        customerOrderList.add(customerOrder2);
        customerOrderList.add(customerOrder3);

        //System.out.println(customerOrderList);

        LinkedList<CustomerOrder> newCustomerOrderList = store.getNewCustomerOrderList();

        Collections.sort(customerOrderList);
        //System.out.println(customerOrderList);
         newCustomerOrderList.addAll(customerOrderList);

        System.out.println(newCustomerOrderList);
        Cashier.sell(store,newCustomerOrderList);





    }
}