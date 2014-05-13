package com.umpay.dp.singleton;

public class Singleton
{

	// ����ʽ����
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	// �÷�����ȡʵ��
	public static Singleton getSingleton()
	{
		return singleton;
	}

	// ����ʽ������ע���̰߳�ȫ
	public synchronized static Singleton getLazySingleton()
	{
		if (singleton == null)
		{
			singleton = new Singleton();
		}

		return singleton;
	}

	public void doSomething()
	{

	}
}
