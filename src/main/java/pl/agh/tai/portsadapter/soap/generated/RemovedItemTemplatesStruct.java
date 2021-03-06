/**
 * RemovedItemTemplatesStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class RemovedItemTemplatesStruct  implements java.io.Serializable {
    private int[] itemTemplateIds;

    private int[] itemTemplateIncorrectIds;

    public RemovedItemTemplatesStruct() {
    }

    public RemovedItemTemplatesStruct(
           int[] itemTemplateIds,
           int[] itemTemplateIncorrectIds) {
           this.itemTemplateIds = itemTemplateIds;
           this.itemTemplateIncorrectIds = itemTemplateIncorrectIds;
    }


    /**
     * Gets the itemTemplateIds value for this RemovedItemTemplatesStruct.
     * 
     * @return itemTemplateIds
     */
    public int[] getItemTemplateIds() {
        return itemTemplateIds;
    }


    /**
     * Sets the itemTemplateIds value for this RemovedItemTemplatesStruct.
     * 
     * @param itemTemplateIds
     */
    public void setItemTemplateIds(int[] itemTemplateIds) {
        this.itemTemplateIds = itemTemplateIds;
    }


    /**
     * Gets the itemTemplateIncorrectIds value for this RemovedItemTemplatesStruct.
     * 
     * @return itemTemplateIncorrectIds
     */
    public int[] getItemTemplateIncorrectIds() {
        return itemTemplateIncorrectIds;
    }


    /**
     * Sets the itemTemplateIncorrectIds value for this RemovedItemTemplatesStruct.
     * 
     * @param itemTemplateIncorrectIds
     */
    public void setItemTemplateIncorrectIds(int[] itemTemplateIncorrectIds) {
        this.itemTemplateIncorrectIds = itemTemplateIncorrectIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovedItemTemplatesStruct)) return false;
        RemovedItemTemplatesStruct other = (RemovedItemTemplatesStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemTemplateIds==null && other.getItemTemplateIds()==null) || 
             (this.itemTemplateIds!=null &&
              java.util.Arrays.equals(this.itemTemplateIds, other.getItemTemplateIds()))) &&
            ((this.itemTemplateIncorrectIds==null && other.getItemTemplateIncorrectIds()==null) || 
             (this.itemTemplateIncorrectIds!=null &&
              java.util.Arrays.equals(this.itemTemplateIncorrectIds, other.getItemTemplateIncorrectIds())));
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
        if (getItemTemplateIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemTemplateIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemTemplateIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemTemplateIncorrectIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemTemplateIncorrectIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemTemplateIncorrectIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovedItemTemplatesStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RemovedItemTemplatesStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-template-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateIncorrectIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-template-incorrect-ids"));
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
