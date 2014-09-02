package com.umpay.dp.command;

public class Invoker
{

	private Command command;

	public void setCommand(Command command)
	{
		this.command = command;
	}

	public void action()
	{
		System.out.println("-------------------------------------");
		command.execute();
	}
}
