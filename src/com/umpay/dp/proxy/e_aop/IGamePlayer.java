package com.umpay.dp.proxy.e_aop;

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
