package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public void setName(String name) {
        this.name = name;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setMaxTemperature ( int maxTemperature){
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature ( int minTemperature){
        this.minTemperature = minTemperature;
    }

    public void setCurrentTemperature ( int currentTemperature){
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature--;
    }

    public int getCurrentTemperature () {
        return currentTemperature;
    }



}
