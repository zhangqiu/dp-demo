package com.umpay.dp.mediator;

public class Mediator extends AbstractMediator
{

	@Override
	public void execute(String option, Object... objects)
	{
		if (PURCHASE_BUY.equals(option))
		{
			this.buyIBMcomputer((Integer) objects[0]);
		}
		else if (SALE_SELL.equals(option))
		{
			this.sellIBMComputer((Integer) objects[0]);
		}
		else if (SALE_OFFSALE.equals(option))
		{
			this.offSale();
		}
		else if (STOCK_CLEAR.equals(option))
		{
			this.clearStock();
		}
		else
		{
			System.out.println("Not found this option: \"" + option + "\".");
		}

	}
	public void buyIBMcomputer(int number)
	{
		int saleStatus = sale.getSaleStatus(); // 销售情况

		int buyNumber = 0;
		if (saleStatus > 80)
		{ // 销售情况良好，
			buyNumber = number;
		}
		else
		{
			buyNumber = number / 2;
		}
		System.out.println("采购IBM电脑" + buyNumber + "台");
		stock.increase(buyNumber);
	}

	public void sellIBMComputer(int number)
	{
		if (stock.getStockNumber() < number)
		{ // 库存不够卖，透支采购
			purchase.buyIBMcomputer(number);
		}
		stock.decrease(number);
		System.out.println("销售IBM电脑" + number + "台");
	}

	public void offSale()
	{
		System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
	}

	public void clearStock()
	{
		sale.offSale();
		purchase.refuseBufIBM();
	}
}
