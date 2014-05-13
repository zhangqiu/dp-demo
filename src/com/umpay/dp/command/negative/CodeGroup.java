package com.umpay.dp.command.negative;

public class CodeGroup implements Group
{

	@Override
	public void find()
	{
		System.out.println("找到开发组...");
	}

	@Override
	public void add()
	{
		System.out.println("开发组增加一个功能...");
	}

	@Override
	public void delete()
	{
		System.out.println("开发组删除一个功能...");
	}

	@Override
	public void change()
	{
		System.out.println("开发组修改一个功能...");
	}

	@Override
	public void plan()
	{
		System.out.println("开发组给代码出变更计划...");
	}

}
