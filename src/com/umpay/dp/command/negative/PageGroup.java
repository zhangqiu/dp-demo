package com.umpay.dp.command.negative;

public class PageGroup implements Group
{

	@Override
	public void find()
	{
		System.out.println("�ҵ�������...");
	}

	@Override
	public void add()
	{
		System.out.println("����������һ��ҳ��...");
	}

	@Override
	public void delete()
	{
		System.out.println("������ɾ��һ��ҳ��...");
	}

	@Override
	public void change()
	{
		System.out.println("�������޸�һ��ҳ��...");
	}

	@Override
	public void plan()
	{
		System.out.println("���������ҳ�����ƻ�...");
	}

}
