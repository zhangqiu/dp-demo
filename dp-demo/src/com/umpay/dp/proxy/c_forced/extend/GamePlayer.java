package com.umpay.dp.proxy.c_forced.extend;

public class GamePlayer implements IGamePlayer {

	private String name = "";

	private IGamePlayer myProxy;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		if (this.isProxy()) {
			System.out.println(this.name + "��½\t user:" + user + " password:" + password);
		} else {
			System.out.println("��ʹ�ô�����");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "ɱ��һ��BOSS");
		} else {
			System.out.println("��ʹ�ô�����");
		}

	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "����һ��");
		} else {
			System.out.println("��ʹ�ô�����");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		if (myProxy == null) {
			myProxy = new GamePlayerProxy(this);
		}
		return myProxy;
	}

	//����жϷ����Ƚϼ򵥣�����ֻ�Ǿٸ����ӡ�
	//��ʵ�����޷�׼ȷ�жϣ�������ʱ�Ƿ�����ָ���Ĵ����������getProxy()����new��GamePlayerProxy()����
	private boolean isProxy() {
		if (myProxy == null) {
			return false;
		}
		return true;
	}
}
