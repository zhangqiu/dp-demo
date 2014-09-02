package com.umpay.dp.factory.method;

public class Client
{
	/**
	 * 工厂方法模式。一个用于创建对象的接口。场景类(Client)不直接进行实例化，让子类(AbstractHumanFactory)决定实例化那个类。
	 * 
	 * 工厂方法使一个类的实例化，延迟到其子类，易于扩展。
	 * 
	 * 优点1：封装性较好。场景类想要一个对象，给个对象标示就好(比如类名)，不需知道具体创建过程(创建对象是有约束要求的)。降低了耦合
	 * 优点2：扩展性好。增加一个人种，只需增加一个XxxHuman类，稍微修改一下工厂类或扩展一个工厂类即可。
	 * 优点3：屏蔽了产品类。产品类的实现如何变化，场景类完全不关心(只关心接口)。比如JDBC从Oracle切换到MySQL只需改下驱动名。
	 * 优点4：典型的解耦框架。高层模块(场景类Client)只需知道产品(人种)的抽象类，其他的实现类完全不关心。符合迪米特、依赖倒置、里氏替换原则。
	 * 
	 * 使用场景1：需要new的地方。但要慎重的是，增加一个工厂类是否增加了代码的复杂度。 
	 * 使用场景2：需要灵活的、可扩展的框架。比如JDBC
	 * 使用场景3：异构项目，与非java语言的接口。由一个具体的工厂类进行管理，减少与外围系统耦合。
	 * 
	 * 扩展1：简单工厂(也叫静态工厂模式)。去掉AbstractHumanFactory，将HumanFactory的createHuman方法设置为静态。 缺点：扩展困难
	 * 扩展2：多个工厂类。产品(人种)比较多，且创建复杂时，单个工厂的体积会急速膨胀、复杂。
	 * 		可通过扩展工厂类(每个工厂类分别负责创建不同的产品)，来降低工厂类复杂度。
	 * 		场景类可自由选择使用哪个工厂类，且不再需要传递参数(类名)给工厂方法，因每个工厂类的职责很明确了。
	 * 		缺点：扩展性和可维护性降低了，增加一个产品类，就要增加一个工厂类。 
	 * 扩展3：替代“单例模式”。
	 * 扩展4：延迟初始化。一个对象被工厂创建后，不立刻释放，工厂类保持其初始状态，等待再次被使用。例如LazyInitHumanFactory.java
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		AbstractHumanFactory yinYangLu = new HumanFactory();

		System.out.println("----开始造人----");
		Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("----开始造人----");
		Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();

		System.out.println("----开始造人----");
		Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
