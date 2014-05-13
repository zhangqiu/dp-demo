package com.umpay.dp.proxy.d_virual;

public class GamePlayer implements IGamePlayer {

	private String name = "";

	public GamePlayer(IGamePlayer player, String name) throws Exception {
		if (player != null) {
			this.name = name;
		} else {
			throw new Exception("出错了！");
		}
	}

	@Override
	public void login(String user, String password) {
		System.out.println(this.name + "登陆\t user:" + user + " password:" + password);
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "杀了一个BOSS");

	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "升了一级");
	}

}
