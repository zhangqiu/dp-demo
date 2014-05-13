package com.umpay.dp.factory.ebstract;

public class Client
{
	/**
	 * ���󹤳���Ϊ����һ����ػ��໥�����Ķ����ṩһ���ӿڣ�������ָ�����Ǿ�����ࡣ
	 * 
	 * �ǹ�������ģʽ�������汾�����ж��ҵ��Ʒ�֡�ҵ�����ʱ��ͨ�����󹤳�ģʽ������Ҫ�Ķ�����һ�ַǳ��õĽ����ʽ��
	 * 
	 * �ŵ�1����װ�ԡ�ͬ��������ģʽ
	 * �ŵ�2����Ʒ���ڵ�Լ��Ϊ�ǹ���״̬��������Ů�������⣬���ڹ���(������Ϊά�ȵĹ���WhiteHumanFactory)�ڲ����ƣ����賡����֪����
	 * 
	 * ȱ�㣺��Ʒ��(����)��չ����(�Ա��������չ)������һ�����֣�HumanFactoryҪ����һ��������Ȼ������ʵ���඼Ҫ�޸ġ�����Υ������ԭ��
	 * 
	 * ʹ�ó�����һ�������塣���磺windows��linux����ϵͳ�µ��ı��༭����ͼƬ�༭����
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		MaleFactory maleFactory = new MaleFactory();

		System.out.println("----��ʼ����----");
		Human human1 = maleFactory.createBlackHuman();
		human1.getColor();
		human1.talk();
		human1.getSex();

		System.out.println("----��ʼ����----");
		Human human2 = maleFactory.createWhiteHuman();
		human2.getColor();
		human2.talk();
		human2.getSex();

		System.out.println("----��ʼ����----");
		Human human3 = maleFactory.createYellowHuman();
		human3.getColor();
		human3.talk();
		human3.getSex();
		

		FemaleFactory feMaleFactory = new FemaleFactory();
		
		System.out.println("----��ʼ����----");
		Human human4 = feMaleFactory.createBlackHuman();
		human4.getColor();
		human4.talk();
		human4.getSex();

		System.out.println("----��ʼ����----");
		Human human5 = feMaleFactory.createWhiteHuman();
		human5.getColor();
		human5.talk();
		human5.getSex();

		System.out.println("----��ʼ����----");
		Human human6 = feMaleFactory.createYellowHuman();
		human6.getColor();
		human6.talk();
		human6.getSex();
	}
}
