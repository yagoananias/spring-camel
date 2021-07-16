package com.brq.camel.gorest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.brq.camel.models.UsuarioModel;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsuariosProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String input = exchange.getIn().getBody(String.class);
		System.out.println(input);
		
		ObjectMapper objectMapper = new ObjectMapper();
		UsuarioModel usuarioModel = objectMapper.readValue(input, UsuarioModel.class);
		
		
	}

}