package com.umpay.dp.factory.ebstract;

public abstract class YellowHuman implements Human
{

	@Override
	public void getColor()
	{
		System.out.println("黄种人的皮肤是黄色的");
	}

	@Override
	public void talk()
	{
		System.out.println("黄种人说：我说普通话");
	}

}
