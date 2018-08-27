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
		CurrencyConverter converter = context.getBean("converter",CurrencyConverterImpl.class);
		double a1 = converter.dollarToINR(20);
		double a2 = converter.dollarToPKR(20);
		double a3 = converter.dollarToJPY(20);
		double a4 = converter.dollarToSGD(20);
		System.out.println("Amount in Indian rupees : "+a1);
		System.out.println("Amount in Pakistan rupees : "+a2);
		System.out.println("Amount in Japanese yen : "+a3);
		System.out.println("Amount in Singapore dollars : "+a4);
		
		
	}
}
