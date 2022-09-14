package com.maveric.barrista;

public abstract class BeverageDecorator implements Beverage {

	Beverage beverage;

	@Override
	public abstract String getDescription();

}
