package com.umpay.dp.mediator;

import java.util.Random;

/**
 * 销售管理
 * 
 * @author apline
 * 
 */
public class Sale extends AbstractColleague
{

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}
	// 销售
	public void sellIBMComputer(int number)
	{
		super.mediator.execute(Mediator.SALE_SELL, number);
	}

	public int getSaleStatus()
	{
		Random rand = new Random(System.currentTimeMillis());

		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为：" + saleStatus);
		return saleStatus;
	}

	// 降价促销，折价处理，库房有多少卖多少
	public void offSale()
	{
		super.mediator.execute(Mediator.SALE_OFFSALE);
	}
}
