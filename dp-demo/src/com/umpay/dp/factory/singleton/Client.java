package com.umpay.dp.factory.singleton;

public class Client
{
	/**
	 * ���������ģʽ��������һ��������������������Ҫ�����������඼��ѭһ���Ĺ���(���췽����private)��Ȼ��ͨ����չ�ÿ�ܣ�
	 * ֻҪ����һ�����;Ϳ��Ի��Ψһ��һ��ʵ����
	 * 
	 * ȱ�㣺�˿����ͨ������ʵ�֣����������Ҳ��ô�������ƻ��˵���ģʽ�ĳ��ԡ��������ֻ��ͨ���³̺͹淶Լ����
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

		SingletonFactory.getSingleton().doSomething();
	}
}
