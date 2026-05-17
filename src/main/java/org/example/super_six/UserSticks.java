package org.example.super_six;
public class UserSticks {
    private int userSticks;

    public UserSticks(int i) {
    }

    public int getTotalSticks() {
        return userSticks;
    }

    public void addStick() {
        userSticks ++;
    }

    public void restStick() {
        userSticks --;
    }


}
