/**
 * RegistratieService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.ap.ws;

public interface RegistratieService extends javax.xml.rpc.Service {
    public java.lang.String getRegistratieAddress();

    public edu.ap.ws.Registratie getRegistratie() throws javax.xml.rpc.ServiceException;

    public edu.ap.ws.Registratie getRegistratie(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
