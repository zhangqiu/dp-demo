package com.umpay.dp.expression;

import java.util.HashMap;

/**
 * ����������
 * 
 * @author apline
 * 
 */
public class VarExpression extends Expression {

	private String key;

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {

		return var.get(key);
	}

}
