package com.mabrle.designpatterns.singlton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getHungrySingleton() {
        System.out.println(HungrySingleton.getSingleton());

    }
}