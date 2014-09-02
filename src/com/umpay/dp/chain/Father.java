package com.umpay.dp.chain;

public class Father extends Handler
{

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}
	// 未出嫁女儿来请示父亲
	@Override
	public void response(IWomen women)
	{
		System.out.println("-------女儿向父亲请示-------");
		System.out.println("女儿的请求：" + women.getRequest());
		System.out.println("父亲的回复：同意！");
	}
}
