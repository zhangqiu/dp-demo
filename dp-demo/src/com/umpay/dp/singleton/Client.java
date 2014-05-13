package com.umpay.dp.singleton;

public class Client
{

	/**
	 * 单例模式。
	 * 
	 * 优点1：内存中就一个，减少内存(创建、销毁、存储)开支。
	 * 优点2：减少其他依赖对象的资源消耗。
	 * 优点3：避免对资源(文件等)的多重占用。
	 * 优点4：可设置全局的访问点，优化和共享资源访问。
	 * 
	 * 缺点1：因只能“自行实例化”，没有接口，扩展很难。除了修改代码，没别的办法。
	 * 缺点2：对测试不利。并行开发环境中，如果单例类没有完成，不能测试。没有接口，不能使用Mock的方式虚拟一个对象。
	 * 缺点3：单例模式与单一职责原则有冲突。单例模式把“要单例”和业务逻辑融合在了一起。
	 * 
	 * 使用场景1：生成唯一序列号
	 * 使用场景2：需要一个共享访问点和共享数据。
	 * 使用场景3：创建一个对象需要消耗的资源过多，如要访问I/O和数据库等资源。
	 * 使用场景4：需要定义大量的静态常量和静态方法的环境(工具类)(也可直接声明static)。
	 * 
	 * 注意事项1：长久不用的对象，会被回收。<<<---这种说法不对
	 * 注意事项2：高并发时，注意线程安全。
	 * 注意事项3：不要实现Cloneable接口。clone()方法不执行构造函数，所以即使是用private修饰构造函数的对象，也是可以被复制的。
	 * 
	 * 使用场景1：Spring的Bean默认是单例，Spring容器管理Bean的生命周期。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Singleton.getSingleton().doSomething();
	}
}
