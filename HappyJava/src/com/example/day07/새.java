package com.example.day07;

abstract public class 새 {
    //기능의 표준화
    //강제성(반드시 구현해야함..)
    abstract public void 노래하다();
    //속성
    //기능
    //먹다, 날다, 걷다

}

class 참새 extends 새{
    @Override
    public void 노래하다() {
        System.out.println("짹");
    }
}
class 까마귀 extends 새{
    @Override
    public void 노래하다() {
        System.out.println("까악");
    }
}
class 비둘기 extends 새{
    @Override
    public void 노래하다() {
        System.out.println("구구");
    }
}
abstract class 앵무새 extends 새{
//    @Override
//    public void 노래하다() {
//        System.out.println("안녕");
//    }
    abstract public void 말하다();
}

class 빨간앵무새 extends 앵무새 {
    @Override
    public void 노래하다() {

    }

    @Override
    public void 말하다() {

    }
}
