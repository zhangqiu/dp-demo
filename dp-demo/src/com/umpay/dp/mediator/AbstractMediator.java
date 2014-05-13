package com.umpay.dp.mediator;

/**
 * ͬ�½�ɫ
 * 
 * @author apline
 * 
 */
public abstract class AbstractMediator
{

	public final static String PURCHASE_BUY = "purchase.buy";
	public final static String SALE_SELL = "sale.sell";
	public final static String SALE_OFFSALE = "sale.offsell";
	public final static String STOCK_CLEAR = "stock.clear";

	public final static String PURCHASE = "I'm purchase.";
	public final static String SALE = "I'm sale.";
	public final static String STOCK = "I'm stock.";

	// ͬ���಻���ó������ͣ���Ϊû��ÿ��ͬ������Ե�ҵ�񷽷���
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	/**
	 * Ҳ����������ʽע��ͬ���࣬����getter/setter�ȡ�
	 * ͬ�������ʹ�ù��췽��ע���н��࣬�н������Ǳ����ù��췽��ע��ͬ���ࡣ
	 * ��Ϊͬ��������н��࣬�н������ֻ�в���ͬ���ࡣ
	 */
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	// public void regist(String type, Object object)
	// {
	// if (PURCHASE.equals(type))
	// {
	// purchase = (Purchase) object;
	// }
	// else if (SALE.equals(type))
	// {
	// sale = (Sale) object;
	// }
	// else if (STOCK.equals(type))
	// {
	// stock = (Stock) object;
	// }
	// else
	// {
	// System.out.println("error");
	// }
	// }
	public abstract void execute(String option, Object... objects);
}
