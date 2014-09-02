package com.umpay.dp.command.negative;

public class RequirementGroup implements Group
{

	@Override
	public void find()
	{
		System.out.println("找到需求组...");
	}

	@Override
	public void add()
	{
		System.out.println("需求组增加一个需求...");
	}

	@Override
	public void delete()
	{
		System.out.println("需求组删除一个需求...");
	}

	@Override
	public void change()
	{
		System.out.println("需求组修改一个需求...");
	}

	@Override
	public void plan()
	{
		System.out.println("需求组给出需求变更计划...");
	}

}
