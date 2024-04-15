package com.example.day10.box;

public class Box <T>{
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box containing : " + content;
    }

    public static void main(String[] args) {
        Box box = new Box("하이");
        System.out.println(box.toString());
    }
}
