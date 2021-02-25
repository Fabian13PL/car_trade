package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Car> myCars = new ArrayList<Car>();
    static Scanner scan = new Scanner(System.in);
    static Car[] carsToBy = new Car[3];
    static int cash = 15000;

    public static void main(String[] args) {



        for (int i = 0; i < 3; i++) {
            carsToBy[i] = CarGenerator.carGenerator();
        }

        printMenu();
        do {
            System.out.println("\n Write 'menu' to show menu \n");
            switch (scan.nextLine()){
                case "1":{
                    printCarsToBuy();
                }break;
                case "2":{
                    buyCar();
                }break;
                case "3":{
                    printMyCars();
                }break;
                case "12":{
                    cash = 0;
                }break;
                case "menu":{
                    printMenu();
                }break;
                default: {
                    System.out.println("\n Wrong number, try again \n");
                }break;
            }

        }while (cash<30000 && cash>1000);
        if(cash>30000){
            System.out.println("\n You win!!! \n");
        }else System.out.println("\n You lose!!! \n");
    }



    public static void buyCar(){
        System.out.println("\n Which car you want to buy? \n write a number");
        printCarsToBuy();
        int number = scan.nextInt()-1;
        if(carsToBy[number].getValue() > cash){
            System.out.println("You are too poor to buy this car");
        }else{
            myCars.add(carsToBy[number]);
            cash -= carsToBy[number].getValue();
            carsToBy[number] = CarGenerator.carGenerator();
        }
    }
    private static void printMyCars() {
        int i=1;
        for (Car car : myCars) {
            System.out.println(i + ". " + car);
            i++;
        }
    }
    public static void printCarsToBuy(){
        int i=1;
        for (Car car : carsToBy) {
            System.out.println(i + ". " + car);
            i++;
        }
    }
    public static void printMenu(){
        System.out.println("\n select an option by typing the corresponding number \n" +
                "\n 1.browse the database of cars to buy " +
                "\n 2.buy car" +
                "\n 3.browse the database of owned cars " +
                "\n 4.repair the car " +
                "\n 5.review potential customers " +
                "\n 6.sell a car for a certain price to a potential customer" +
                "\n 7.buy an ad " +
                "\n 8.check your account balance " +
                "\n 9.check transaction history " +
                "\n 10.check the repair history of each vehicle " +
                "\n 11.check the total repair and washing costs for each of your vehicles " +
                "\n 12. I'm out \n");
    }
}
