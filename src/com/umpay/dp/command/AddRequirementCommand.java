package com.umpay.dp.command;

public class AddRequirementCommand extends Command
{

	@Override
	public void execute()
	{
		// 找到需求组
		super.rg.find();

		// 增加一个需求
		super.rg.add();
		
		//美工增加一个页面
		super.pg.add();
		
		//程序猿开发
		super.cg.add();

		// 需求组给出计划
		super.rg.plan();
	}

}
