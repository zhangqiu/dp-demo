package com.umpay.dp.builder;

public class Client
{
	/**
	 * 建造者模式。
	 * 
	 * GitHub上传测试。
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
