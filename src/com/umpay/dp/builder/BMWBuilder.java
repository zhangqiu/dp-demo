package com.umpay.dp.builder;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder
{
	private BMWModel bmoModel = new BMWModel();

	@Override
	public void setSequence(ArrayList<Integer> sequence)
	{
		this.bmoModel.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel()
	{
		return this.bmoModel;
	}

}
