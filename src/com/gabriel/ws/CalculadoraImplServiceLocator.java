/**
 * CalculadoraImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gabriel.ws;

public class CalculadoraImplServiceLocator extends org.apache.axis.client.Service implements com.gabriel.ws.CalculadoraImplService {

    public CalculadoraImplServiceLocator() {
    }


    public CalculadoraImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraImplPort
    private java.lang.String CalculadoraImplPort_address = "http://localhost:8082/WS/Calculadora";

    public java.lang.String getCalculadoraImplPortAddress() {
        return CalculadoraImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraImplPortWSDDServiceName = "CalculadoraImplPort";

    public java.lang.String getCalculadoraImplPortWSDDServiceName() {
        return CalculadoraImplPortWSDDServiceName;
    }

    public void setCalculadoraImplPortWSDDServiceName(java.lang.String name) {
        CalculadoraImplPortWSDDServiceName = name;
    }

    public com.gabriel.ws.Calculadora getCalculadoraImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraImplPort(endpoint);
    }

    public com.gabriel.ws.Calculadora getCalculadoraImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gabriel.ws.CalculadoraImplPortBindingStub _stub = new com.gabriel.ws.CalculadoraImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraImplPortEndpointAddress(java.lang.String address) {
        CalculadoraImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gabriel.ws.Calculadora.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gabriel.ws.CalculadoraImplPortBindingStub _stub = new com.gabriel.ws.CalculadoraImplPortBindingStub(new java.net.URL(CalculadoraImplPort_address), this);
                _stub.setPortName(getCalculadoraImplPortWSDDServiceName());
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
        if ("CalculadoraImplPort".equals(inputPortName)) {
            return getCalculadoraImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.gabriel.com/", "CalculadoraImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.gabriel.com/", "CalculadoraImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraImplPort".equals(portName)) {
            setCalculadoraImplPortEndpointAddress(address);
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
