package com.umpay.dp.proxy.e_aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object obj = null;

	public MyInvocationHandler(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object result = method.invoke(obj, args);
		if ("com.umpay.dp.proxy.dynamic.GamePlayer".equalsIgnoreCase(obj.getClass().getName()) && "login".equalsIgnoreCase(method.getName())) {
			System.out.println("有人登陆我的账号");
		}
		return result;
	}

}
