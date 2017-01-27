package edu.ap.ws;

public class RegistratieProxy implements edu.ap.ws.Registratie {
  private String _endpoint = null;
  private edu.ap.ws.Registratie registratie = null;
  
  public RegistratieProxy() {
    _initRegistratieProxy();
  }
  
  public RegistratieProxy(String endpoint) {
    _endpoint = endpoint;
    _initRegistratieProxy();
  }
  
  private void _initRegistratieProxy() {
    try {
      registratie = (new edu.ap.ws.RegistratieServiceLocator()).getRegistratie();
      if (registratie != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)registratie)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)registratie)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (registratie != null)
      ((javax.xml.rpc.Stub)registratie)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.ap.ws.Registratie getRegistratie() {
    if (registratie == null)
      _initRegistratieProxy();
    return registratie;
  }
  
  public java.lang.String addRegistratie(java.lang.String xml) throws java.rmi.RemoteException{
    if (registratie == null)
      _initRegistratieProxy();
    return registratie.addRegistratie(xml);
  }
  
  public java.lang.String getRegistraties() throws java.rmi.RemoteException{
    if (registratie == null)
      _initRegistratieProxy();
    return registratie.getRegistraties();
  }
  
  
}