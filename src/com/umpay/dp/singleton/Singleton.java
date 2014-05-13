package com.umpay.dp.singleton;

public class Singleton
{

	// 饿汉式单例
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	// 该方法获取实例
	public static Singleton getSingleton()
	{
		return singleton;
	}

	// 懒汉式单例，注意线程安全
	public synchronized static Singleton getLazySingleton()
	{
		if (singleton == null)
		{
			singleton = new Singleton();
		}

		return singleton;
	}

	public void doSomething()
	{

	}
}
