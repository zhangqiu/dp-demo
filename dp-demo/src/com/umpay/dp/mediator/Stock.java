package com.umpay.dp.mediator;

/**
 * ������
 * 
 * @author apline
 * 
 */
public class Stock extends AbstractColleague
{

	public Stock(AbstractMediator mediator) {
		super(mediator);
	}
	private static int COMPUTER_NUMBER = 100; // �������

	// ���ӿ��
	public void increase(int number)
	{
		COMPUTER_NUMBER += number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ���Ϳ��
	public void decrease(int number)
	{
		COMPUTER_NUMBER -= number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ��ÿ������
	public int getStockNumber()
	{
		return COMPUTER_NUMBER;
	}

	// ���ѹ����֪ͨ�ɹ���Ա���ٲɹ������۾�������
	public void clearStock()
	{
		System.out.println("����������Ϊ��" + COMPUTER_NUMBER);
		super.mediator.execute(Mediator.STOCK_CLEAR);
	}
}
