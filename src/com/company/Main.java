package com.company;

public class Main {

    public static void main(String[] args) {
        int cash = 15000;
        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            cars[i] = CarGenerator.carGenerator();
        }

        do {



        }while (cash<30000);
    }
}
