package com.umpay.dp.mediator.negative;

public class Client {

	/**
	 * ������ϵͳ������ϵ�ʵ�ַ�ʽ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// �ɹ�
		System.out.println("--------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);

		// ����
		System.out.println("--------������Ա���۵���--------");
		Sale sale = new Sale();
		sale.sellIBMComputer(5);

		// ���
		System.out.println("--------�ⷿ������Ա��⴦��--------");
		Stock stock = new Stock();
		stock.clearStock();
	}
}
