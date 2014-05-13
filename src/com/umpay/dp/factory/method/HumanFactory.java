package com.umpay.dp.factory.method;

@SuppressWarnings("unchecked")
public class HumanFactory extends AbstractHumanFactory
{

	@Override
	public <T extends Human> T createHuman(Class<T> c)
	{
		Human human = null;

		try
		{
			human = (Human) Class.forName(c.getName()).newInstance();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return (T) human;
	}
}
