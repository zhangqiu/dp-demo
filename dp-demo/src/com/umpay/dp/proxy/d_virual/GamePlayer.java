package com.umpay.dp.proxy.d_virual;

public class GamePlayer implements IGamePlayer {

	private String name = "";

	public GamePlayer(IGamePlayer player, String name) throws Exception {
		if (player != null) {
			this.name = name;
		} else {
			throw new Exception("�����ˣ�");
		}
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
