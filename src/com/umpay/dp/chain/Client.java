package com.umpay.dp.chain;

import java.util.ArrayList;
import java.util.Random;

public class Client
{

	/**
	 * ������ģʽ��ʹ��������л��ᴦ�����󣬱���������ķ����ߺͽ�����֮�����ϡ�����Щ����(Handler)����һ���������������������ݸ�����
	 * ֱ���ж�������Ϊֹ��
	 * 
	 * ������ģʽ�ص��ڡ������ϣ���һ����ȥ�������Ƶ����������о���˭������������󣬲�������Ӧ�����
	 * 
	 * ����Ĵ�����(Handler)������ְ��1.��������Ĵ�����handleMessage��2.�������ı��ŷ�ʽsetNext��3.
	 * ����IWomen����ʵ�ֵ���������(���������)��
	 * 
	 * �����͵����к󣬿����д�������Ҳ����û�д��������������ʲô�����������⡣
	 * 
	 * ע��handleMessageǰ��final����Ҳ��һ��ģ�巽��ģʽ��
	 * 
	 * �ŵ㣺������ʹ���ֿ������߽�������߲���֪����˭����ģ������߲���֪�������ȫò��
	 * 
	 * ȱ��1���������⣬ÿ�������Ǵ���ͷ��������β�����Ƚϳ�ʱ�������Ǹ����⡣
	 * 
	 * ȱ��2����������ԣ�������ʱ�����ڱȽ϶࣬���Ե�ʱ���߼����ܱȽϸ��ӡ�
	 * 
	 * ע������������нڵ�����������Handler���������ڵ�����setNext�������ж��Ƿ��Ѿ��ǳ�����ֵ��������������������������ƻ�ϵͳ���ܡ�
	 * 
	 * @param args
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

		// ��Chain����������װ���������ٸ߲�ģ�������������ϡ�
		Handler chain = new Chain().getHandlerChain();

		for (IWomen women : array)
		{
			chain.handleMessage(women);
		}
	}
}
