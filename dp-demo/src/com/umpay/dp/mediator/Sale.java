package com.umpay.dp.mediator;

import java.util.Random;

/**
 * ���۹���
 * 
 * @author apline
 * 
 */
public class Sale extends AbstractColleague
{

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}
	// ����
	public void sellIBMComputer(int number)
	{
		super.mediator.execute(Mediator.SALE_SELL, number);
	}

	public int getSaleStatus()
	{
		Random rand = new Random(System.currentTimeMillis());

		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ��" + saleStatus);
		return saleStatus;
	}

	// ���۴������ۼ۴����ⷿ�ж���������
	public void offSale()
	{
		super.mediator.execute(Mediator.SALE_OFFSALE);
	}
}
