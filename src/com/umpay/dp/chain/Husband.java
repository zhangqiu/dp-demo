package com.umpay.dp.chain;

public class Husband extends Handler
{

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}
	// ��������ʾ�ɷ�
	@Override
	public void response(IWomen women)
	{
		System.out.println("-------�������ɷ���ʾ-------");
		System.out.println("���ӵ�����" + women.getRequest());
		System.out.println("�ɷ�Ļظ���ͬ�⣡");
	}

}
