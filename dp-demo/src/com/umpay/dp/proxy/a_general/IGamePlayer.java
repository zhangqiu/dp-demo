package com.umpay.dp.proxy.a_general;

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
}
