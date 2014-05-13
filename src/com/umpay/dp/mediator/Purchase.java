package com.umpay.dp.mediator;

/**
 * 采购管理
 * 
 * @author apline
 * 
 */
public class Purchase extends AbstractColleague
{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	public void buyIBMcomputer(int number)
	{
		super.mediator.execute(Mediator.PURCHASE_BUY, number);
	}

	public void refuseBufIBM()
	{
		System.out.println("不再采购IBM电脑");
	}
}
