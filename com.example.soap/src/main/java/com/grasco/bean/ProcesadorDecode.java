 package com.grasco.bean;

import java.util.Base64;



import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.LoggerFactory;



public class ProcesadorDecode implements Processor {
	
	private static org.slf4j.Logger  log = LoggerFactory.getLogger(Exchange.class);

	@Override
	public void process(Exchange exchange) throws Exception {
					
		    String facturas1 = exchange.getIn().getBody(String.class);
		    
	        byte [] fac = Base64.getDecoder().decode(facturas1);
	        String facturaDescodificada = new String(fac);
	   
	        
	        //set output in exchange
	        exchange.getOut().setBody(facturaDescodificada);
		
	}

}
