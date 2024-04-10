package com.example.day07.interfaceExam;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        pet dog2 = new Dog();
        pet cat2 = new Cat();

        //Animal 인터페이스에서 정의되고 Dog, Cat 클래스에서 정의된
        dog.speak();
        cat.speak();

        //Animal 인터페이스에서 구현된 default 메소드
        dog.song();
        cat.song();

/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
        //Animal 인터페이스에서 정의되고 Dog, Cat 클래스에서 정의된
        dog2.speak();
        cat2.speak();

        //Pet 인터페이스에서 구현된 default 메소드
        dog2.walk();
        cat2.walk();

        //Animal 인터페이스에서 구현된 default 메소드
        dog2.song();
        cat2.song();

        System.out.println(dog.age);
        System.out.println(Animal.age);// 인테페이스의 변수는 상수로 보기 떼문에 사용이 가능
    }
}
