package com.umpay.dp.factory.multiple;

public class Client
{
	/**
	 * 多个工厂类。产品(人种)比较多，且创建复杂时，单个工厂的体积会急速膨胀、复杂。
	 * 可通过扩展工厂类(每个工厂类分别负责创建不同的产品)，来降低工厂类复杂度。
	 * 场景类可自由选择使用哪个工厂类，且不再需要传递参数(类名)给工厂方法，因每个工厂类的职责很明确了。
	 * 
	 * 缺点：扩展性和可维护性降低了，增加一个产品类，就要增加一个工厂类。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		AbstractHumanFactory whiteHumanFactory = new WhiteHumanFactory();
		AbstractHumanFactory yellowHumanFactory = new YellowHumanFactory();
		AbstractHumanFactory blackFactory = new BlackHumanFactory();

		System.out.println("----开始造人----");
		Human whiteHuman = whiteHumanFactory.createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("----开始造人----");
		Human blackHuman = blackFactory.createHuman();
		blackHuman.getColor();
		blackHuman.talk();

		System.out.println("----开始造人----");
		Human yellowHuman = yellowHumanFactory.createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
