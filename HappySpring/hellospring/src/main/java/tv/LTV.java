package tv;

public class LTV implements TV{
    @Override
    public void powerOn(){
        System.out.println("STV 전원을 켭니다");
    }
    @Override
    public void powerOff(){
        System.out.println("STV 전원을 끕니다");
    }
    @Override
    public void soundOn(){
        System.out.println("STV 소리를 높입니다");
    }
    @Override
    public void soundOff(){
        System.out.println("STV 소리를 낮춥니다");
    }
}
