package com.umpay.dp.proxy.e_aop;

public class GamePlayerDynamicProxy<T> extends DynamicProxy<T> {

	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(Object obj) {

		Class<T> c = (Class<T>) obj.getClass();

		// Ѱ��JoinPoint���ӵ�
		if (true) {
			System.out.println("��̬��������");
		}

		return newProxyInstance(c.getClassLoader(), c.getInterfaces(), new MyInvocationHandler(obj));
	}
}
