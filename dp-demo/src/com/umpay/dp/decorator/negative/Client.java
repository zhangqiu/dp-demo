package com.umpay.dp.decorator.negative;

public class Client
{

	
	public static void main(String[] args)
	{
		// �����ù����ɼ���
		SchoolReport sr = new FouthGradeSchoolReport();

		// ���ɼ���
		sr.report();

		// ǩ��������
	}

	/**
	 * ͨ���̳�ȷʵ�ܹ����������⣬�ϵ����ɼ����ܿ��ģ�Ȼ���ǩ���ˡ�����ʵ������ܸ��ӣ�����������߳ɼ��ر�ֱ�Ӿ�ǩ�ˣ������ϵ�Ҫ�ȿ�������
	 * 
	 * ����Ŀ����ԣ������չ��ȫ���̳У��������������У������������̳У����Ӧ�������ǲ��ǳ���������ˡ�
	 * 
	 * �̳в��Խ���Ժ��ά���ɱ�Խ�ߡ�
	 * @param args
	 */
	public static void main1(String[] args)
	{
		// �����ù����ɼ���
		SchoolReport sr = new SugarFouthGradeSchoolReport();

		// ���ɼ���
		sr.report();

		// ǩ��
		sr.sign("����");
	}
}
