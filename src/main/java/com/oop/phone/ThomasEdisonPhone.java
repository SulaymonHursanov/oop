package com.oop.phone;

public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year){
        super(year);
    }

    @Override
    public void call (int outputNumber){
        System.out.println("Rotate the knob");
        System.out.println("Call user number");
    }

    @Override
    public void ring( int inputNumber){
        System.out.println("phone ringing");
    }
}
