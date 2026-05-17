package org.example.super_six;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperSixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperSixApplication.class, args);
        RollDice rollDice = new RollDice();
        System.out.println( rollDice.getOutcome());
        UserSticks userSticks =  new UserSticks(2);
        System.out.println( userSticks.getTotalSticks());
        userSticks.addStick();
        System.out.println( userSticks.getTotalSticks());
        userSticks.restStick();
        userSticks.restStick();
        System.out.println( userSticks.getTotalSticks());
        System.out.println("________");
        BowlHoleSticks bowlHoleSticks = new BowlHoleSticks();
        bowlHoleSticks.getTotalHoleSticks();
        System.out.println("________");

        bowlHoleSticks.addStick(1);
        bowlHoleSticks.addStick(3);
        bowlHoleSticks.getTotalHoleSticks();
        bowlHoleSticks.restStick(3);
        System.out.println("________");
        bowlHoleSticks.getTotalHoleSticks();



    }

    // un usuario tira un dado
    // la tirada tiene que estar entre 1 y 6
    // con ese resultado pilla un palito y lo pone en el huevo del pote
    // se resta un palito al usuario
    // se suma un palito al hueco del pote
    //
}
