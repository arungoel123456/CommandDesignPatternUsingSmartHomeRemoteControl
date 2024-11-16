package com.dto.withoutCommandDesignPattern;

public class SmartHomeWithoutCommand {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        RemoteControl remote = new RemoteControl(light, fan);

        remote.pressLightOn();
        remote.pressFanStart();
        remote.pressFanStop();
        remote.pressLightOff();
    }
}