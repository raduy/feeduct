/**
 * ArrayOfFilterslisttype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class ArrayOfFilterslisttype  implements java.io.Serializable {
    private pl.agh.tai.portsadapter.soap.generated.FiltersListType[] item;

    public ArrayOfFilterslisttype() {
    }

    public ArrayOfFilterslisttype(
           pl.agh.tai.portsadapter.soap.generated.FiltersListType[] item) {
           this.item = item;
    }


    /**
     * Gets the item value for this ArrayOfFilterslisttype.
     * 
     * @return item
     */
    public pl.agh.tai.portsadapter.soap.generated.FiltersListType[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this ArrayOfFilterslisttype.
     * 
     * @param item
     */
    public void setItem(pl.agh.tai.portsadapter.soap.generated.FiltersListType[] item) {
        this.item = item;
    }

    public pl.agh.tai.portsadapter.soap.generated.FiltersListType getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, pl.agh.tai.portsadapter.soap.generated.FiltersListType _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfFilterslisttype)) return false;
        ArrayOfFilterslisttype other = (ArrayOfFilterslisttype) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem())));
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
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfFilterslisttype.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilterslisttype"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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