package com.umpay.dp.proxy.e_aop;

public interface IGamePlayer {

	/**
	 * µÇÂ½
	 * @param user
	 * @param password
	 */
	public void login(String user, String password);
	
	/**
	 * É±boss
	 */
	public void killBoss();
	
	/**
	 * Éý¼¶
	 */
	public void upgrade();
}
