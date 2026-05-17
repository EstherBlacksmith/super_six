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

    public void initGame(){
        userService.getInitialSticks(7);
    }

    public boolean hasSticks() {
        return userService.hasSticks();
    }

    public int getUserSticks() {
        return userService.getUserSticks();
    }

    public void playTurn() {
        int result = diceService.roll();

        if (result == 6) {
            userService.restStick();
        } else {
           if( bowlService.areAnStickInTheHole(result -1)){
               userService.addStick();
               bowlService.restStick(result -1);
           }else{
               userService.restStick();
               bowlService.addStick(result -1);
           }
        }
    }
}
