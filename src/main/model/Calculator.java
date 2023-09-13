package main.model;

import main.Interface.ICalculator;

public class Calculator implements ICalculator {

	@Override
	public double somar(double var1, double var2) {
		double var3 = var1 + var2;
		return var3;
	}

	@Override
	public double subitrair(double var1, double var2) {
		double var3 = var1 - var2;
		return var3;
	}

	@Override
	public double dividir(double var1, double var2) {
		double var3 = var1 /var2;
		return var3;
	}

	@Override
	public double multiplicar(double var1, double var2) {
		double var3 = var1 * var2;
		return var3;
	}
	
	

}
