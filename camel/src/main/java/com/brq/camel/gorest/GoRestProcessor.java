package com.brq.camel.gorest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GoRestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String input = exchange.getIn().getBody(String.class);
		System.out.println("GoRestProcessor" + input);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		ResponseGoRestModel responseGoRestModel = objectMapper.readValue(input, ResponseGoRestModel.class);

		RestTemplate restTemplate = new RestTemplate();
		
		for (DataGoRestModel usuario : responseGoRestModel.getData()) {
			HttpEntity<DataGoRestModel> request = new HttpEntity<>(usuario);
			restTemplate.postForObject("http://localhost:8080/usuarios", request, DataGoRestModel.class);
		}

		
	}

}