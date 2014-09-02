package com.umpay.dp.mediator;

/**
 * �ɹ�����
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
		System.out.println("���ٲɹ�IBM����");
	}
}
