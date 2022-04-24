package com.mabrle.designpatterns.template;

import java.util.function.Consumer;

public class OnlineBanking {

    public void processCustomer(int userId, Consumer<String> makeCustomerHappy) {
        String customer = "";
        if (userId == 0) {
            customer = "mabofu";
        } else {
            customer = "tian";
        }

        makeCustomerHappy.accept(customer);


    }

//    abstract void makeCustomerHappy(String customer);
}


