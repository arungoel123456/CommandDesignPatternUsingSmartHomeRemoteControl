package com.dto.withCommandDesignPattern;

public class RemoteControl {
    private Command currentCommand;

    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    public void pressButton() {
        currentCommand.execute();
    }

    public void pressUndo() {
        currentCommand.undo();
    }
}
