package com.umpay.dp.chain;

public class Son extends Handler
{

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}
	// ĸ������ʾ����
	@Override
	public void response(IWomen women)
	{
		System.out.println("-------ĸ���������ʾ-------");
		System.out.println("ĸ�׵�����" + women.getRequest());
		System.out.println("���ӵĻظ���ͬ�⣡");
	}

}
