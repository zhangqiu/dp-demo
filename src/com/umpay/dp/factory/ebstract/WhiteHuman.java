package com.umpay.dp.factory.ebstract;

public abstract class WhiteHuman implements Human
{

	@Override
	public void getColor()
	{
		System.out.println("白人的皮肤是白色的");
	}

	@Override
	public void talk()
	{
		System.out.println("白人说：Jls a jdklj lla sdjasdfsdf.");
	}

}
