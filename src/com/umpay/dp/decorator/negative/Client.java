package com.umpay.dp.decorator.negative;

public class Client
{

	
	public static void main(String[] args)
	{
		// 父亲拿过来成绩单
		SchoolReport sr = new FouthGradeSchoolReport();

		// 看成绩单
		sr.report();

		// 签名？休想
	}

	/**
	 * 通过继承确实能够解决这个问题，老爹但成绩单很开心，然后就签字了。但现实的情况很复杂，可能听完最高成绩回报直接就签了，可能老爹要先看排名。
	 * 
	 * 过多的可能性，如何扩展？全靠继承？在面向对象设计中，如果超过两层继承，你就应该想想是不是出设计问题了。
	 * 
	 * 继承层次越多以后的维护成本越高。
	 * @param args
	 */
	public static void main1(String[] args)
	{
		// 父亲拿过来成绩单
		SchoolReport sr = new SugarFouthGradeSchoolReport();

		// 看成绩单
		sr.report();

		// 签名
		sr.sign("老三");
	}
}
