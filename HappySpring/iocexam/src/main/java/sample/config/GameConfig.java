package sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;
import sample.bean.Dice;
import sample.bean.Game;
import sample.bean.Player;

import java.util.List;

@ComponentScan(basePackages = "sample")
@PropertySource({"classpath:game.properties"})
public class GameConfig {

    @Bean
    public Dice dice(@Value("${face}") int face) {
        return new Dice(face);
    }

    @Bean
    public Player yujin(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("전현진");
        return player;
    }
    @Bean
    public Player jungwoo(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("홍길동");
        return player;
    }
    @Bean
    public Player doyoung(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("신짱구");
        return player;
    }
    @Bean
    public Player jaehyun(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("김철수");
        return player;
    }

    //생성자로 하겠다
    @Bean
    public Game game(List<Player> players) {
        return new Game(players);
    }
}