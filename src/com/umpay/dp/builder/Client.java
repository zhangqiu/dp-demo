package com.umpay.dp.builder;

public class Client
{
	/**
	 * 建造者模式。将一个复杂对象的构建与它的表示(啥意思？)分离，使得同样的构建过程可以创建不同的表示。
	 * 
	 * Director.java，导演类，用于封装。避免高层模块深入到建造者内部的实现类。可有多个。
	 * CarModel.java，抽象产品类，通常是一个原型模式。
	 * CarBuilder.java，抽象建造者。
	 * BMWBuilder.java/BenzBuilder.java，具体建造者，一个具体建造者对应一个产品(BenzModel.java)。
	 * 
	 * 优点1：封装性，使用建造者模式可以使场景类(或高层模块)不必知道产品内部组成的细节。
	 * 优点2：建造者独立(BMWBuilder.java和BenzBuilder.java)，容易扩展。
	 * 优点3：便于控制细节风险。可以对每个具体建造者的细节进行细化，不用担心影响其他模块。
	 * 
	 * 使用场景1：相同的方法，不同的执行顺序，产生不同的结果。
	 * 使用场景2：多个部件或零件，都可装配到一个对象中，但运行结果不同。
	 * 使用场景3：产品类非常复杂。
	 * 
	 * 注意事项1：建造者重点关注“如何组装零件，如何安排基本方法的调用顺序”，这是它与工厂模式最大的不同，工厂模式关注的是如何创建零件。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Director director = new Director();

		System.out.println("---造个A型奔驰---");
		director.getABenzModel().run();

		System.out.println("---造个B型奔驰---");
		director.getBBenzModel().run();

		System.out.println("---造个C型宝马---");
		director.getCBMWModel().run();

		System.out.println("---造个D型宝马---");
		director.getDBMWModel().run();
	}
}
