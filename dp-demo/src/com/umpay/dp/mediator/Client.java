package com.umpay.dp.mediator;

public class Client
{

	/**
	 * �н���ģʽ��Ҳ�е�ͣ��ģʽ����һ���н���󣬷�װһϵ�еĶ��󽻻����н���ʹ��������Ҫ���Ե��໥���á��Ӷ�ʹ�����ɢ���ҿ��Զ����ڸı�����֮��Ľ�����
	 * 
	 * ���ƣ�������������1�Զ��Ϊ1��1.�����������ϡ�
	 * 
	 * ȱ�㣺�н��߻����͵ĺܴ����߼����ӡ�ͬ����Խ�࣬�н��߾�Խ���ӡ�
	 * 
	 * ʹ�ó���������ͼ�����״�ṹʱ����ʹ���н��ߣ�������ͽṹ��
	 * 
	 * ʵ��Ӧ�ã�MVC�е�C(Controller)����һ���н��ߣ�Ҳ��ǰ�˿�����������M��V���뿪����Э��M��VЭͬ������
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

		// AbstractMediator mediator = new Mediator();
		//
		// Purchase purchase = new Purchase(mediator);
		// mediator.regist(AbstractMediator.PURCHASE, purchase);
		//
		// Sale sale = new Sale(mediator);
		// mediator.regist(AbstractMediator.SALE, sale);
		//
		// Stock stock = new Stock(mediator);
		// mediator.regist(AbstractMediator.STOCK, stock);
		//
		// System.out.println("------------------------");
		// purchase.buyIBMcomputer(100); // �����
		// System.out.println("------------------------");
		// sale.sellIBMComputer(1);// ������
		// System.out.println("------------------------");
		// stock.clearStock();// ���

		AbstractMediator mediator = new Mediator();

		System.out.println("------------------------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100); // �����

		System.out.println("------------------------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);// ������

		System.out.println("------------------------");
		Stock stock = new Stock(mediator);
		stock.clearStock();// ���
	}

}
