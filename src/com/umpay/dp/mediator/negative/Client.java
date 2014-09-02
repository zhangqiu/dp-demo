package com.umpay.dp.mediator.negative;

public class Client {

	/**
	 * 进销存系统，高耦合的实现方式。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 采购
		System.out.println("--------采购人员采购电脑--------");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);

		// 销售
		System.out.println("--------销售人员销售电脑--------");
		Sale sale = new Sale();
		sale.sellIBMComputer(5);

		// 清仓
		System.out.println("--------库房管理人员清库处理--------");
		Stock stock = new Stock();
		stock.clearStock();
	}
}
