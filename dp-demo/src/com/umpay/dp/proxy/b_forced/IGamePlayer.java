package com.umpay.dp.proxy.b_forced;

public interface IGamePlayer {

	/**
	 * 登陆
	 * @param user
	 * @param password
	 */
	public void login(String user, String password);
	
	/**
	 * 杀boss
	 */
	public void killBoss();
	
	/**
	 * 升级
	 */
	public void upgrade();
	
	/**
	 * 获得代理对象
	 * @return
	 */
	public IGamePlayer getProxy();
}
