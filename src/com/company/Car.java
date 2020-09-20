package com.company;

public class Car {
    private String brand;
    private String segment;
    private String color;
    private int value;
    private int car_mileage;
    private boolean delivery;
    private int storage;


    //false -> broken
    boolean Brakes = true;
    boolean Suspension = true;
    boolean Engine = true;
    boolean Body = true;
    boolean Transmission = true;

    public void setDelivery(boolean delivery, int storage){
        this.delivery=delivery;
        this.storage=storage;
    }

    public boolean getDelivery() {
        return delivery;
    }

    public int getStorage(){
        return storage;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setSegment(String segment){
        this.segment=segment;
    }
    public String getSegment(){
        return segment;
    }
    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    public void setCar_mileage(int car_mileage){
        this.car_mileage=car_mileage;
    }
    public int getCar_mileage(){
        return car_mileage;
    }
    public void setBrakes(boolean brakes){
        this.Brakes=brakes;
    }
    public boolean getBreakes(){
        return Brakes;
    }
    public void setSuspension(boolean suspension){
        this.Suspension=suspension;
    }
    public boolean getSuspension(){
        return Suspension;
    }
    public void setEngine(boolean engine){
        this.Engine=engine;
    }
    public boolean getEngine(){
        return Engine;
    }
    public void setBody(boolean body){
        this.Body=body;
    }
    public boolean getBody(){
        return Body;
    }
    public void setTransmission(boolean transmission){
        this.Transmission=transmission;
    }
    public boolean getTransmission(){
        return Transmission;
    }
}
