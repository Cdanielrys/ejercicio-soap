package com.grasco.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-11-15T23:09:50.294-05:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://services.grasco.com/", name = "TestWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface TestWebService {

    @WebMethod
    @RequestWrapper(localName = "getaddEmision", targetNamespace = "http://services.grasco.com/", className = "com.grasco.services.GetaddEmision")
    @ResponseWrapper(localName = "getaddEmisionResponse", targetNamespace = "http://services.grasco.com/", className = "com.grasco.services.GetaddEmisionResponse")
    public void getaddEmision(
        @WebParam(name = "testId", targetNamespace = "")
        java.lang.String testId,
        @WebParam(mode = WebParam.Mode.OUT, name = "fueprocesado", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Boolean> fueprocesado,
        @WebParam(mode = WebParam.Mode.OUT, name = "msjerror", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> msjerror
    );

    @WebMethod
    @RequestWrapper(localName = "doTest", targetNamespace = "http://services.grasco.com/", className = "com.grasco.services.DoTest")
    @ResponseWrapper(localName = "doTestResponse", targetNamespace = "http://services.grasco.com/", className = "com.grasco.services.DoTestResponse")
    public void doTest(
        @WebParam(name = "testInput", targetNamespace = "")
        com.grasco.services.AddEmision testInput
    );
}
