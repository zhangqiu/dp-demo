package com.umpay.dp.chain.negative;

public class Father implements IHandler
{

	//未出嫁女儿来请示父亲
	@Override
	public void handleMessage(IWomen women)
	{
		System.out.println("女儿的请求：" + women.getRequest());
		System.out.println("父亲的回复：同意！");
	}

}
