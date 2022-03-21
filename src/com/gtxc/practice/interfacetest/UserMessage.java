package com.gtxc.practice.interfacetest;

/*
    Created by gt at 2:45 PM on Friday, March 04, 2022.
    Project: practice, Package: com.gtxc.practice.interfacetest.
*/

public class UserMessage implements CommonInterface {
    @Override
    public void getMessage(String message) {
        System.out.println("This message is from UserMessage: " + message);
    }
}
