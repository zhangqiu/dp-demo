package com.umpay.dp.factory.ebstract;

public class FemaleFactory implements HumanFactory
{

	@Override
	public Human createBlackHuman()
	{
		return new FeMaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman()
	{
		return new FeMaleWhiteHuman();
	}

	@Override
	public Human createYellowHuman()
	{
		return new FeMaleYellowHuman();
	}

}
