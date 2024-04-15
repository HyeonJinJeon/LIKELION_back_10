package com.example.day10;

public class GenericMethodExam {
    public static <T extends Number> void printArrayElements(T[] array){
        for(T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] iarray = {1,2,3,4,5,6};
        printArrayElements(iarray);

        Double[] doubleArray = {1.1, 2.3, 12.5, 17.3};
        printArrayElements(doubleArray);

//        String[] strArray = {"hello", "world", "jeon", "hahaha"};
//        printArrayElements(strArray);
    }
}
