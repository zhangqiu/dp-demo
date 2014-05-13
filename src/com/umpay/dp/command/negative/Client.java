package com.umpay.dp.command.negative;

public class Client
{
	/**
	 * �ͻ��ֱ�Ը����´������ÿ�ζ���һ����ȥ���������ܸ��ӣ����׳��������û�Ҫ����������һ��ҳ�棬�������鲻֪����
	 * 
	 * �ͻ��϶���Ҫ�����Ǹ���һ���ӿ��ˣ���ֻ����һ������ô���������ڲ���ô�����Ҳ��ܡ�
	 */
	public static void main1(String[] args)
	{
		System.out.println("-----------�ͻ�Ҫ������һ������-----------");
		Group rg = new RequirementGroup();
		rg.find();
		rg.add();
		rg.plan();

		System.out.println("-----------�ͻ�Ҫ��ɾ��һ��ҳ��-----------");
		Group pg = new PageGroup();
		pg.find();
		pg.delete();
		pg.plan();
	}

	/**
	 * ���˽ӿ��˵ĳ�����
	 * 
	 * ���⣺String���͵�����û��Լ�������仯̫�ࡣ�ڽ����ڲ������ַ����ж�ҵ���߼�����һ������ķ�����
	 * 
	 * �õķ�����Ӧ���Ƕ��û�������з�װ��ÿ���������һ�����󡣳����෢���������ģ������ִ�У�����˼��(���������ַ���)��
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Invoker xiaoSan = new Invoker(); // С���ǽӿ���

		System.out.println("-----------�ͻ�Ҫ������һ������-----------");
		xiaoSan.setCommand("add requirement");
		xiaoSan.action();

		System.out.println("-----------�ͻ�Ҫ��ɾ��һ��ҳ��-----------");
		xiaoSan.setCommand("delete page");
		xiaoSan.action();
	}
}
