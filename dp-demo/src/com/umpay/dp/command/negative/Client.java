package com.umpay.dp.command.negative;

public class Client
{
	/**
	 * 客户分别对各组下达命令，且每次都叫一个组去，场景类会很复杂，容易出错。比如用户要求美工组变更一个页面，但需求组不知道。
	 * 
	 * 客户肯定会要求：你们给我一个接口人，我只告诉一个人怎么做，你们内部怎么处理我不管。
	 */
	public static void main1(String[] args)
	{
		System.out.println("-----------客户要求增加一个需求-----------");
		Group rg = new RequirementGroup();
		rg.find();
		rg.add();
		rg.plan();

		System.out.println("-----------客户要求删除一个页面-----------");
		Group pg = new PageGroup();
		pg.find();
		pg.delete();
		pg.plan();
	}

	/**
	 * 有了接口人的场景类
	 * 
	 * 问题：String类型的命令没有约束力，变化太多。在进程内部根据字符串判断业务逻辑不是一个优秀的方案。
	 * 
	 * 好的方案：应该是对用户命令进行封装，每个命令就是一个对象。场景类发出命令，功能模块立即执行，不需思考(解析命令字符串)。
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Invoker xiaoSan = new Invoker(); // 小三是接口人

		System.out.println("-----------客户要求增加一个需求-----------");
		xiaoSan.setCommand("add requirement");
		xiaoSan.action();

		System.out.println("-----------客户要求删除一个页面-----------");
		xiaoSan.setCommand("delete page");
		xiaoSan.action();
	}
}
