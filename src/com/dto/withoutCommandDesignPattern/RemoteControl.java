package com.dto.withoutCommandDesignPattern;

public class RemoteControl {
    private Light light;
    private Fan fan;

    public RemoteControl(Light light, Fan fan) {
        this.light = light;
        this.fan = fan;
    }

    public void pressLightOn() {
        light.turnOn();
    }

    public void pressLightOff() {
        light.turnOff();
    }

    public void pressFanStart() {
        fan.start();
    }

    public void pressFanStop() {
        fan.stop();
    }
}
