package org.example.super_six.service;

public class UserService {
    private int userSticks;

    public void addStick() {
        userSticks ++;
    }

    public void restStick() {
        userSticks --;
    }

    public void getInitialSticks(int i) {
        userSticks = 1;
    }
}
