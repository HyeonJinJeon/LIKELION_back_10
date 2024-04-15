package com.example.day10;

public class IntegerContainer implements Container<Integer>{
    private int value;
    @Override
    public void set(Integer value) {
        this.value= value;
    }

    @Override
    public Integer get() {
        return value;
    }
}
