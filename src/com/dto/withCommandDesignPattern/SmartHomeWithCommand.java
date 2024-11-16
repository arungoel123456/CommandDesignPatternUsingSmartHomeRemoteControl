package com.dto.withCommandDesignPattern;

public class SmartHomeWithCommand {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanStart = new FanStartCommand(fan);
        Command fanStop = new FanStopCommand(fan);

        RemoteControl remote = new RemoteControl();

        // Light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Fan Start
        remote.setCommand(fanStart);
        remote.pressButton();

        // Undo Fan Start
        remote.pressUndo();

        // Light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
