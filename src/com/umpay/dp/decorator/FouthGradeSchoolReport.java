package com.umpay.dp.decorator;

public class FouthGradeSchoolReport implements SchoolReport
{

	@Override
	public void report()
	{
		System.out.println("�𾴵� С�� �ҳ���");
		System.out.println("......");
		System.out.println("����62����ѧ65������98����Ȼ63");
		System.out.println("......");
		System.out.println("�ҳ�ǩ����");
	}

	@Override
	public void sign(String name)
	{
		System.out.println("�ҳ�ǩ��Ϊ��" + name);
	}

}
