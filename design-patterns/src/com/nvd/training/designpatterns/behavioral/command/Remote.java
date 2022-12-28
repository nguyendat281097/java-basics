package com.nvd.training.designpatterns.behavioral.command;

public class Remote {
	private ICommand turnOnCommand;
	private ICommand turnOffCommand;
	
	public Remote(ICommand turnOnCommand, ICommand turnOffCommand) {
		this.turnOnCommand = turnOnCommand;
		this.turnOffCommand = turnOffCommand;
	}

	public void turnOnButtonClick() {
		turnOnCommand.execute();
	}
	
	public void turnOffButtonClick() {
		turnOffCommand.execute();
	}
}
