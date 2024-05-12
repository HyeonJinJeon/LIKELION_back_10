package sample.bean;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class Game {
    private List<Player> list;

    //생성자로 주입
    public Game(List<Player> list){
        System.out.println("Game(LIst<Player>) 생성자 실행");
        this.list = list;
    }

    public Game() {
    }

    public List<Player> getList() {
        return list;
    }

    //설정자로 주입
    public void setPlayerList(List<Player> list) {
        this.list = list;
    }
    public void play() {
        for(Player player : list) {
            player.play();
        }
    }
}