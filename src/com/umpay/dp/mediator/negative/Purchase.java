package com.umpay.dp.mediator.negative;

/**
 * 采购管理
 * 
 * @author apline
 * 
 */
public class Purchase {

	public void buyIBMcomputer(int number) {
		Stock stock = new Stock();
		Sale sale = new Sale();
		int saleStatus = sale.getSaleStatus(); // 销售情况

		int buyNumber = 0;
		if (saleStatus > 80) { // 销售情况良好，
			buyNumber = number;
		} else {
			buyNumber = number / 2;
		}
		System.out.println("采购IBM电脑" + buyNumber + "台");
		stock.increase(buyNumber);
	}
	public void refuseBufIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
