package com.brq.camel.gorest;

import org.springframework.stereotype.Component;
import org.apache.camel.builder.RouteBuilder;

@Component
public class GoRestRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:gorest?period=50000")
		.to("https://gorest.co.in/public/v1/users")
		.process(new GoRestProcessor())
		.log("${body}");
		
	}

}
