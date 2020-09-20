package com.company;

public class Customer {
    private String name;
    private boolean delivery;
    private int cash;
    private String[] brand = new String[2];
    private boolean onlyFixedCar;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String[] getBrand() {
        return brand;
    }

    public void setBrand(String[] brand) {
        this.brand = brand;
    }

    public void setOnlyFixedCar(boolean onlyFixedCar) {
        this.onlyFixedCar = onlyFixedCar;
    }

    public boolean isOnlyFixedCar() {
        return onlyFixedCar;
    }

    public void setBrand(String s, String s1) {
        brand[0]=s;
        brand[1]=s1;
    }
}
