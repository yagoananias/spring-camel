package com.brq.camel.covid;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CovidProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String input = exchange.getIn().getBody(String.class);
		System.out.println(input);	
		
	}

}
