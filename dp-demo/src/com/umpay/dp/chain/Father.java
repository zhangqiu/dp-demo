package com.umpay.dp.chain;

public class Father extends Handler
{

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}
	// δ����Ů������ʾ����
	@Override
	public void response(IWomen women)
	{
		System.out.println("-------Ů��������ʾ-------");
		System.out.println("Ů��������" + women.getRequest());
		System.out.println("���׵Ļظ���ͬ�⣡");
	}
}
