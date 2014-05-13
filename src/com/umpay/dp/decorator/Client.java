package com.umpay.dp.decorator;

public class Client
{

	/**
	 * 装饰模式。就增加功能来说，装饰模式相比生成子类更为灵活。
	 * 
	 * SchoolReport是原始核心对象的抽象，是接口或抽象类，装饰模式中，这个必然有一个。FouthGradeSchoolReport是SchoolReport的实现，是要装饰的对象。
	 * 
	 * Decorator是装饰角色，一般是抽象类。它实现了原始对象的接口SchoolReport，它不一定有抽象方法，它的属性里必然有一个private变量指向抽象组件SchoolReport。
	 * 
	 * HighScoreDecorator和SortDecorator是具体装饰类。
	 * 
	 * 注意：原始方法和装饰方法的执行顺序在具体装饰类是固定的，如需多种执行顺序，可通过方法重载实现。
	 * 
	 * 优点1：只要核心抽象(SchoolReport)不变，装饰类和装饰类可独立发展，不会相互耦合。
	 * 优点2：装饰模式是继承关系的一个替代方案，是继承的有力补充。
	 * 优点3：装饰模式可以动态地扩展一个实现类的功能(不改变实现类)。继承不行，比如去掉reportSort装饰。
	 * 优点4：扩展性。比如，三个继承关系的类Father、Son、GrandSon，要在Son上增强一些功能怎么办？修改方法么？增加方法么？对GrandSon有影响怎么办？GrandSon有多个呢？
	 * 通过SonDecorator类来修饰Son，相当于创建了一个新的类，这个对原有程序没有变更，通过扩展很好地完成了这次变更。
	 * 
	 * 缺点：多层装饰比较复杂。尽量减少装饰类的数量，以便降低系统的复杂度。
	 * 
	 * 场景1：需扩展一个类的功能，或给一个类增加附加功能。
	 * 场景2：需动态的给一个对象增加功能，这些功能可以再动态地撤销。
	 * 场景3：需给一批的兄弟类进行改装或加装功能。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 原装成绩单
		SchoolReport sr = new FouthGradeSchoolReport();

		// 加最高分成绩单
		sr = new HighScoreDecorator(sr);

		// 加排名成绩单
		sr = new SortDecorator(sr);

		// 看成绩单
		sr.report();

		// 老爹很高兴，签名了。
		sr.sign("老三");
	}
}
