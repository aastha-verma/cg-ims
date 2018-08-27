package cg.ims.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
// 		DEPRECATED METHOD		
//		Resource r=new ClassPathResource("context.xml");
//		BeanFactory factory=new XmlBeanFactory(r);
//		
//		
//		CurrencyConverter converter = (CurrencyConverter)factory.getBean("converter");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CurrencyConverter converter = context.getBean("c1",CurrencyConverterImpl.class);
		double rupees = converter.dollarToRupees(20);
		System.out.println("Amount in rupees : "+rupees);
		
		
	}
}
