package com.umpay.dp.proxy.a_general;

public class Client {

	/**
	 * ��ͨ����������ֱ��ʹ�ô����࣬����������󣬳����಻��֪��������������Ϣ��
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGamePlayer proxy = new GamePlayerProxy("����");
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}