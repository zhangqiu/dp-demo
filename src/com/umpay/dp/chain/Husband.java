package com.umpay.dp.chain;

public class Husband extends Handler
{

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}
	// 妻子来请示丈夫
	@Override
	public void response(IWomen women)
	{
		System.out.println("-------妻子向丈夫请示-------");
		System.out.println("妻子的请求：" + women.getRequest());
		System.out.println("丈夫的回复：同意！");
	}

}
