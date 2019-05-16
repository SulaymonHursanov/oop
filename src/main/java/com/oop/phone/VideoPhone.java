package com.oop.phone;

public class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Connecting video channel for user " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println(" Someone ringing you "+ inputNumber);
    }
}
