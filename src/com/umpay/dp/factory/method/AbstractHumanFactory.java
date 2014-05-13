package com.umpay.dp.factory.method;

public abstract class AbstractHumanFactory
{
	// 工厂方法
	public abstract <T extends Human> T createHuman(Class<T> c);
}
