package com.umpay.dp.mediator;

public class Client
{

	/**
	 * 中介者模式，也叫调停者模式。用一个中介对象，封装一系列的对象交互，中介者使各对象不需要明显的相互作用。从而使耦合松散，且可以独立第改变他们之间的交互。
	 * 
	 * 优势：减少依赖，由1对多变为1对1.降低了类间耦合。
	 * 
	 * 缺点：中介者会膨胀的很大，且逻辑复杂。同事类越多，中介者就越复杂。
	 * 
	 * 使用场景：当类图变成网状结构时，可使用中介者，变成星型结构。
	 * 
	 * 实际应用：MVC中的C(Controller)就是一个中介者，也叫前端控制器。它把M和V隔离开，并协调M和V协同工作。
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
		// purchase.buyIBMcomputer(100); // 买电脑
		// System.out.println("------------------------");
		// sale.sellIBMComputer(1);// 卖电脑
		// System.out.println("------------------------");
		// stock.clearStock();// 清仓

		AbstractMediator mediator = new Mediator();

		System.out.println("------------------------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100); // 买电脑

		System.out.println("------------------------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);// 卖电脑

		System.out.println("------------------------");
		Stock stock = new Stock(mediator);
		stock.clearStock();// 清仓
	}

}
