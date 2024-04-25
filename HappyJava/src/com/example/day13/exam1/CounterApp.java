package com.example.day13.exam1;

public class CounterApp {

    public static void main(String[] args) {
        Thread incrementCounter = new Thread(new IncrementCounter());
        Thread decrementCounter = new Thread(new DecrementCounter());

        incrementCounter.start();
        decrementCounter.start();
    }

}
