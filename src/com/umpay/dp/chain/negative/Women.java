package com.umpay.dp.chain.negative;

public class Women implements IWomen
{

	/**
	 * ��Ů����״��
	 * 
	 * 1--δ���� 2--���� 3--����
	 */
	private int type = 0;

	// ��Ů������
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
