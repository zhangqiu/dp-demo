package com.umpay.dp.proxy.c_forced.extend;

public class Client {

	/**
	 * ������չ�������Ŀ��ͨ���Ƕ�Ŀ����������ǿ�����ʾ�������Ŀ����󷽷�����������չ��
	 * 
	 * ���������Ŀ��������Ļ����ϣ������˼Ʒ�ʵ�֡�
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
