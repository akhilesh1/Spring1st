package dev.akhilesh.catalog.product;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String str){
        //Logging
        //Authentication
        //Authorization
        System.out.println("Checkout method from shopping cart called. "+str);
    }
    public int Quantity(String str){
        return 3;
    }
}
