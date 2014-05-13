package com.umpay.dp.factory.ebstract;

public class Client
{
	/**
	 * 抽象工厂。为创建一组相关或相互依赖的对象提供一个接口，且无需指定他们具体的类。
	 * 
	 * 是工厂方法模式的升级版本，在有多个业务品种、业务分类时，通过抽象工厂模式产生需要的对象是一种非常好的解决方式。
	 * 
	 * 优点1：封装性。同工厂方法模式
	 * 优点2：产品族内的约束为非公开状态。例如男女比例问题，可在工厂(以人种为维度的工厂WhiteHumanFactory)内部控制，不需场景类知道。
	 * 
	 * 缺点：产品族(人种)扩展困难(性别很容易扩展)。增加一个人种，HumanFactory要增加一个函数，然后两个实现类都要修改。严重违反开闭原则。
	 * 
	 * 使用场景：一个对象族。例如：windows和linux操作系统下的文本编辑器、图片编辑器。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		MaleFactory maleFactory = new MaleFactory();

		System.out.println("----开始造人----");
		Human human1 = maleFactory.createBlackHuman();
		human1.getColor();
		human1.talk();
		human1.getSex();

		System.out.println("----开始造人----");
		Human human2 = maleFactory.createWhiteHuman();
		human2.getColor();
		human2.talk();
		human2.getSex();

		System.out.println("----开始造人----");
		Human human3 = maleFactory.createYellowHuman();
		human3.getColor();
		human3.talk();
		human3.getSex();
		

		FemaleFactory feMaleFactory = new FemaleFactory();
		
		System.out.println("----开始造人----");
		Human human4 = feMaleFactory.createBlackHuman();
		human4.getColor();
		human4.talk();
		human4.getSex();

		System.out.println("----开始造人----");
		Human human5 = feMaleFactory.createWhiteHuman();
		human5.getColor();
		human5.talk();
		human5.getSex();

		System.out.println("----开始造人----");
		Human human6 = feMaleFactory.createYellowHuman();
		human6.getColor();
		human6.talk();
		human6.getSex();
	}
}
