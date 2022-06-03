package org.example.interfaces;

import org.example.classes.Applicant;
import org.example.classes.Products;
import org.example.classes.Store;

public interface ManagerServices {
    void hire(Applicant newCashier, String qualified, String qualified2, String qualified3, Integer age);

    void update(Store store, Products products);
}
