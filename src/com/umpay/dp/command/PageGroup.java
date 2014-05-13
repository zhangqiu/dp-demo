package com.umpay.dp.command;

public class PageGroup implements Group
{

	@Override
	public void find()
	{
		System.out.println("找到美工组...");
	}

	@Override
	public void add()
	{
		System.out.println("美工组增加一个页面...");
	}

	@Override
	public void delete()
	{
		System.out.println("美工组删除一个页面...");
	}

	@Override
	public void change()
	{
		System.out.println("美工组修改一个页面...");
	}

	@Override
	public void plan()
	{
		System.out.println("美工组给出页面变更计划...");
	}

	@Override
	public void rollBack()
	{
		System.out.println("美工组取消上一次操作...");
	}

}
