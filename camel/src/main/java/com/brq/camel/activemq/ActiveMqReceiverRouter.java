package com.brq.camel.activemq;

import org.apache.camel.builder.RouteBuilder;

public class ActiveMqReceiverRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("activemq:my-active-mq")
		.to("log:amq");
		
	}

}
