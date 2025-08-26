package com.raksh.Builder.Abstract;

import java.util.ArrayList;
import java.util.List;

public class SuvCar extends Car{
    private final String model;
    private final String make;
    private final Type engineType;
    private final int seatingCapacity;
    private final boolean sunRoof;
    private final boolean gps;
    private final boolean musicSystem;
    private final List<String> safetyFeatures;

    @Override
    public String toString() {
        return "SuvCar{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", engineType=" + engineType +
                ", seatingCapacity=" + seatingCapacity +
                ", sunRoof=" + sunRoof +
                ", gps=" + gps +
                ", musicSystem=" + musicSystem +
                ", safetyFeatures=" + safetyFeatures +
                '}';
    }

    private SuvCar(Builder builder) {
        this.model= builder.model;
        this.make= builder.make;
        this.engineType=builder.engineType;
        this.seatingCapacity= builder.seatingCapacity;
        this.sunRoof= builder.sunRoof;
        this.gps= builder.gps;
        this.musicSystem= builder.musicSystem;
        this.safetyFeatures=builder.safetyFeatures;
    }

    @Override
    public String getModel() {
        return model;
    }
    @Override
    public String getMake() {
        return make;
    }
    @Override
    public Type getEngineType() {
        return engineType;
    }
    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    @Override
    public boolean isSunRoof() {
        return sunRoof;
    }
    @Override
    public boolean isGps() {
        return gps;
    }
    @Override
    public boolean isMusicSystem() {
        return musicSystem;
    }
    @Override
    public List<String> getSafetyFeatures() {
        return safetyFeatures;
    }

    static class Builder extends CarBuilder {
        private String model;
        private String make;
        private Type engineType;
        private int seatingCapacity;
        private boolean sunRoof;
        private boolean gps;
        private boolean musicSystem;
        private List<String> safetyFeatures;

        public Builder(String model, String make, Type engineType, int seatingCapacity) {
            this.model = model;
            this.make = make;
            this.engineType = engineType;
            this.seatingCapacity = seatingCapacity;
        }

        @Override
        public CarBuilder model(String model) {
            this.model=model;
            return this;
        }
        @Override
        public CarBuilder make(String make) {
            this.make=make;
            return this;
        }
        @Override
        public CarBuilder engineType(Type engineType) {
            this.engineType=engineType;
            return this;
        }
        @Override
        public CarBuilder seatingCapacity(int seatingCapacity) {
            if(seatingCapacity<5){
                throw new IllegalArgumentException("Number of seats must be greater than 5");
            }
            this.seatingCapacity=seatingCapacity;
            return this;
        }
        @Override
        public CarBuilder sunRoof(boolean sunRoof) {
            this.sunRoof=sunRoof;
            return this;
        }
        @Override
        public CarBuilder gps(boolean gps) {
            if(gps){
                this.musicSystem=true;
            }
            this.gps=gps;
            return this;
        }

        @Override
        public CarBuilder musicSystem(boolean musicSystem) {
            this.musicSystem=musicSystem;
            return this;
        }

        @Override
        public CarBuilder safetyFeatures(List<String> safetyFeatures) {
            this.safetyFeatures=new ArrayList<>(safetyFeatures);
            return this;
        }

        @Override
        public Car build() {
            return new SuvCar(this);
        }
    }
}
