package com.umpay.dp.builder;

import java.util.ArrayList;

public class Director
{

	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	private ArrayList<Integer> sequence = new ArrayList<Integer>();

	public CarModel getABenzModel()
	{
		this.sequence.clear(); // ��������Ҫ����ϰ��
		sequence.add(CarModel.ENGINE_BOOM);
		sequence.add(CarModel.START);
		sequence.add(CarModel.STOP);
		benzBuilder.setSequence(sequence);

		return benzBuilder.getCarModel();
	}

	public CarModel getBBenzModel()
	{
		this.sequence.clear();// ��������Ҫ����ϰ��
		sequence.add(CarModel.ENGINE_BOOM);
		sequence.add(CarModel.START);
		sequence.add(CarModel.ALARM);
		sequence.add(CarModel.STOP);
		benzBuilder.setSequence(sequence);

		return benzBuilder.getCarModel();
	}

	public CarModel getCBMWModel()
	{
		this.sequence.clear();// ��������Ҫ����ϰ��
		sequence.add(CarModel.ENGINE_BOOM);
		sequence.add(CarModel.START);
		sequence.add(CarModel.ALARM);
		bmwBuilder.setSequence(sequence);

		return bmwBuilder.getCarModel();
	}

	public CarModel getDBMWModel()
	{
		this.sequence.clear();// ��������Ҫ����ϰ��
		sequence.add(CarModel.ENGINE_BOOM);
		sequence.add(CarModel.START);
		sequence.add(CarModel.ALARM);
		sequence.add(CarModel.STOP);
		bmwBuilder.setSequence(sequence);

		return bmwBuilder.getCarModel();
	}
}
