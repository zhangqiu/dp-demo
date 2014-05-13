package com.umpay.dp.chain.negative;

public class Women implements IWomen
{

	/**
	 * 妇女个人状况
	 * 
	 * 1--未出嫁 2--出嫁 3--夫死
	 */
	private int type = 0;

	// 妇女的请求
	private String request = "";

	public Women(int type, String request) {
		this.type = type;
		this.request = request;
	}

	@Override
	public int getType()
	{
		return this.type;
	}

	@Override
	public String getRequest()
	{
		return this.request;
	}

}
