package com.umpay.dp.proxy.e_aop;

public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("我是前置通知，动态代理被创建");
	}

}
