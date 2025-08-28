package com.designPattern.Builder.Abstract;

import java.util.List;

public abstract class Car {
    public abstract String getModel();
    public abstract String getMake();
    public abstract Type getEngineType();
    public abstract int getSeatingCapacity();
    public abstract boolean isSunRoof();
    public abstract boolean isGps();
    public abstract boolean isMusicSystem();
    public abstract List<String> getSafetyFeatures();
    static abstract class CarBuilder{
        public abstract CarBuilder model(String model);
        public abstract CarBuilder make(String make);
        public abstract CarBuilder engineType(Type engineType);
        public abstract CarBuilder seatingCapacity(int seatingCapacity);
        public abstract CarBuilder sunRoof(boolean sunRoof);
        public abstract CarBuilder gps(boolean gps);
        public abstract CarBuilder musicSystem(boolean musicSystem);
        public abstract CarBuilder safetyFeatures(List<String> safetyFeatures);
        public abstract Car build();
    }
}
