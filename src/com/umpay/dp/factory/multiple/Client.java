package com.umpay.dp.factory.multiple;

public class Client
{
	/**
	 * ��������ࡣ��Ʒ(����)�Ƚ϶࣬�Ҵ�������ʱ����������������ἱ�����͡����ӡ�
	 * ��ͨ����չ������(ÿ��������ֱ��𴴽���ͬ�Ĳ�Ʒ)�������͹����ิ�Ӷȡ�
	 * �����������ѡ��ʹ���ĸ������࣬�Ҳ�����Ҫ���ݲ���(����)��������������ÿ���������ְ�����ȷ�ˡ�
	 * 
	 * ȱ�㣺��չ�ԺͿ�ά���Խ����ˣ�����һ����Ʒ�࣬��Ҫ����һ�������ࡣ
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		AbstractHumanFactory whiteHumanFactory = new WhiteHumanFactory();
		AbstractHumanFactory yellowHumanFactory = new YellowHumanFactory();
		AbstractHumanFactory blackFactory = new BlackHumanFactory();

		System.out.println("----��ʼ����----");
		Human whiteHuman = whiteHumanFactory.createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("----��ʼ����----");
		Human blackHuman = blackFactory.createHuman();
		blackHuman.getColor();
		blackHuman.talk();

		System.out.println("----��ʼ����----");
		Human yellowHuman = yellowHumanFactory.createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
