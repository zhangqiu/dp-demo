package com.umpay.dp.builder;

public class Client
{
	/**
	 * ������ģʽ��
	 * 
	 * GitHub�ϴ����ԡ�
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Director director = new Director();

		System.out.println("---���A�ͱ���---");
		director.getABenzModel().run();

		System.out.println("---���B�ͱ���---");
		director.getBBenzModel().run();

		System.out.println("---���C�ͱ���---");
		director.getCBMWModel().run();

		System.out.println("---���D�ͱ���---");
		director.getDBMWModel().run();
	}
}
