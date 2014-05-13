package com.umpay.dp.command;

public class DeletePageCommand extends Command
{

	@Override
	public void execute()
	{
		// 找到美工组
		super.pg.find();
		
		//先删除需求
		super.rg.delete();

		// 删除一个页面
		super.pg.delete();
		
		// 删除页面功能
		super.cg.delete();

		// 美工组给出计划
		super.rg.plan();
	}

}
