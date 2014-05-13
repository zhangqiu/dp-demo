package com.umpay.dp.prototype;

import java.util.Random;

public class Client {

	/**
	 * ԭ��ģʽ���򵥳̶Ƚ����ڵ���ģʽ�͵�����ģʽ��Demo�е�Mail.java��һ��ԭ����(PrototypeClass)��
	 * 
	 * �ŵ�1��clone�����ڴ���������Ŀ�����Ҫ��ֱ��newһ���������ܺúܶࡣ�ر�����һ��ѭ�����ڲ�����������ʱ���ɸ����������ŵ㡣
	 * 
	 * �ŵ�2���ӱܹ��캯����Լ����ֱ�����ڴ���clone���ǲ�ִ�й��캯���ģ�������Լ��(��Ҳ��ȱ��)��
	 * 
	 * ʹ�ó�������Դ�Ż��������ܺͰ�ȫҪ��ĳ�����һ���������޸���
	 * 
	 * ע��������첻�ᱻִ�С������ǳ������clone��final�ĳ�ͻ��Ҫ�븴�Ƴ�Ա�������Ͳ�����final���Ρ�
	 * 
	 * ԭ��ģʽ�ĺ�������clone
	 * 
	 * ���ű�����������Ϣ���;Ϳ�����ԭ��ģʽ��Cloneһ����Ϣ�������û���Ϣ����ȥ���з��͡�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx���а�Ȩ����");

		while (i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + "����(Ůʿ)");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8));
			sendMail(cloneMail);
			i++;
		}
	}

	private final static int MAX_COUNT = 6;

	public static void sendMail(Mail mail) {
		System.out.println("���⣺" + mail.getSubject() + "\t�ռ��ˣ�" + mail.getReceiver() + "\t���ͳɹ�");
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
