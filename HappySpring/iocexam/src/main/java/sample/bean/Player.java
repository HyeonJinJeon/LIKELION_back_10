package sample.bean;

import org.springframework.stereotype.Component;

//@Component
public class Player {
    private String name;
    private Dice dice; // 필드로 주입

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    } // 설정자로 주입

    public void play() {
        System.out.println(name + "는 주사위를 던져서 " + dice.getNumber() + "이 나왔습니다.");
    }
}