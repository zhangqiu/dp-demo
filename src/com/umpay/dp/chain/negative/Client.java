package com.umpay.dp.chain.negative;

import java.util.ArrayList;
import java.util.Random;

public class Client
{

	/**
	 * 责任链模式。
	 * 
	 * 问题1：职责定义不清晰。父亲类应该知道女儿的请求由自己处理，非女儿的请求，自己不能处理。
	 * 
	 * 问题2：异常情况欠考虑，穿越女跑到古代，做为妻子请示父亲怎么办？父亲做和处理？逻辑失败了
	 * 
	 * 问题2：Client场景类代码臃肿。请示人员越多，if...else语句越多，臃肿的判断，大大降低了可读性。
	 * 
	 * 问题3：耦合过重。Client需根据woment.getType()来判断需用哪个IHandler的实现类来处理，如果IHandler的实现类扩展了，就要给Client。违反开闭原则。
	 */
	public static void main(String[] args)
	{
		Random rand = new Random();

		// 随机挑选几个女性
		ArrayList<IWomen> array = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++)
		{
			array.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}

		// 定义请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();

		for (IWomen women : array)
		{
			if (women.getType() == 1) // 未婚少女请示父亲
			{
				System.out.println("\n-------女儿向父亲请示-------");
				father.handleMessage(women);
			}
			else if (women.getType() == 2)// 已婚少妇请示丈夫
			{
				System.out.println("\n-------妻子向丈夫请示-------");
				husband.handleMessage(women);
			}
			else if (women.getType() == 3)// 夫死母亲请示儿子
			{
				System.out.println("\n-------母亲向儿子请示-------");
				son.handleMessage(women);
			}
			else
			{
				System.out.println("\n-------不是女儿、妻子和母亲(" + women.getType() + ")-------");
			}
		}
	}
}
