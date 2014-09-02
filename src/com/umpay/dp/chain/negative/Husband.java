package com.umpay.dp.chain.negative;

public class Husband implements IHandler
{

	//妻子来请示丈夫
	@Override
	public void handleMessage(IWomen women)
	{
		System.out.println("妻子的请求：" + women.getRequest());
		System.out.println("丈夫的回复：同意！");
	}

}
