/**
 * DoSetUserLicenceDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class DoSetUserLicenceDateResponse  implements java.io.Serializable {
    private int setDateValue;

    public DoSetUserLicenceDateResponse() {
    }

    public DoSetUserLicenceDateResponse(
           int setDateValue) {
           this.setDateValue = setDateValue;
    }


    /**
     * Gets the setDateValue value for this DoSetUserLicenceDateResponse.
     * 
     * @return setDateValue
     */
    public int getSetDateValue() {
        return setDateValue;
    }


    /**
     * Sets the setDateValue value for this DoSetUserLicenceDateResponse.
     * 
     * @param setDateValue
     */
    public void setSetDateValue(int setDateValue) {
        this.setDateValue = setDateValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSetUserLicenceDateResponse)) return false;
        DoSetUserLicenceDateResponse other = (DoSetUserLicenceDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.setDateValue == other.getSetDateValue();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getSetDateValue();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSetUserLicenceDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setDateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "setDateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}