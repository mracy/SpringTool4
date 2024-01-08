package com.helloworld.helloworld;

public class Address {
    private String city;
    private String state;

    public void setCity(String city){
        this.city=city;

    }
    public void setState(String state){
        this.state=state;

    }

    public String toString(){
        return this.city+","+this.state;

    }
    
}
