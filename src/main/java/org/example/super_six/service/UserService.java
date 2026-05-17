package org.example.super_six.service;

import lombok.Getter;

@Getter
public class UserService {
    private int userSticks;

    public void getInitialSticks(int i) {
        userSticks = i;
    }
    public void addStick() {
        userSticks ++;
    }

    public void restStick() {
        userSticks --;
    }

    public boolean hasSticks() {
        return userSticks > 0;
    }

}
