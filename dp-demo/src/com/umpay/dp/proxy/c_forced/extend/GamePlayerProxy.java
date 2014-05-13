package com.umpay.dp.proxy.c_forced.extend;

public class GamePlayerProxy implements IGamePlayer, ICost {

	private IGamePlayer gamePlayer;

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	@Override
	public void login(String user, String password) {
		gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		gamePlayer.upgrade();
		this.count();
	}

	@Override
	public IGamePlayer getProxy() {
		return this; // 自己就是代理，当然，代理角色也可以继续被代理。
	}

	@Override
	public void count() {
		System.out.println("升级费用：150元");
	}

}
