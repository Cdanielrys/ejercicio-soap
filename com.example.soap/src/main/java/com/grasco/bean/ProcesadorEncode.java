package com.grasco.bean;

import java.util.Base64;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcesadorEncode implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String responseEncode = Base64.getEncoder().encodeToString(exchange.getIn().getBody(String.class).getBytes("utf-8"));		
		exchange.getOut().setBody(responseEncode);
	}

}
