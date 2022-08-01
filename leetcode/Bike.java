package com.priyanshu;

public class Bike {
    protected int gear;
    protected int speed;

    public Bike(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public void applyBrake(int increment) {
        speed -= increment;
    }
}
