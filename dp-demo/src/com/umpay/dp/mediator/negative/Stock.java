package com.umpay.dp.mediator.negative;

/**
 * 库存管理
 * 
 * @author apline
 * 
 */
public class Stock {

	private static int COMPUTER_NUMBER = 100; // 库存数量

	// 增加库存
	public void increase(int number) {
		COMPUTER_NUMBER += number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	// 降低库存
	public void decrease(int number) {
		COMPUTER_NUMBER -= number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	// 获得库存数量
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	// 存货压力大，通知采购人员不再采购，销售尽快销售
	public void clearStock() {
		Sale sale = new Sale();
		Purchase purchase = new Purchase();
		System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
		sale.offSale();
		purchase.refuseBufIBM();
	}
}
