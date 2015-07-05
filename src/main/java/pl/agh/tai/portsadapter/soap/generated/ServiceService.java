/**
 * ServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public interface ServiceService extends javax.xml.rpc.Service {
    public java.lang.String getservicePortAddress();

    public pl.agh.tai.portsadapter.soap.generated.ServicePort_PortType getservicePort() throws javax.xml.rpc.ServiceException;

    public pl.agh.tai.portsadapter.soap.generated.ServicePort_PortType getservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
