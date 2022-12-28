package com.nvd.training.designpatterns.behavioral.command;

import com.nvd.training.designpatterns.behavioral.command.impl.TurnOffCommand;
import com.nvd.training.designpatterns.behavioral.command.impl.TurnOnCommand;

public class TestCommand {
	public static void main(String[] args) {
		Fan fan = new Fan();
		
		Remote remote = new Remote(new TurnOnCommand(fan), new TurnOffCommand(fan));
		
		remote.turnOnButtonClick();
		remote.turnOffButtonClick();
		
	}
}
