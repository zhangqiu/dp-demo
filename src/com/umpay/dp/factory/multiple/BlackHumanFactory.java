package com.umpay.dp.factory.multiple;

public class BlackHumanFactory extends AbstractHumanFactory
{

	@Override
	public Human createHuman()
	{
		return new BlackHuman();
	}

}
