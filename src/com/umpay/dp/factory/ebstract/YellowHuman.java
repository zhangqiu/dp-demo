package com.umpay.dp.factory.ebstract;

public abstract class YellowHuman implements Human
{

	@Override
	public void getColor()
	{
		System.out.println("�����˵�Ƥ���ǻ�ɫ��");
	}

	@Override
	public void talk()
	{
		System.out.println("������˵����˵��ͨ��");
	}

}
