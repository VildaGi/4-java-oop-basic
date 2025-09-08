package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(int h, int m, int s){
        seconds = s % 60;
        minutes = (m + s / 60) % 60;
        hours = (h + (m + s / 60) / 60);
    }

    public void setHours(int hours) {this.hours = hours;}
    public void setMinutes(int minutes) {this.minutes = minutes;}
    public void setSeconds(int seconds) {this.seconds = seconds;}
    public int getHours() {return hours;}
    public int getMinutes() {return minutes;}
    public int getSeconds() {return seconds;}

    void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
    }

    void subtract(TimeSpan time){
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
    }

    public String toString(){
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
