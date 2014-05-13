package com.umpay.dp.factory.simple;

public class HumanFactory
{
	@SuppressWarnings("unchecked")
	public static <T extends Human> T createHuman(Class<T> c)
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
