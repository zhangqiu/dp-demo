package com.umpay.dp.builder;

public class Client
{
	/**
	 * ������ģʽ����һ�����Ӷ���Ĺ��������ı�ʾ(ɶ��˼��)���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
	 * 
	 * Director.java�������࣬���ڷ�װ������߲�ģ�����뵽�������ڲ���ʵ���ࡣ���ж����
	 * CarModel.java�������Ʒ�࣬ͨ����һ��ԭ��ģʽ��
	 * CarBuilder.java���������ߡ�
	 * BMWBuilder.java/BenzBuilder.java�����彨���ߣ�һ�����彨���߶�Ӧһ����Ʒ(BenzModel.java)��
	 * 
	 * �ŵ�1����װ�ԣ�ʹ�ý�����ģʽ����ʹ������(��߲�ģ��)����֪����Ʒ�ڲ���ɵ�ϸ�ڡ�
	 * �ŵ�2�������߶���(BMWBuilder.java��BenzBuilder.java)��������չ��
	 * �ŵ�3�����ڿ���ϸ�ڷ��ա����Զ�ÿ�����彨���ߵ�ϸ�ڽ���ϸ�������õ���Ӱ������ģ�顣
	 * 
	 * ʹ�ó���1����ͬ�ķ�������ͬ��ִ��˳�򣬲�����ͬ�Ľ����
	 * ʹ�ó���2��������������������װ�䵽һ�������У������н����ͬ��
	 * ʹ�ó���3����Ʒ��ǳ����ӡ�
	 * 
	 * ע������1���������ص��ע�������װ�������ΰ��Ż��������ĵ���˳�򡱣��������빤��ģʽ���Ĳ�ͬ������ģʽ��ע������δ��������
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
