package com.umpay.dp.factory.ebstract;

public class MaleFactory implements HumanFactory
{

	@Override
	public Human createBlackHuman()
	{
		return new MaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman()
	{
		return new MaleWhiteHuman();
	}

	@Override
	public Human createYellowHuman()
	{
		return new MaleYellowHuman();
	}

}
