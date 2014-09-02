package com.umpay.dp.chain;

public class Chain
{
	private Handler header;

	public Chain() {
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();

		father.setNext(husband);
		husband.setNext(son);

		this.header = father;
	}

	public Handler getHandlerChain()
	{
		return this.header;
	}
}
