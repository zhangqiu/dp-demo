package com.umpay.dp.state;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("电梯门打开...");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.closeingState);
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		// do nothing
	}

	@Override
	public void stop() {
		// do nothing
	}
}
