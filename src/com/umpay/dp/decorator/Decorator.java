package com.umpay.dp.decorator;

public abstract class Decorator implements SchoolReport
{

	private SchoolReport sr;

	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}

	@Override
	public void report()
	{
		sr.report();
	}

	@Override
	public void sign(String name)
	{
		sr.sign(name);
	}
}
