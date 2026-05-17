package org.example.super_six.model;

import lombok.Getter;

@Getter
public class UserSticks {
    private int userSticks;

    public UserSticks(int i) {
        this.userSticks = i;
    }

    public void addStick() {
        userSticks ++;
    }

    public void restStick() {
        userSticks --;
    }


}
