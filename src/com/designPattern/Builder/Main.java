package com.raksh.Builder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Pizza pizza=new Pizza.PizzaBuilder(Size.LARGE)
                .addCheese(true)
                .addPepperoni(true)
                .addBacon(false)
                .addExtraToppings(List.of("Olives","Mushroom"))
                .addExtraSauce(true)
                .build();
        System.out.println(pizza);
    }
}
