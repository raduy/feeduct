/**
 * DoMyFeedback2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class DoMyFeedback2Response  implements java.io.Serializable {
    private pl.agh.tai.portsadapter.soap.generated.ArrayOfMyfeedbackliststruct2 myfeedbackList;

    public DoMyFeedback2Response() {
    }

    public DoMyFeedback2Response(
           pl.agh.tai.portsadapter.soap.generated.ArrayOfMyfeedbackliststruct2 myfeedbackList) {
           this.myfeedbackList = myfeedbackList;
    }


    /**
     * Gets the myfeedbackList value for this DoMyFeedback2Response.
     * 
     * @return myfeedbackList
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfMyfeedbackliststruct2 getMyfeedbackList() {
        return myfeedbackList;
    }


    /**
     * Sets the myfeedbackList value for this DoMyFeedback2Response.
     * 
     * @param myfeedbackList
     */
    public void setMyfeedbackList(pl.agh.tai.portsadapter.soap.generated.ArrayOfMyfeedbackliststruct2 myfeedbackList) {
        this.myfeedbackList = myfeedbackList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMyFeedback2Response)) return false;
        DoMyFeedback2Response other = (DoMyFeedback2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.myfeedbackList==null && other.getMyfeedbackList()==null) || 
             (this.myfeedbackList!=null &&
              this.myfeedbackList.equals(other.getMyfeedbackList())));
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
        if (getMyfeedbackList() != null) {
            _hashCode += getMyfeedbackList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoMyFeedback2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myfeedbackList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "myfeedbackList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyfeedbackliststruct2"));
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
