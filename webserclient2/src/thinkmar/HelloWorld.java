/**
 * HelloWorld.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package thinkmar;

import javax.jws.WebService;
import java.rmi.Remote;
import java.rmi.RemoteException;

@WebService
public interface HelloWorld extends Remote {
    public String sayHelloWorldFrom(String arg0) throws RemoteException;
}
