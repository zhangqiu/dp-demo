package com.umpay.dp.command;

public class Client
{

	/**
	 * 命令模式，将请求封装成一个对象，从而让你使用不同的请求把客户端参数化。对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
	 * 
	 * 三个角色：Receive接收者，就是Group的三个实现类；Command命令角色，生命所有要执行的命令；Invoker调用者角色，接口人(项目经理)，接收命令，并启动命令。
	 * 
	 * Command里的Receive也可通过注入的方式实现。
	 * 
	 * 优点：类间解耦，调用者与接收者隔离，调用者运行的是命令角色的抽象方法；可扩展，Command可非常容易地扩展，调用者Invoker与场景类不产生严重的代码耦合；与其他模式结合，责任链(命令族解析)、模板方法(减少Command子类膨胀)
	 * 
	 * 缺点：命令太多，会使Command子类膨胀的非常大。
	 * 
	 * 场景：GUI，一个按钮点击是一个命令；模拟DOS命令；触发-反馈机制的处理。
	 */
	public static void main(String[] args)
	{
		Invoker xiaoSan = new Invoker(); // 小三是客户接头人

		//客户Client只需发布一个命令就好，不需关心后续怎么协调。命令模式做了一层很好的封装。
		Command command1 = new AddRequirementCommand();
		xiaoSan.setCommand(command1);
		xiaoSan.action();
		
		
		Command command2 = new DeletePageCommand();
		xiaoSan.setCommand(command2);
		xiaoSan.action();
		
		Command command3 = new CancelDeletePageCommand();
		xiaoSan.setCommand(command3);
		xiaoSan.action();
	}
}
