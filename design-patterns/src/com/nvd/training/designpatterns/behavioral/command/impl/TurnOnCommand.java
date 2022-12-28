package com.nvd.training.designpatterns.behavioral.command.impl;

import com.nvd.training.designpatterns.behavioral.command.Fan;
import com.nvd.training.designpatterns.behavioral.command.ICommand;

public class TurnOnCommand implements ICommand {
	
	private Fan fan;
	
	public TurnOnCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.turnOn();
		
	}

	@Override
	public void undo() {
		fan.turnOff();
	}

}
