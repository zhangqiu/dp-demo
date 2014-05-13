package com.umpay.dp.chain;

public abstract class Handler
{

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;

	private int level = 0; // 能处理的级别

	private Handler nextHandler;

	public Handler(int level) {
		this.level = level;
	}

	public void setNext(Handler handler)
	{
		this.nextHandler = handler;
	}

	//注意final关键字，这里是一个模板方法。
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
				System.out.println("---没有地方请示了，按不同意处理---");
				return;
			}
			nextHandler.handleMessage(women);
		}
	}
	public abstract void response(IWomen women);
}
