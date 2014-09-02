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
			System.out.println(this.name + "登陆\t user:" + user + " password:" + password);
		} else {
			System.out.println("请使用代理类");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "杀了一个BOSS");
		} else {
			System.out.println("请使用代理类");
		}

	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "升了一级");
		} else {
			System.out.println("请使用代理类");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		if (myProxy == null) {
			myProxy = new GamePlayerProxy(this);
		}
		return myProxy;
	}

	//这个判断方法比较简单，这里只是举个例子。
	//事实上它无法准确判断：被调用时是否是它指定的代理，比如调用getProxy()后，再new个GamePlayerProxy()。。
	private boolean isProxy() {
		if (myProxy == null) {
			return false;
		}
		return true;
	}
}
