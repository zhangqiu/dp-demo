package com.umpay.dp.factory.method;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class LazyInitHumanFactory extends AbstractHumanFactory
{

	private final static Map<Class<? extends Human>, Human> map = new HashMap<Class<? extends Human>, Human>();

	@Override
	public <T extends Human> T createHuman(Class<T> c)
	{
		Human human = map.get(c);

		if (human == null)
		{
			try
			{
				human = (Human) Class.forName(c.getName()).newInstance();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			map.put(c, human);
		}
		return (T) human;
	}

}