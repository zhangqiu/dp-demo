package com.umpay.dp.chain;

public class Son extends Handler
{

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}
	// 母亲来请示儿子
	@Override
	public void response(IWomen women)
	{
		System.out.println("-------母亲向儿子请示-------");
		System.out.println("母亲的请求：" + women.getRequest());
		System.out.println("儿子的回复：同意！");
	}

}
