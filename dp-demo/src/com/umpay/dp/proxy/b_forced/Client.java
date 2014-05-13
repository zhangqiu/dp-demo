package com.umpay.dp.proxy.b_forced;

public class Client {

	/**
	 * 强制代理。被代理对象，要求场景类必须使用它指定的代理对象。
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
