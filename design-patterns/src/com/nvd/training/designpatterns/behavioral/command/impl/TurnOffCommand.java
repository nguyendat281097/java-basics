package com.nvd.training.designpatterns.behavioral.command.impl;

import com.nvd.training.designpatterns.behavioral.command.Fan;
import com.nvd.training.designpatterns.behavioral.command.ICommand;

public class TurnOffCommand implements ICommand {
	
	private Fan fan;

	public TurnOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.turnOff();
		
	}

	@Override
	public void undo() {
		fan.turnOn();
	}

}
