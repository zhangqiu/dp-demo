package com.umpay.dp.proxy.e_aop;

public class GamePlayer implements IGamePlayer {

	private String name = "";

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		System.out.println(this.name + "��½\t user:" + user + " password:" + password);
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "ɱ��һ��BOSS");

	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "����һ��");
	}

}
