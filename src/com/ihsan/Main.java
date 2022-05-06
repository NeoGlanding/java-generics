package com.ihsan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Printer a = new Printer<String>("Jackson");
        Printer b = new Printer<Long>((long)2020.0);
        a.print();
        b.print();
    }
}
