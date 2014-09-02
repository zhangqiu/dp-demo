package com.umpay.dp.chain.negative;

import java.util.ArrayList;
import java.util.Random;

public class Client
{

	/**
	 * ������ģʽ��
	 * 
	 * ����1��ְ���岻������������Ӧ��֪��Ů�����������Լ�������Ů���������Լ����ܴ���
	 * 
	 * ����2���쳣���Ƿ���ǣ���ԽŮ�ܵ��Ŵ�����Ϊ������ʾ������ô�죿�������ʹ����߼�ʧ����
	 * 
	 * ����2��Client���������ӷ�ס���ʾ��ԱԽ�࣬if...else���Խ�࣬ӷ�׵��жϣ���󽵵��˿ɶ��ԡ�
	 * 
	 * ����3����Ϲ��ء�Client�����woment.getType()���ж������ĸ�IHandler��ʵ�������������IHandler��ʵ������չ�ˣ���Ҫ��Client��Υ������ԭ��
	 */
	public static void main(String[] args)
	{
		Random rand = new Random();

		// �����ѡ����Ů��
		ArrayList<IWomen> array = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++)
		{
			array.add(new Women(rand.nextInt(4), "��Ҫ��ȥ���"));
		}

		// ������ʾ����
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();

		for (IWomen women : array)
		{
			if (women.getType() == 1) // δ����Ů��ʾ����
			{
				System.out.println("\n-------Ů��������ʾ-------");
				father.handleMessage(women);
			}
			else if (women.getType() == 2)// �ѻ��ٸ���ʾ�ɷ�
			{
				System.out.println("\n-------�������ɷ���ʾ-------");
				husband.handleMessage(women);
			}
			else if (women.getType() == 3)// ����ĸ����ʾ����
			{
				System.out.println("\n-------ĸ���������ʾ-------");
				son.handleMessage(women);
			}
			else
			{
				System.out.println("\n-------����Ů�������Ӻ�ĸ��(" + women.getType() + ")-------");
			}
		}
	}
}
