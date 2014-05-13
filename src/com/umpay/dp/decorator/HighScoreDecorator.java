package com.umpay.dp.decorator;

public class HighScoreDecorator extends Decorator
{

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	//装饰方法
	public void reportHighScore()
	{
		System.out.println("语文最高75，数据78，自然80");
	}

	@Override
	public void report()
	{
		this.reportHighScore(); //装饰方法
		super.report(); //原始方法
	}
}
