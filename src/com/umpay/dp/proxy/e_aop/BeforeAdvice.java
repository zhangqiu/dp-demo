package com.umpay.dp.proxy.e_aop;

public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("����ǰ��֪ͨ����̬��������");
	}

}
