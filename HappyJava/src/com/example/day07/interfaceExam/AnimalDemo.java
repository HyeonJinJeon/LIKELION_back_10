package com.example.day07.interfaceExam;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        pet dog2 = new Dog();
        pet cat2 = new Cat();

        dog.speak();
        cat.speak();

        dog2.speak();
        cat2.speak();
        dog2.walk();
        cat2.walk();
    }
}
