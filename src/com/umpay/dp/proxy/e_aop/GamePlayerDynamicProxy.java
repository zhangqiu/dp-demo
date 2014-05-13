package com.umpay.dp.proxy.e_aop;

public class GamePlayerDynamicProxy<T> extends DynamicProxy<T> {

	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(Object obj) {

		Class<T> c = (Class<T>) obj.getClass();

		// 寻找JoinPoint连接点
		if (true) {
			System.out.println("静态代理被创建");
		}

		return newProxyInstance(c.getClassLoader(), c.getInterfaces(), new MyInvocationHandler(obj));
	}
}
