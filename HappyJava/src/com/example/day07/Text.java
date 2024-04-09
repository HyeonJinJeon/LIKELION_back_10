package com.example.day07;

public class Text {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.getName();
//        System.out.println(name);
        System.out.println(child);

        Product pen = new Product("검정펜", 3000);
//        pen.getTitle();
//        pen.getPrice();

        System.out.println(pen);

        Product pen2 = new Product("검정펜", 2950);
        if(pen == pen2) {
            System.out.println("같아요");
        }else {
            System.out.println("달라요");
        }

        if(pen.equals(pen2)) {
            System.out.println("같아요");
        }else {
            System.out.println("달라요");
        }
    }
}
