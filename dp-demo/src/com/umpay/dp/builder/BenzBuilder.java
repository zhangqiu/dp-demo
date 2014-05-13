package com.umpay.dp.builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder
{
	private BenzModel benzModel = new BenzModel();

	@Override
	public void setSequence(ArrayList<Integer> sequence)
	{
		this.benzModel.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel()
	{
		return this.benzModel;
	}

}
