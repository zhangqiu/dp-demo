package com.umpay.dp.command.negative;

public class Invoker
{

	private String command;

	public void setCommand(String command)
	{
		this.command = command;
	}

	public void action()
	{
		// ½âÎöÃüÁî
		if ("add requirement".equals(command))
		{
			Group rg = new RequirementGroup();
			rg.find();
			rg.add();
			rg.plan();
		}
		else if ("delete page".equals(command))
		{
			Group pg = new PageGroup();
			pg.find();
			pg.delete();
			pg.plan();
		}
	}
}
