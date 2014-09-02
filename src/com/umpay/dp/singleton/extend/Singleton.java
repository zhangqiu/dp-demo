package com.umpay.dp.singleton.extend;

import java.util.ArrayList;
import java.util.Random;

public class Singleton
{
	private final static int MAX_COUNT = 3;

	private final static ArrayList<Singleton> singletonList = new ArrayList<Singleton>();

	private String name;

	static
	{
		for (int i = 0; i < MAX_COUNT; i++)
		{
			singletonList.add(new Singleton("ÀÏ" + i));
		}
	}

	private Singleton(String name) {
		this.name = name;
	}

	public static Singleton getSingleton()
	{
		Random random = new Random();
		return singletonList.get(random.nextInt(MAX_COUNT));
	}

	public void doSomething()
	{
		System.out.println("ÎÒÊÇ" + name);
	}
}
