package com.umpay.dp.command;

public class AddRequirementCommand extends Command
{

	@Override
	public void execute()
	{
		// �ҵ�������
		super.rg.find();

		// ����һ������
		super.rg.add();
		
		//��������һ��ҳ��
		super.pg.add();
		
		//����Գ����
		super.cg.add();

		// ����������ƻ�
		super.rg.plan();
	}

}
