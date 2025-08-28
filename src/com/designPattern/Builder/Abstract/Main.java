package com.designPattern.Builder.Abstract;

import java.util.List;

public class Main {

    public static void main(String[] args){
        Car car=new SuvCar.Builder("Toyota","Fortuner",Type.DIESEL,7)
                .sunRoof(true)
                .gps(true)
                .musicSystem(true)
                .safetyFeatures(List.of("Airbags","ABS"))
                .build();
        System.out.println(car);
    }


}
