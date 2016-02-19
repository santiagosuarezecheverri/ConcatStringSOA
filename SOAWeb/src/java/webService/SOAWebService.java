/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Santiago
 */
@WebService(serviceName = "SOAWebService")
public class SOAWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "concatenar")
    public String concatenar(@WebParam(name = "cadena1") String cadena1, @WebParam(name = "cadena2") String cadena2) {
        //TODO write your implementation code here:
        return cadena1.concat(cadena2);
    }

}
