package com.umpay.dp.mediator;

/**
 * 同事角色
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

	// 同事类不能用抽象类型，因为没有每个同事类各自的业务方法。
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	/**
	 * 也可用其他方式注入同事类，比如getter/setter等。
	 * 同事类必须使用构造方法注入中介类，中介类则不是必须用构造方法注入同事类。
	 * 因为同事类比有中介类，中介类可以只有部分同事类。
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
