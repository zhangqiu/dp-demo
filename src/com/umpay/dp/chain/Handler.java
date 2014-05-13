package com.umpay.dp.chain;

public abstract class Handler
{

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;

	private int level = 0; // �ܴ���ļ���

	private Handler nextHandler;

	public Handler(int level) {
		this.level = level;
	}

	public void setNext(Handler handler)
	{
		this.nextHandler = handler;
	}

	//ע��final�ؼ��֣�������һ��ģ�巽����
	public final void handleMessage(IWomen women)
	{
		if (women.getType() == this.level)
		{
			this.response(women);
		}
		else
		{
			if (this.nextHandler == null)
			{
				System.out.println("---û�еط���ʾ�ˣ�����ͬ�⴦��---");
				return;
			}
			nextHandler.handleMessage(women);
		}
	}
	public abstract void response(IWomen women);
}
