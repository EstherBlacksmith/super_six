package org.example.super_six.service;

public class GameService {
    private DiceService diceService = new DiceService();
    private UserService userService = new UserService();
    private BowlService bowlService = new BowlService();

    public GameService(DiceService diceService, UserService userService, BowlService bowlService) {
        this.diceService = diceService;
        this.userService = userService;
        this.bowlService = bowlService;
    }

    public GameService() {
    }

    public void playTurn() {
        userService.getInitialSticks(7);
        int result = diceService.roll();

        if (result == 6) {
            userService.restStick();
        } else {
            userService.restStick();
            bowlService.addStick(result -1);
        }
    }
}
