package com.umpay.dp.singleton.extend;

public class Client
{
	/**
	 * 单例模式扩展。有上限的多例模式，可提高系统响应速度。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			Singleton.getSingleton().doSomething();
		}
	}
}
