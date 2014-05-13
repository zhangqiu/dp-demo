package com.umpay.dp.command;

public class CancelDeletePageCommand extends Command
{

	@Override
	public void execute()
	{
		super.pg.find();
		super.rg.rollBack();
		super.pg.rollBack();
		super.cg.rollBack();
	}

}
