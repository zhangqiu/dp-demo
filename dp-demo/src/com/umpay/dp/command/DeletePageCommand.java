package com.umpay.dp.command;

public class DeletePageCommand extends Command
{

	@Override
	public void execute()
	{
		// �ҵ�������
		super.pg.find();
		
		//��ɾ������
		super.rg.delete();

		// ɾ��һ��ҳ��
		super.pg.delete();
		
		// ɾ��ҳ�湦��
		super.cg.delete();

		// ����������ƻ�
		super.rg.plan();
	}

}
