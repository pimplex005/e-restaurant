
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Poloniex", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Poloniex {


    /**
     * 
     * @param type
     * @return
     *     returns service.CryotCurrency
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ech", targetNamespace = "http://service/", className = "service.Ech")
    @ResponseWrapper(localName = "echResponse", targetNamespace = "http://service/", className = "service.EchResponse")
    @Action(input = "http://service/Poloniex/echRequest", output = "http://service/Poloniex/echResponse")
    public CryotCurrency ech(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Ajouter")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Ajouter", targetNamespace = "http://service/", className = "service.Ajouter")
    @ResponseWrapper(localName = "AjouterResponse", targetNamespace = "http://service/", className = "service.AjouterResponse")
    @Action(input = "http://service/Poloniex/AjouterRequest", output = "http://service/Poloniex/AjouterResponse")
    public boolean ajouter(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2);

}