package com.umpay.dp.proxy.d_virual;

public class Client {

	/**
	 * 虚拟代理。很简单，就是在需要时才实例化被代理对象，可避免初始化慢的问题。
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer proxy = new GamePlayerProxy("张三");
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
