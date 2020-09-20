package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Customer_generator {
    public static Customer customerGenerator(){
        Customer customer = new Customer();
        String[] brand = new String[3];
        brand[0]="Audi";
        brand[1]="Honda";
        brand[2]="Fiat";

        String[] names = new String[3];
        names[0]="Robert";
        names[1]="Adam";
        names[2]="Andrzej";
        customer.setName(names[ThreadLocalRandom.current()
                .nextInt(0,3)]);

        if(ThreadLocalRandom.current()
                .nextInt(0,2)==0){
            customer.setDelivery(true);
        }else {
            customer.setDelivery(false);
        }
        customer.setCash(ThreadLocalRandom.current()
                .nextInt(15000,200000));
        customer.setBrand(brand[ThreadLocalRandom.current()
                .nextInt(0,3)],brand[ThreadLocalRandom.current()
                .nextInt(0,3)]);

        if(ThreadLocalRandom.current()
                .nextInt(0,10)<1){
            customer.setOnlyFixedCar(false);
        }else {
            customer.setOnlyFixedCar(true);
        }

        return customer;
    }
}
