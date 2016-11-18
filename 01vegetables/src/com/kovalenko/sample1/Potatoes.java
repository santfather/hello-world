package com.kovalenko.sample1;

public abstract class Potatoes extends Vegetable {
	
	public Potatoes(int kcal, String name) {
		super(kcal, name);
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void peel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cut() {
		cutSlice();
	}

	@Override
	public void boil() {
		// TODO Auto-generated method stub
		
	}

	public abstract void cutSlice();

}