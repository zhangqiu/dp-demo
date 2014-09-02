package com.umpay.dp.factory.multiple;

public class WhiteHumanFactory extends AbstractHumanFactory
{

	@Override
	public Human createHuman()
	{
		return new WhiteHuman();
	}

}
