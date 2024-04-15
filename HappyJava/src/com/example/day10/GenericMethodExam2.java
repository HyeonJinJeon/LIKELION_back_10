package com.example.day10;
//제네릭

public class GenericMethodExam2 {
    public static <T extends Number> T max(T x, T y, T z){
        T max = x;
        if(y.doubleValue() > max.doubleValue()){
            max = y;
        }
        if(z.doubleValue() > max.doubleValue()){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(3,5,17));
        System.out.println(max(3.4, 2.3, 7.4));
//        System.out.println(max("aa","bb","cc"));  컴파일 에러 발생!!
    }
}
