package org.example.super_six.model;

import lombok.Getter;

@Getter
public class User {
    private int userSticks;

    public User(int i) {
        this.userSticks = i;
    }

    public void addStick() {
        userSticks ++;
    }

    public void restStick() {
        userSticks --;
    }


}
