package com.umpay.dp.factory.simple;

public class Client
{
	/**
	 * �򵥹���(Ҳ�о�̬����ģʽ)��ȥ��AbstractHumanFactory����HumanFactory��createHuman��������Ϊ��̬��
	 * 
	 * ȱ�㣺��չ����
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

		System.out.println("----��ʼ����----");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("----��ʼ����----");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();

		System.out.println("----��ʼ����----");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
