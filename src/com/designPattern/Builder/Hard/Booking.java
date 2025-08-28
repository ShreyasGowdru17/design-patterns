package com.designPattern.Builder.Hard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private String customerName;
    private Type roomType;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean breakfastIncluded;
    private boolean airportPickup;
    private Payment paymentDetails;
    private boolean extraBed;
    private List<String> specialRequests;

    private Booking(BookingBuilder bookingBuilder){
        this.breakfastIncluded= bookingBuilder.breakfastIncluded;
        this.airportPickup=bookingBuilder.airportPickup;
        this.paymentDetails= bookingBuilder.paymentDetails;
        this.checkInDate=bookingBuilder.checkInDate;
        this.checkOutDate=bookingBuilder.checkOutDate;
        this.customerName=bookingBuilder.customerName;
        this.roomType=bookingBuilder.roomType;
        this.extraBed=bookingBuilder.extraBed;
        this.specialRequests=bookingBuilder.specialRequests;
    }
    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }
    public boolean isAirportPickup() {
        return airportPickup;
    }
    public Payment getPaymentDetails() {
        return paymentDetails;
    }
    public Type getRoomType() {
        return roomType;
    }
    public String getCustomerName() {
        return customerName;
    }
    public LocalDate getCheckInDate() {
        return checkInDate;
    }
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
    public boolean isExtraBed() {
        return extraBed;
    }
    public List<String> getSpecialRequests() {
        return specialRequests;
    }

    public static class BookingBuilder{
        private String customerName;
        private Type roomType;
        private LocalDate checkInDate;
        private LocalDate checkOutDate;
        private boolean breakfastIncluded;
        private boolean airportPickup;
        private Payment paymentDetails;
        private boolean extraBed;
        private List<String> specialRequests;

        public BookingBuilder(String customerName, Type roomType, LocalDate checkInDate, LocalDate checkOutDate) {
            this.customerName = customerName;
            this.roomType = roomType;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        public BookingBuilder customerName(String customerName){
            this.customerName=customerName;
            return this;
        }
        public BookingBuilder breakfastIncluded(boolean breakfastIncluded){
            this.breakfastIncluded=breakfastIncluded;
            return this;
        }
        public BookingBuilder airportPickup(boolean airportPickup){
            this.airportPickup=airportPickup;
            return this;
        }
        public BookingBuilder paymentDetails(Payment paymentDetails){
            this.paymentDetails=paymentDetails;
            return this;
        }
        public BookingBuilder roomType(Type roomType){
            this.roomType=roomType;
            return this;
        }
        public BookingBuilder extraBed(boolean extraBed){
            if(this.roomType==Type.SINGLE && extraBed==true){
                throw new IllegalArgumentException("ExtraBed not available for single room");
            }
            this.extraBed=extraBed;
            return this;
        }
        public BookingBuilder checkInDate(LocalDate checkInDate){
            this.checkInDate=checkInDate;
            return this;
        }
        public BookingBuilder checkOutDate(LocalDate checkOutDate){
            if(checkOutDate.isBefore(this.checkInDate)){
                throw new IllegalArgumentException("CheckOut Date must be after CheckIn date");
            }
            this.checkOutDate=checkOutDate;
            return this;
        }
        public BookingBuilder specialRequests(List<String> requests){
            this.specialRequests=new ArrayList<>(requests);
            return this;
        }
        public Booking build(){
            return new Booking(this);
        }

        @Override
        public String toString() {
            return "BookingBuilder{" +
                    "customerName='" + customerName + '\'' +
                    ", roomType=" + roomType +
                    ", checkInDate=" + checkInDate +
                    ", checkOutDate=" + checkOutDate +
                    ", breakfastIncluded=" + breakfastIncluded +
                    ", airportPickup=" + airportPickup +
                    ", paymentDetails=" + paymentDetails +
                    ", extraBed=" + extraBed +
                    ", specialRequests=" + specialRequests +
                    '}';
        }
    }
}
