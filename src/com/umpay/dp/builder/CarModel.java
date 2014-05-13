package com.umpay.dp.builder;

import java.util.ArrayList;

public abstract class CarModel
{
	public final static int ENGINE_BOOM = 1;
	public final static int START = 2;
	public final static int STOP = 3;
	public final static int ALARM = 4;

	private ArrayList<Integer> sequence = new ArrayList<Integer>();

	public abstract void start();
	public abstract void stop();
	public abstract void alarm();
	public abstract void engineBoom();

	public void run()
	{
		for (int i = 0; i < sequence.size(); i++)
		{
			int actionName = sequence.get(i).intValue();

			switch (actionName)
			{
				case ENGINE_BOOM :
					this.engineBoom();
					break;
				case START :
					this.start();
					break;
				case STOP :
					this.stop();
					break;
				case ALARM :
					this.alarm();
					break;
				default :
					break;
			}
		}
	}

	public void setSequence(ArrayList<Integer> sequence)
	{
		this.sequence = sequence;
	}
}
