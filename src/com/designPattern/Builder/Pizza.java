package com.designPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private Size size;
    private boolean addCheese;
    private boolean addPepperoni;
    private boolean addBacon;
    private List<String> addExtraToppings;
    private boolean addExtraSauce;

    private Pizza(PizzaBuilder pizzaBuilder){
        this.size=pizzaBuilder.size;
        this.addCheese= pizzaBuilder.addCheese;
        this.addPepperoni= pizzaBuilder.addPepperoni;
        this.addBacon=pizzaBuilder.addBacon;
        this.addExtraToppings=pizzaBuilder.addExtraToppings;
        this.addExtraSauce= pizzaBuilder.addExtraSauce;
    }

    public Size getSize(){
        return size;
    }
    public boolean isAddCheese(){
        return addCheese;
    }
    public boolean isAddPepperoni() {
        return addPepperoni;
    }
    public boolean isAddBacon() {
        return addBacon;
    }
    public List<String> getAddExtraToppings(){
        return addExtraToppings;
    }
    public boolean isAddExtraSauce() {
        return addExtraSauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", addCheese=" + addCheese +
                ", addPepperoni=" + addPepperoni +
                ", addBacon=" + addBacon +
                ", addExtraToppings=" + addExtraToppings +
                ", addExtraSauce=" + addExtraSauce +
                '}';
    }

    public static class PizzaBuilder{
        private Size size;
        private boolean addCheese;
        private boolean addPepperoni;
        private boolean addBacon;
        private List<String> addExtraToppings;
        private boolean addExtraSauce;

        public PizzaBuilder(Size size){
            this.size=size;
        }


        public PizzaBuilder addCheese(boolean addCheese){
            this.addCheese=addCheese;
            return this;
        }
        public PizzaBuilder addPepperoni(boolean addPepperoni){
            this.addPepperoni=addPepperoni;
            return this;
        }
        public PizzaBuilder addBacon(boolean addBacon){
            this.addBacon=addBacon;
            return this;
        }
        public PizzaBuilder addExtraToppings(List<String> addExtraToppings){
            this.addExtraToppings=new ArrayList<>(addExtraToppings);
            return this;
        }
        public PizzaBuilder addExtraSauce(boolean addExtraSauce){
            this.addExtraSauce=addExtraSauce;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
