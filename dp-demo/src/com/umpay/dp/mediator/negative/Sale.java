package com.umpay.dp.mediator.negative;

import java.util.Random;

/**
 * 销售管理
 * 
 * @author apline
 * 
 */
public class Sale {

	// 销售
	public void sellIBMComputer(int number) {
		Stock stock = new Stock();
		Purchase purchase = new Purchase();
		if (stock.getStockNumber() < number) { // 库存不够卖，透支采购
			purchase.buyIBMcomputer(number);
		}
		stock.decrease(number);
		System.out.println("销售IBM电脑" + number + "台");
	}

	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());

		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为：" + saleStatus);
		return saleStatus;
	}

	// 降价促销，折价处理，库房有多少卖多少
	public void offSale() {
		Stock stock = new Stock();
		System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
	}
}
