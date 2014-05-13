package com.umpay.dp.proxy.d_virual;

public class GamePlayerProxy implements IGamePlayer {

	private String name;

	private IGamePlayer gamePlayer;

	public GamePlayerProxy(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		getSubject().login(user, password);
	}

	@Override
	public void killBoss() {
		getSubject().killBoss();
	}

	@Override
	public void upgrade() {
		getSubject().upgrade();
	}

	public IGamePlayer getSubject() {
		if (gamePlayer == null) {
			try {
				gamePlayer = new GamePlayer(this, name);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return gamePlayer;
	}
}
