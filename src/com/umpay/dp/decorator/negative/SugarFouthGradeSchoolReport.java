package com.umpay.dp.decorator.negative;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport
{

	public void reportHighScore()
	{
		System.out.println("语文最高75，数据78，自然80");
	}

	public void reportSort()
	{
		System.out.println("我排名38...");
	}

	@Override
	public void report()
	{
		this.reportHighScore();
		super.report();
		this.reportSort();
	}
}
