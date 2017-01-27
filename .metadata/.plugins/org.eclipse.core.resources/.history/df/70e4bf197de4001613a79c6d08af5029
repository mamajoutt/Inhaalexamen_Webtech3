/**
 * RegistratieServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.ap.ws;

public class RegistratieServiceLocator extends org.apache.axis.client.Service implements edu.ap.ws.RegistratieService {

    public RegistratieServiceLocator() {
    }


    public RegistratieServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegistratieServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Registratie
    private java.lang.String Registratie_address = "http://localhost:8080/Vraag1/services/Registratie";

    public java.lang.String getRegistratieAddress() {
        return Registratie_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RegistratieWSDDServiceName = "Registratie";

    public java.lang.String getRegistratieWSDDServiceName() {
        return RegistratieWSDDServiceName;
    }

    public void setRegistratieWSDDServiceName(java.lang.String name) {
        RegistratieWSDDServiceName = name;
    }

    public edu.ap.ws.Registratie getRegistratie() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Registratie_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegistratie(endpoint);
    }

    public edu.ap.ws.Registratie getRegistratie(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.ap.ws.RegistratieSoapBindingStub _stub = new edu.ap.ws.RegistratieSoapBindingStub(portAddress, this);
            _stub.setPortName(getRegistratieWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegistratieEndpointAddress(java.lang.String address) {
        Registratie_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.ap.ws.Registratie.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.ap.ws.RegistratieSoapBindingStub _stub = new edu.ap.ws.RegistratieSoapBindingStub(new java.net.URL(Registratie_address), this);
                _stub.setPortName(getRegistratieWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Registratie".equals(inputPortName)) {
            return getRegistratie();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.ap.edu", "RegistratieService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.ap.edu", "Registratie"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Registratie".equals(portName)) {
            setRegistratieEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
