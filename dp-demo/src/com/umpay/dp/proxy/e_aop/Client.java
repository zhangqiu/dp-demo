package com.umpay.dp.proxy.e_aop;

import java.lang.reflect.InvocationHandler;

public class Client {

	/**
	 * ��̬����Spring��AOP���Ǵ˻���
	 * 
	 * �ؼ��ʣ�����(Aspect)�������(JoinPoint)��֪ͨ(Advice)��֯��(Weave)
	 * 
	 * AOP��̶Ա���Ӱ��ǳ��󣬶�����־�����Ȩ�޵ȶ�������ϵͳ��ƽ׶β��ÿ��ǡ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		IGamePlayer player = new GamePlayer("����");

		/** ʹ�ö�̬���� **/
		ClassLoader cl = player.getClass().getClassLoader();
		Class<?>[] interfaces = player.getClass().getInterfaces();
		InvocationHandler h = new MyInvocationHandler(player);
		IGamePlayer proxy = (IGamePlayer) DynamicProxy.newProxyInstance(cl, interfaces, h);

		/** ʹ�ö��ƻ��Ķ�̬�������ƾ�̬���� **/
		// IGamePlayer proxy = (IGamePlayer) GamePlayerDynamicProxy.newProxyInstance(player);

		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();

	}
}
