package com.umpay.dp.factory.method;

public class Client
{
	/**
	 * ��������ģʽ��һ�����ڴ�������Ľӿڡ�������(Client)��ֱ�ӽ���ʵ������������(AbstractHumanFactory)����ʵ�����Ǹ��ࡣ
	 * 
	 * ��������ʹһ�����ʵ�������ӳٵ������࣬������չ��
	 * 
	 * �ŵ�1����װ�ԽϺá���������Ҫһ�����󣬸��������ʾ�ͺ�(��������)������֪�����崴������(������������Լ��Ҫ���)�����������
	 * �ŵ�2����չ�Ժá�����һ�����֣�ֻ������һ��XxxHuman�࣬��΢�޸�һ�¹��������չһ�������༴�ɡ�
	 * �ŵ�3�������˲�Ʒ�ࡣ��Ʒ���ʵ����α仯����������ȫ������(ֻ���Ľӿ�)������JDBC��Oracle�л���MySQLֻ�������������
	 * �ŵ�4�����͵Ľ����ܡ��߲�ģ��(������Client)ֻ��֪����Ʒ(����)�ĳ����࣬������ʵ������ȫ�����ġ����ϵ����ء��������á������滻ԭ��
	 * 
	 * ʹ�ó���1����Ҫnew�ĵط�����Ҫ���ص��ǣ�����һ���������Ƿ������˴���ĸ��Ӷȡ� 
	 * ʹ�ó���2����Ҫ���ġ�����չ�Ŀ�ܡ�����JDBC
	 * ʹ�ó���3���칹��Ŀ�����java���ԵĽӿڡ���һ������Ĺ�������й�����������Χϵͳ��ϡ�
	 * 
	 * ��չ1���򵥹���(Ҳ�о�̬����ģʽ)��ȥ��AbstractHumanFactory����HumanFactory��createHuman��������Ϊ��̬�� ȱ�㣺��չ����
	 * ��չ2����������ࡣ��Ʒ(����)�Ƚ϶࣬�Ҵ�������ʱ����������������ἱ�����͡����ӡ�
	 * 		��ͨ����չ������(ÿ��������ֱ��𴴽���ͬ�Ĳ�Ʒ)�������͹����ิ�Ӷȡ�
	 * 		�����������ѡ��ʹ���ĸ������࣬�Ҳ�����Ҫ���ݲ���(����)��������������ÿ���������ְ�����ȷ�ˡ�
	 * 		ȱ�㣺��չ�ԺͿ�ά���Խ����ˣ�����һ����Ʒ�࣬��Ҫ����һ�������ࡣ 
	 * ��չ3�����������ģʽ����
	 * ��չ4���ӳٳ�ʼ����һ�����󱻹��������󣬲������ͷţ������ౣ�����ʼ״̬���ȴ��ٴα�ʹ�á�����LazyInitHumanFactory.java
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		AbstractHumanFactory yinYangLu = new HumanFactory();

		System.out.println("----��ʼ����----");
		Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("----��ʼ����----");
		Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();

		System.out.println("----��ʼ����----");
		Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
