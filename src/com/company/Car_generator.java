package com.company;

import java.util.concurrent.ThreadLocalRandom;

class CarGenerator {

    public static Car carGenerator() {
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

        int rn = ThreadLocalRandom.current()
                .nextInt(0,3);

        Car car = new Car();
        car.setBrand(brand[ThreadLocalRandom.current()
                .nextInt(0,3)]);
        car.setColor(color[ThreadLocalRandom.current()
                .nextInt(0,3)]);
        car.setSegment(segment[rn]);
        switch (segment[rn]){
            case "premium":
                car.setValue(ThreadLocalRandom.current()
                        .nextInt(30000,70000));
                if(ThreadLocalRandom.current()
                        .nextInt(0,10)<2) {
                    car.setBrakes(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<2) {
                    car.setSuspension(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<2) {
                    car.setEngine(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<2) {
                    car.setBody(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<2) {
                    car.setTransmission(false);
                }
                break;
            case "standard":
                car.setValue(ThreadLocalRandom.current()
                        .nextInt(15000,30000));
                if(ThreadLocalRandom.current()
                        .nextInt(0,10)<5) {
                    car.setBrakes(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<5) {
                    car.setSuspension(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<5) {
                    car.setEngine(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<5) {
                    car.setBody(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<5) {
                    car.setTransmission(false);
                }
                break;
            case "budget":
                car.setValue(ThreadLocalRandom.current()
                        .nextInt(1000,15000));
                if(ThreadLocalRandom.current()
                        .nextInt(0,10)<7) {
                    car.setBrakes(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<7) {
                    car.setSuspension(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<7) {
                    car.setEngine(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<7) {
                    car.setBody(false);
                }if(ThreadLocalRandom.current()
                        .nextInt(0,10)<7) {
                    car.setTransmission(false);
                }
                break;
        }
        car.setCar_mileage(ThreadLocalRandom.current()
                .nextInt(20000,200000));
        if(ThreadLocalRandom.current()
                .nextInt(0,2)==0) {
            car.setDelivery(false,0);
        }else {
            car.setDelivery(true,ThreadLocalRandom.current()
                    .nextInt(1,50));
        }
        return  car;
    }
}