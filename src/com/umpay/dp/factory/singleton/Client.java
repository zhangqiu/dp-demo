package com.umpay.dp.factory.singleton;

public class Client
{
	/**
	 * 替代“单例模式”。这是一个单例构造器，所有需要产生单例的类都遵循一定的规则(构造方法是private)，然后通过扩展该框架，
	 * 只要输入一个类型就可以获得唯一的一个实例。
	 * 
	 * 缺点：此框架是通过反射实现，其他类如果也这么做，就破坏了单例模式的初衷。这个问题只能通过章程和规范约束。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

		SingletonFactory.getSingleton().doSomething();
	}
}
