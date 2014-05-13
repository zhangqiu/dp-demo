package com.umpay.dp.proxy.a_general;

public class Client {

	/**
	 * 普通代理。场景类直接使用代理类，完成它的需求，场景类不需知道被代理对象的信息。
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer proxy = new GamePlayerProxy("张三");
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}