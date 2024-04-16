package com.example.day09;

public class ArrayCopyExam {
    public static void main(String[] args) {
        int[] sourceArray = {1,2,3,4,5};
        int[] destArray = new int[5];

        //destArray는 sourcArray의 복사본을 포함한다.
        System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);
    }
}
