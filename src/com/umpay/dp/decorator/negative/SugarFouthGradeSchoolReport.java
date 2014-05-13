package com.umpay.dp.decorator.negative;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport
{

	public void reportHighScore()
	{
		System.out.println("�������75������78����Ȼ80");
	}

	public void reportSort()
	{
		System.out.println("������38...");
	}

	@Override
	public void report()
	{
		this.reportHighScore();
		super.report();
		this.reportSort();
	}
}
