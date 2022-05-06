package com.ihsan;


public class Printer <T> {
    private T thingsToPrint;

    public Printer(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print() {
        System.out.println("Printed: " + thingsToPrint);
    }
}
