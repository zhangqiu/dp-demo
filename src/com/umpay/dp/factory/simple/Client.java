package com.umpay.dp.factory.simple;

public class Client
{
	/**
	 * 简单工厂(也叫静态工厂模式)。去掉AbstractHumanFactory，将HumanFactory的createHuman方法设置为静态。
	 * 
	 * 缺点：扩展困难
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

		System.out.println("----开始造人----");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("----开始造人----");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();

		System.out.println("----开始造人----");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
