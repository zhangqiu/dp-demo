package com.umpay.dp.command.negative;

public class RequirementGroup implements Group
{

	@Override
	public void find()
	{
		System.out.println("�ҵ�������...");
	}

	@Override
	public void add()
	{
		System.out.println("����������һ������...");
	}

	@Override
	public void delete()
	{
		System.out.println("������ɾ��һ������...");
	}

	@Override
	public void change()
	{
		System.out.println("�������޸�һ������...");
	}

	@Override
	public void plan()
	{
		System.out.println("����������������ƻ�...");
	}

}
