package com.rdkv.cwdemo.message;


public class LocalDateReference {
    private int hour;
    private int minute;
    private int seconds;
    private int nanos;

    private String day;
    private int date;
    private String month;
    private int year;

    public LocalDateReference(int hour, int minute, int seconds, int nanos, String day, int date, String month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
        this.nanos = nanos;
        this.day = day;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getNanos() {
        return nanos;
    }

    public void setNanos(int nanos) {
        this.nanos = nanos;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}