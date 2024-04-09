package com.example.day07;

public class InterfaceDemo {
    public static void main(String[] args) {
        //인터페이스도 타입이다.
        Ainter ainter = new DImpl(); //Ainter가 제공해주는 범위만 사용 가능
        Cinter cinter = new DImpl(); //Cinter가 제공해주는 범위만 사용 가능

        //자기가 정의한 것만 사용 가능
        ainter.aMethod();
        cinter.cMethod();

        Binter binter = new DImpl();
        Dinter dinter = new DImpl();

        binter.bMethod();
        binter.aMethod();
        binter.same();
        dinter.aMethod();
        dinter.bMethod();
        dinter.cMethod();
        dinter.dMethod();
        dinter.same();

        Ainter a = new AImpl();
        ((AImpl)a).say(); // 타입이 아는 것 싸지만 쓸 수 있고, 외의 것을 쓰고 싶다면 형변환이 필요!!
    }
}
