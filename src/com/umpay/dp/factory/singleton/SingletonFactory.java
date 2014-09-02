package com.umpay.dp.factory.singleton;

import java.lang.reflect.Constructor;

@SuppressWarnings({"rawtypes", "unchecked"})
public class SingletonFactory
{

	private static Singleton singleton;

	static
	{
		try
		{
			Class cl = Class.forName(Singleton.class.getName());
			Constructor constructor = cl.getDeclaredConstructor();

			// ���ù��캯���ķ���Ȩ��
			constructor.setAccessible(true);

			singleton = (Singleton) constructor.newInstance(new Object[]{});
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static Singleton getSingleton()
	{
		return singleton;
	}
}
