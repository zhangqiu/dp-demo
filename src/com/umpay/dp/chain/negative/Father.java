package com.umpay.dp.chain.negative;

public class Father implements IHandler
{

	//δ����Ů������ʾ����
	@Override
	public void handleMessage(IWomen women)
	{
		System.out.println("Ů��������" + women.getRequest());
		System.out.println("���׵Ļظ���ͬ�⣡");
	}

}
