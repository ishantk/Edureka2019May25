/**
 * Conversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka;

public interface Conversion extends java.rmi.Remote {
    public java.lang.String register(java.lang.String name, java.lang.String phone, java.lang.String email) throws java.rmi.RemoteException;
    public int dollarToINR(int dollars) throws java.rmi.RemoteException;
    public int feetToInches(int feet) throws java.rmi.RemoteException;
    public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException;
}
