package com.umpay.dp.factory.multiple;

public class YellowHumanFactory extends AbstractHumanFactory
{

	@Override
	public Human createHuman()
	{
		return new YellowHuman();
	}

}
