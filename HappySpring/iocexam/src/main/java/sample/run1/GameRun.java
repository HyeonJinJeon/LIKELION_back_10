package sample.run1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.Game;
import sample.config.BookConfig;
import sample.config.GameConfig;

import java.lang.annotation.Annotation;

public class GameRun {
    public static void main(String[] args) {
        System.out.println("공장생성전");
        ApplicationContext ac = new AnnotationConfigApplicationContext(GameConfig.class);
        System.out.println("공장생성후");

        Game game = ac.getBean("game", Game.class);
        game.play();
    }
}
