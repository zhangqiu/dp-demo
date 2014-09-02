package com.umpay.dp.mediator.negative;

import java.util.Random;

/**
 * ���۹���
 * 
 * @author apline
 * 
 */
public class Sale {

	// ����
	public void sellIBMComputer(int number) {
		Stock stock = new Stock();
		Purchase purchase = new Purchase();
		if (stock.getStockNumber() < number) { // ��治������͸֧�ɹ�
			purchase.buyIBMcomputer(number);
		}
		stock.decrease(number);
		System.out.println("����IBM����" + number + "̨");
	}

	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());

		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ��" + saleStatus);
		return saleStatus;
	}

	// ���۴������ۼ۴����ⷿ�ж���������
	public void offSale() {
		Stock stock = new Stock();
		System.out.println("�ۼ�����IBM����" + stock.getStockNumber() + "̨");
	}
}
