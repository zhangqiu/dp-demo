package com.umpay.dp.mediator.negative;

/**
 * �ɹ�����
 * 
 * @author apline
 * 
 */
public class Purchase {

	public void buyIBMcomputer(int number) {
		Stock stock = new Stock();
		Sale sale = new Sale();
		int saleStatus = sale.getSaleStatus(); // �������

		int buyNumber = 0;
		if (saleStatus > 80) { // ����������ã�
			buyNumber = number;
		} else {
			buyNumber = number / 2;
		}
		System.out.println("�ɹ�IBM����" + buyNumber + "̨");
		stock.increase(buyNumber);
	}
	public void refuseBufIBM() {
		System.out.println("���ٲɹ�IBM����");
	}
}
