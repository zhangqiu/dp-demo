package com.umpay.dp.proxy.b_forced;

public interface IGamePlayer {

	/**
	 * ��½
	 * @param user
	 * @param password
	 */
	public void login(String user, String password);
	
	/**
	 * ɱboss
	 */
	public void killBoss();
	
	/**
	 * ����
	 */
	public void upgrade();
	
	/**
	 * ��ô������
	 * @return
	 */
	public IGamePlayer getProxy();
}
