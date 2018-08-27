package cg.ims.spring;

public class CurrencyConverterImpl implements CurrencyConverter{

	private double exchangeRate;

	@Override
	public double dollarToRupees(double dollar) {
		
		return dollar*exchangeRate;
	}
	
	public CurrencyConverterImpl(){}
	
	public CurrencyConverterImpl(double exchangeRate){
		System.out.println("Constructor invoked for assigning exchange rate");
		this.exchangeRate=exchangeRate;
	}
	
	
}
