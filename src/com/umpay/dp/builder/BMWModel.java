package com.umpay.dp.builder;

public class BMWModel extends CarModel
{

	@Override
	public void start()
	{
		System.out.println("宝马跑起来啦。。。");
	}

	@Override
	public void stop()
	{
		System.out.println("宝马踩刹车啦。。。");
	}

	@Override
	public void alarm()
	{
		System.out.println("宝马按喇叭啦。。。");
	}

	@Override
	public void engineBoom()
	{
		System.out.println("宝马启动引擎啦。。。");
	}

}
