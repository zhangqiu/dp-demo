package com.umpay.dp.chain.negative;

public class Son implements IHandler
{

	//ĸ������ʾ����
	@Override
	public void handleMessage(IWomen women)
	{
		System.out.println("ĸ�׵�����" + women.getRequest());
		System.out.println("���ӵĻظ���ͬ�⣡");
	}

}
