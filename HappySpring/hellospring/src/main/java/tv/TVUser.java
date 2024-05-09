package tv;

public class TVUser {
    public static void main(String[] args) {
//        STV tv = new STV();
//        tv.soundOn();
//        tv.powerOff();
//        tv.soundOn();
//        tv.soundOff();

//        LTV tv = new LTV();
//        tv.turnOn();
//        tv.turnOff();
//        tv.volumeOn();
//        tv.volumeOff();

        //만약 STV가 망가져서 LTV로 바꿔야한다면 LTV의 메소드 이름이 다 다르기 떄문에 유저의 코드가 모두 교체가 되어야된다.
        //(즉, STV와 TVUser간의 결합도가 높다.)

        //따라서!!!!!! 인터페이스가 필요하다!!!!!
        //TV라는 인터페이스를 생성
        // STV와 LTV는 TV를 구현한다.  -->  이는 결합도를 떨어뜨린다!!
        //메소드는 그래도 사용할 수 있지만 TV의 객체 생성 코드를 바꿔야하는 점이 불편하다.
//        TV tv = new STV();
//        TV tv = new LTV();
        //이를 해결하고자 TVFactory 클래스를 생성하였다.
        TV tv = TVFactory.getTV(args[0]);
        tv.powerOn();
        tv.powerOff();
        tv.soundOn();
        tv.soundOff();
        //이로써 결합도가 낮아졌으며 제어의 역전이 일어났다.

        //제어의 역전(IOC)이란???
        //프로그램의 흐름을 개발자가 아닌 프레임워크가 관리
        //즉, 개발자는 비지니스 로직에 더 집중할 수 있다.
        //결합도 down, 유연성 up

        //의존성 주입(DI)이란?
        // 객체간의 의존성을 외부에서 주입
        //객체로 필요하는 의존객체를 직접 생성 X
        //외부에서 생성된 객체를 주입 받음
        //즉, 클래스 사이의 의존관계를 빈(Bean)설정 정보를 바탕으로 컨테이너가 자동으로 연결해주는 것을 말한다
        //    종류
        //    - 필드 주입: @Autowired 사용
        //
        //    - Setter 주입
        //
        //    - 생성자 주입

    }
}
