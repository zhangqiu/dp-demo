package com.umpay.dp.command;

public abstract class Command
{

	protected final RequirementGroup rg;
	protected final PageGroup pg;
	protected final CodeGroup cg;

	//ReceiverҲ��ͨ������/setter����ע��
	public Command() {
		rg = new RequirementGroup();
		pg = new PageGroup();
		cg = new CodeGroup();

	}

	public abstract void execute();
}
