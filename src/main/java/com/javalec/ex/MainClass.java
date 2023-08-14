package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);	
		MyCalculation myCalculation = ctx.getBean("myCalculation", MyCalculation.class);
		myCalculation.setFirstNum(10);
		myCalculation.setSecondNum(2);
		
		myCalculation.add();
		myCalculation.sub();
		myCalculation.mult();
		myCalculation.div();
	}
}
