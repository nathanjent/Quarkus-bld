package com.example;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

public class QuarkusappMain {
    public static void main(String... args) {
        Quarkus.run(HelloWorldMain.class, args);
    }
}