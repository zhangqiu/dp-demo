package com.umpay.dp.state;

/**
 * ״̬ģʽ
 * 
 * @author apline
 * 
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(Context.closeingState); // ��ʼ״̬

		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
