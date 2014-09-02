package com.umpay.dp.chain;

import java.util.ArrayList;
import java.util.Random;

public class Client
{

	/**
	 * 责任链模式。使多个对象都有机会处理请求，避免了请求的发送者和接收者之间的耦合。将这些对象(Handler)连成一条链，并沿着这条链传递该请求，
	 * 直到有对象处理它为止。
	 * 
	 * 责任链模式重点在“链”上，由一条链去处理相似的请求，在链中决定谁来处理这个请求，并返回响应结果。
	 * 
	 * 抽象的处理者(Handler)的三个职责：1.定义请求的处理方法handleMessage；2.定义链的编排方式setNext；3.
	 * 定义IWomen必须实现的两个方法(级别和任务)。
	 * 
	 * 请求发送到链中后，可以有处理结果，也可以没有处理结果。不用理会什么纯不纯的问题。
	 * 
	 * 注意handleMessage前的final，这也是一个模板方法模式。
	 * 
	 * 优点：将请求和处理分开，两者解耦。请求者不用知道是谁处理的，处理者不用知道请求的全貌。
	 * 
	 * 缺点1：性能问题，每个请求都是从链头遍历到链尾，链比较长时，性能是个问题。
	 * 
	 * 缺点2：不方便调试，链条长时，环节比较多，调试的时候逻辑可能比较复杂。
	 * 
	 * 注意事项：控制链中节点数量，可在Handler中设置最大节点数，setNext方法中判断是否已经是超过阈值，超过则不允许该链建立。避免破坏系统性能。
	 * 
	 * @param args
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

		// 用Chain将责任链封装起来，减少高层模块与具体链的耦合。
		Handler chain = new Chain().getHandlerChain();

		for (IWomen women : array)
		{
			chain.handleMessage(women);
		}
	}
}
