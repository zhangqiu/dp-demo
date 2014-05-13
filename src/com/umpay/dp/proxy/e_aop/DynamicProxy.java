package com.umpay.dp.proxy.e_aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {

	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader cl, Class<?>[] interfaces, InvocationHandler h) {

		// Ѱ��JoinPoint���ӵ�
		if (true) {
			new BeforeAdvice().exec();
		}
		return (T) Proxy.newProxyInstance(cl, interfaces, h);
	}
}
