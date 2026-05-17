package org.example.super_six;

import org.example.super_six.model.Bowl;

import org.example.super_six.model.User;
import org.example.super_six.service.DiceService;
import org.example.super_six.service.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperSixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperSixApplication.class, args);

        GameService gameService = new GameService();

        gameService.playTurn();


    }

    // un usuario tira un dado
    // la tirada tiene que estar entre 1 y 6
    // con ese resultado pilla un palito y lo pone en el huevo del pote
    // se resta un palito al usuario
    // se suma un palito al hueco del pote
    //
}
