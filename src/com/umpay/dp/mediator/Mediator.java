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
		int saleStatus = sale.getSaleStatus(); // �������

		int buyNumber = 0;
		if (saleStatus > 80)
		{ // ����������ã�
			buyNumber = number;
		}
		else
		{
			buyNumber = number / 2;
		}
		System.out.println("�ɹ�IBM����" + buyNumber + "̨");
		stock.increase(buyNumber);
	}

	public void sellIBMComputer(int number)
	{
		if (stock.getStockNumber() < number)
		{ // ��治������͸֧�ɹ�
			purchase.buyIBMcomputer(number);
		}
		stock.decrease(number);
		System.out.println("����IBM����" + number + "̨");
	}

	public void offSale()
	{
		System.out.println("�ۼ�����IBM����" + stock.getStockNumber() + "̨");
	}

	public void clearStock()
	{
		sale.offSale();
		purchase.refuseBufIBM();
	}
}
