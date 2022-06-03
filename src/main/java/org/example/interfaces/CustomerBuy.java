package org.example.interfaces;

import org.example.classes.Store;

import java.io.IOException;


public interface CustomerBuy {

    void buy(Store store, String productName, int quantity) throws IOException;


}
