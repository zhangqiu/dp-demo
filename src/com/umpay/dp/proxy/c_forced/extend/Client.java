package com.umpay.dp.proxy.c_forced.extend;

public class Client {

	/**
	 * 代理扩展。代理的目的通常是对目标对象进行增强，本质就是拦截目标对象方法，并进行扩展，
	 * 
	 * 本例在完成目标对象代理的基础上，增加了计费实现。
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("张三");
		
		IGamePlayer proxy = player.getProxy();
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
