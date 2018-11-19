package com.Sirenko;

public class TimeSpan {

    private int hours;
    private int minutes;
    private double times;

    public TimeSpan(int hours, int minutes) {
        // minutes < 60
        if (minutes >= 60) {
            throw new IllegalArgumentException("Введите число меньше 60");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        hours += timeSpan.hours;
        minutes += timeSpan.minutes;
        if (minutes >= 60) {
            hours++;
            minutes = minutes % 60;
        }
    }

    public void sub(TimeSpan timeSpan) {
        hours -= timeSpan.hours;
        minutes -= timeSpan.minutes;
        if (minutes >= 60) {
            hours--;
            minutes = minutes % 60;
        }
    }

    public void mult(double times) {
        hours = hours * (int) times + ((minutes * (int) times) / 60);
        minutes = minutes * (int) times % 60;
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                hours + ":" + minutes +
                '}';
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getTimes() {
        return times;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setTimes(double times) {
        this.times = times;
    }
}