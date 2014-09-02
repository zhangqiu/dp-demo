package com.umpay.dp.prototype;

import java.util.Random;

public class Client {

	/**
	 * 原型模式。简单程度仅次于单例模式和迭代器模式。Demo中得Mail.java是一个原型类(PrototypeClass)。
	 * 
	 * 优点1：clone是在内存二进制流的拷贝，要比直接new一个对象性能好很多。特别是在一个循环体内产生大量对象时，可更好体现其优点。
	 * 
	 * 优点2：逃避构造函数的约束。直接在内存中clone，是不执行构造函数的，减少了约束(这也是缺点)。
	 * 
	 * 使用场景：资源优化、有性能和安全要求的场景、一个对象多个修改者
	 * 
	 * 注意事项：构造不会被执行、深拷贝和浅拷贝、clone与final的冲突：要想复制成员变量，就不能用final修饰。
	 * 
	 * 原型模式的核心在于clone
	 * 
	 * 银信宝批量推送消息发送就可以用原型模式。Clone一个消息，根据用户信息填充进去进行发送。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx银行版权所有");

		while (i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + "先生(女士)");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8));
			sendMail(cloneMail);
			i++;
		}
	}

	private final static int MAX_COUNT = 6;

	public static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t发送成功");
	}

	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
