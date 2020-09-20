package com.company;

import java.util.concurrent.ThreadLocalRandom;

class CarGenerator {

    public Car carGenerator(String[] args) {
        String[] brand = new String[3];
        brand[0]="Audi";
        brand[1]="Honda";
        brand[2]="Fiat";

        String[] color= new String[3];
        color[0]="black";
        color[1]="white";
        color[2]="red";

        String[] segment= new String[3];
        segment[0]="premium";
        segment[1]="standart";
        segment[2]="budget";

        int rn = ThreadLocalRandom.current().nextInt(0,3);

        Car car = new Car();
        car.brand=brand[rn];
        car.color=color[rn];
        car.segment=segment[rn];
        switch (segment[rn]){
            case "premium":
                car.value = ThreadLocalRandom.current().nextInt(30000,70000);
                break;
            case "standard":
                car.value = ThreadLocalRandom.current().nextInt(15000,30000);
                break;
            case "budget":
                car.value = ThreadLocalRandom.current().nextInt(1000,15000);
                break;
        }
        car.car_mileage= ThreadLocalRandom.current().nextInt(20000,200000);
        return  car;
    }
}