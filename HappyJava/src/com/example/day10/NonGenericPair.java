package com.example.day10;
//제네릭

public class NonGenericPair {
    private Object first;
    private Object second;

    public NonGenericPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public static void main(String[] args) {
        NonGenericPair nonGenericPair = new NonGenericPair("Hello", 5);
        String first = (String)nonGenericPair.getFirst();
        int second = (Integer)nonGenericPair.getSecond();

        NonGenericPair nonGenericPair2 = new NonGenericPair(1.2, "안녕");
        double firstDouble = (double)nonGenericPair2.getFirst();
        String seconString = (String)nonGenericPair2.getSecond();
    }
}
