package com.umpay.dp.proxy.d_virual;

public class Client {

	/**
	 * ��������ܼ򵥣���������Ҫʱ��ʵ������������󣬿ɱ����ʼ���������⡣
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer proxy = new GamePlayerProxy("����");
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
