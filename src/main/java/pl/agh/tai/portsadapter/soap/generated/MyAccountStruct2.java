/**
 * MyAccountStruct2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class MyAccountStruct2  implements java.io.Serializable {
    private pl.agh.tai.portsadapter.soap.generated.ArrayOfString myAccountArray;

    public MyAccountStruct2() {
    }

    public MyAccountStruct2(
           pl.agh.tai.portsadapter.soap.generated.ArrayOfString myAccountArray) {
           this.myAccountArray = myAccountArray;
    }


    /**
     * Gets the myAccountArray value for this MyAccountStruct2.
     * 
     * @return myAccountArray
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfString getMyAccountArray() {
        return myAccountArray;
    }


    /**
     * Sets the myAccountArray value for this MyAccountStruct2.
     * 
     * @param myAccountArray
     */
    public void setMyAccountArray(pl.agh.tai.portsadapter.soap.generated.ArrayOfString myAccountArray) {
        this.myAccountArray = myAccountArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyAccountStruct2)) return false;
        MyAccountStruct2 other = (MyAccountStruct2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.myAccountArray==null && other.getMyAccountArray()==null) || 
             (this.myAccountArray!=null &&
              this.myAccountArray.equals(other.getMyAccountArray())));
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
        if (getMyAccountArray() != null) {
            _hashCode += getMyAccountArray().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyAccountStruct2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myAccountArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "myAccountArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
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
