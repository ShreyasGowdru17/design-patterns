package com.designPattern.Decorator;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+addSugar();
    }

    private String addSugar(){
        return "Sugar";
    }
    @Override
    public Double getCost() {
        return coffee.getCost()+addSugarCost();
    }
    private Double addSugarCost(){
        return 0.2;
    }
}
