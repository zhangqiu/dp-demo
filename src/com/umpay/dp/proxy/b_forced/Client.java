package com.umpay.dp.proxy.b_forced;

public class Client {

	/**
	 * ǿ�ƴ������������Ҫ�󳡾������ʹ����ָ���Ĵ������
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("����");
		
		IGamePlayer proxy = player.getProxy();
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
