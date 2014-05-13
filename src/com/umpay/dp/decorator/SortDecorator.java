package com.umpay.dp.decorator;

public class SortDecorator extends Decorator
{

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	public void reportSort()
	{
		System.out.println("нреецШ38...");
	}

	@Override
	public void report()
	{
		this.reportSort();
		super.report();
	}
}
