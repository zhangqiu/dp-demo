package com.umpay.dp.decorator;

public class HighScoreDecorator extends Decorator
{

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	//װ�η���
	public void reportHighScore()
	{
		System.out.println("�������75������78����Ȼ80");
	}

	@Override
	public void report()
	{
		this.reportHighScore(); //װ�η���
		super.report(); //ԭʼ����
	}
}
