package com.grasco.exceptions;

import java.sql.SQLException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.stereotype.Component;

@Component
public class StoreProException implements Processor{

Logger log = Logger.getLogger(StoreProException.class);

@Override
public void process(Exchange exchange) throws Exception {

//    if (log.isDebugEnabled()) {
//        log.debug("Some parameter is mandatory");
//        log.debug(exchange.getIn().getHeader("exceptionStackTrace"));
//    }
   
    exchange.getContext().getShutdownStrategy().setLogInflightExchangesOnTimeout(false);
    exchange.getContext().getShutdownStrategy().setTimeout(5);
    exchange.getContext().stop();
    
}
}