package cg.ims.spring;

public class CurrencyConverterImpl implements CurrencyConverter{
	
	private ExchangeService service;

	public CurrencyConverterImpl() {
		super();
	}

	public CurrencyConverterImpl(ExchangeService service) {
		super();
		System.out.println("Using Constructor injection");
		this.service = service;
	}
	
	@Override
	public double dollarToINR(double dollar) {
		// TODO Auto-generated method stub
		return dollar*service.getExchangeRate("INR");
	}

	@Override
	public double dollarToPKR(double dollar) {
		// TODO Auto-generated method stub
		return dollar*service.getExchangeRate("PKR");
	}

	@Override
	public double dollarToJPY(double dollar) {
		// TODO Auto-generated method stub
		return dollar*service.getExchangeRate("JPY");
	}

	@Override
	public double dollarToSGD(double dollar) {
		// TODO Auto-generated method stub
		return dollar*service.getExchangeRate("SGD");
	}
	
	
	
}
