package com.umpay.dp.decorator;

public class FouthGradeSchoolReport implements SchoolReport
{

	@Override
	public void report()
	{
		System.out.println("尊敬的 小三 家长：");
		System.out.println("......");
		System.out.println("语文62，数学65，体育98，自然63");
		System.out.println("......");
		System.out.println("家长签名：");
	}

	@Override
	public void sign(String name)
	{
		System.out.println("家长签名为：" + name);
	}

}
