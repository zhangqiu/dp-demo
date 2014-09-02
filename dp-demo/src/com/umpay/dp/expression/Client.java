package com.umpay.dp.expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器模式
 * 
 * @author apline
 * 
 */
public class Client {

	public static String getExpStr() throws IOException {

		return readLine("请输入表达式：");
	}

	private static String readLine(String sysout) throws IOException {
		if (sysout != null)
			System.out.println(sysout);
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}

	public static HashMap<String, Integer> getValue(String expStr)
			throws IOException {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				if (!map.containsKey(String.valueOf(ch))) {
					map.put(String.valueOf(ch),
							Integer.valueOf(readLine(ch + " = ?")));
				}
			}
		}
		return map;
	}

	public static void main(String[] args) {

		try {
			String expStr = getExpStr();

			HashMap<String, Integer> var = getValue(expStr);

			Calculator cal = new Calculator(expStr);

			System.out.println("运算结果为 : " + expStr + "=" + cal.run(var));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
