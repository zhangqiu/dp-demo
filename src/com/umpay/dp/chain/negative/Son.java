package com.umpay.dp.chain.negative;

public class Son implements IHandler
{

	//母亲来请示儿子
	@Override
	public void handleMessage(IWomen women)
	{
		System.out.println("母亲的请求：" + women.getRequest());
		System.out.println("儿子的回复：同意！");
	}

}
