package com.raksh.Decorator;

public class WhippedCream extends CoffeeDecorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+addCream();
    }

    private String addCream(){
        return "Whipped Cream";
    }
    @Override
    public Double getCost() {
        return coffee.getCost()+addCreamCost();
    }
    private Double addCreamCost(){
        return 1.0;
    }
}
