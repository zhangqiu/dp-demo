package com.umpay.dp.mediator.negative;

/**
 * ������
 * 
 * @author apline
 * 
 */
public class Stock {

	private static int COMPUTER_NUMBER = 100; // �������

	// ���ӿ��
	public void increase(int number) {
		COMPUTER_NUMBER += number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ���Ϳ��
	public void decrease(int number) {
		COMPUTER_NUMBER -= number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ��ÿ������
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	// ���ѹ����֪ͨ�ɹ���Ա���ٲɹ������۾�������
	public void clearStock() {
		Sale sale = new Sale();
		Purchase purchase = new Purchase();
		System.out.println("����������Ϊ��" + COMPUTER_NUMBER);
		sale.offSale();
		purchase.refuseBufIBM();
	}
}
