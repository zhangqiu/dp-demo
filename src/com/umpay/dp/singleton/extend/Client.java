package com.umpay.dp.singleton.extend;

public class Client
{
	/**
	 * ����ģʽ��չ�������޵Ķ���ģʽ�������ϵͳ��Ӧ�ٶȡ�
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			Singleton.getSingleton().doSomething();
		}
	}
}
