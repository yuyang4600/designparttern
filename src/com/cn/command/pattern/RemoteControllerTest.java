package com.cn.command.pattern;

public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteController remote = new SimpleRemoteController();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
