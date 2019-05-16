package com.oop.phone;

public abstract class WirelessPhone extends AbstractPhone {
    private int hour;

    public WirelessPhone(int year, int hour){
        super(year);
        this.hour = hour;
    }

}
