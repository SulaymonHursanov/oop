package com.oop.phone;

public class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Calling number " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Someone calling you by number "+ inputNumber);
    }
}
