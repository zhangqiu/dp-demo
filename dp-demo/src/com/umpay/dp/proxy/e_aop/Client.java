package com.umpay.dp.proxy.e_aop;

import java.lang.reflect.InvocationHandler;

public class Client {

	/**
	 * 动态代理。Spring的AOP就是此机制
	 * 
	 * 关键词：切面(Aspect)、切入点(JoinPoint)、通知(Advice)、织入(Weave)
	 * 
	 * AOP编程对编码影响非常大，对于日志、事物、权限等都可以在系统设计阶段不用考虑。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		IGamePlayer player = new GamePlayer("张三");

		/** 使用动态代理 **/
		ClassLoader cl = player.getClass().getClassLoader();
		Class<?>[] interfaces = player.getClass().getInterfaces();
		InvocationHandler h = new MyInvocationHandler(player);
		IGamePlayer proxy = (IGamePlayer) DynamicProxy.newProxyInstance(cl, interfaces, h);

		/** 使用定制化的动态代理，类似静态代理。 **/
		// IGamePlayer proxy = (IGamePlayer) GamePlayerDynamicProxy.newProxyInstance(player);

		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();

	}
}
