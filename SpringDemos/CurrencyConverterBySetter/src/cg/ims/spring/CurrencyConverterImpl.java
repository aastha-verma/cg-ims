package cg.ims.spring;

public class CurrencyConverterImpl implements CurrencyConverter{

	private double exchangeRate;

	@Override
	public double dollarToRupees(double dollar) {
		
		return dollar*exchangeRate;
	}
	
	public double getExchangeRate() {
		return exchangeRate;
	}
	
	public void setExchangeRate(double exchangeRate) {
		System.out.println("Setter method invoked for assigning exchange rate");
		this.exchangeRate = exchangeRate;
	}
	
	
	
}
