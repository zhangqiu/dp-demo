package com.umpay.dp.chain.negative;

public class Husband implements IHandler
{

	//��������ʾ�ɷ�
	@Override
	public void handleMessage(IWomen women)
	{
		System.out.println("���ӵ�����" + women.getRequest());
		System.out.println("�ɷ�Ļظ���ͬ�⣡");
	}

}
