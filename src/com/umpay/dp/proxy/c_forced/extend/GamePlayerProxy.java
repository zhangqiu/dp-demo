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
		return this; // �Լ����Ǵ�����Ȼ�������ɫҲ���Լ���������
	}

	@Override
	public void count() {
		System.out.println("�������ã�150Ԫ");
	}

}
