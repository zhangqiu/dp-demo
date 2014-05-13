package com.umpay.dp.command;

public class Client
{

	/**
	 * ����ģʽ���������װ��һ�����󣬴Ӷ�����ʹ�ò�ͬ������ѿͻ��˲��������������Ŷӻ��߼�¼������־�������ṩ����ĳ����ͻָ����ܡ�
	 * 
	 * ������ɫ��Receive�����ߣ�����Group������ʵ���ࣻCommand�����ɫ����������Ҫִ�е����Invoker�����߽�ɫ���ӿ���(��Ŀ����)������������������
	 * 
	 * Command���ReceiveҲ��ͨ��ע��ķ�ʽʵ�֡�
	 * 
	 * �ŵ㣺�����������������߸��룬���������е��������ɫ�ĳ��󷽷�������չ��Command�ɷǳ����׵���չ��������Invoker�볡���಻�������صĴ�����ϣ�������ģʽ��ϣ�������(���������)��ģ�巽��(����Command��������)
	 * 
	 * ȱ�㣺����̫�࣬��ʹCommand�������͵ķǳ���
	 * 
	 * ������GUI��һ����ť�����һ�����ģ��DOS�������-�������ƵĴ���
	 */
	public static void main(String[] args)
	{
		Invoker xiaoSan = new Invoker(); // С���ǿͻ���ͷ��

		//�ͻ�Clientֻ�跢��һ������ͺã�������ĺ�����ôЭ��������ģʽ����һ��ܺõķ�װ��
		Command command1 = new AddRequirementCommand();
		xiaoSan.setCommand(command1);
		xiaoSan.action();
		
		
		Command command2 = new DeletePageCommand();
		xiaoSan.setCommand(command2);
		xiaoSan.action();
		
		Command command3 = new CancelDeletePageCommand();
		xiaoSan.setCommand(command3);
		xiaoSan.action();
	}
}
