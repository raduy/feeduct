/**
 * PaymentSellersStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class PaymentSellersStruct  implements java.io.Serializable {
    private int payTransSellerId;

    private java.lang.String payTransSellerName;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentitemsstruct payTransItems;

    private float payTransSellerPostageAmount;

    public PaymentSellersStruct() {
    }

    public PaymentSellersStruct(
           int payTransSellerId,
           java.lang.String payTransSellerName,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentitemsstruct payTransItems,
           float payTransSellerPostageAmount) {
           this.payTransSellerId = payTransSellerId;
           this.payTransSellerName = payTransSellerName;
           this.payTransItems = payTransItems;
           this.payTransSellerPostageAmount = payTransSellerPostageAmount;
    }


    /**
     * Gets the payTransSellerId value for this PaymentSellersStruct.
     * 
     * @return payTransSellerId
     */
    public int getPayTransSellerId() {
        return payTransSellerId;
    }


    /**
     * Sets the payTransSellerId value for this PaymentSellersStruct.
     * 
     * @param payTransSellerId
     */
    public void setPayTransSellerId(int payTransSellerId) {
        this.payTransSellerId = payTransSellerId;
    }


    /**
     * Gets the payTransSellerName value for this PaymentSellersStruct.
     * 
     * @return payTransSellerName
     */
    public java.lang.String getPayTransSellerName() {
        return payTransSellerName;
    }


    /**
     * Sets the payTransSellerName value for this PaymentSellersStruct.
     * 
     * @param payTransSellerName
     */
    public void setPayTransSellerName(java.lang.String payTransSellerName) {
        this.payTransSellerName = payTransSellerName;
    }


    /**
     * Gets the payTransItems value for this PaymentSellersStruct.
     * 
     * @return payTransItems
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentitemsstruct getPayTransItems() {
        return payTransItems;
    }


    /**
     * Sets the payTransItems value for this PaymentSellersStruct.
     * 
     * @param payTransItems
     */
    public void setPayTransItems(pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentitemsstruct payTransItems) {
        this.payTransItems = payTransItems;
    }


    /**
     * Gets the payTransSellerPostageAmount value for this PaymentSellersStruct.
     * 
     * @return payTransSellerPostageAmount
     */
    public float getPayTransSellerPostageAmount() {
        return payTransSellerPostageAmount;
    }


    /**
     * Sets the payTransSellerPostageAmount value for this PaymentSellersStruct.
     * 
     * @param payTransSellerPostageAmount
     */
    public void setPayTransSellerPostageAmount(float payTransSellerPostageAmount) {
        this.payTransSellerPostageAmount = payTransSellerPostageAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentSellersStruct)) return false;
        PaymentSellersStruct other = (PaymentSellersStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.payTransSellerId == other.getPayTransSellerId() &&
            ((this.payTransSellerName==null && other.getPayTransSellerName()==null) || 
             (this.payTransSellerName!=null &&
              this.payTransSellerName.equals(other.getPayTransSellerName()))) &&
            ((this.payTransItems==null && other.getPayTransItems()==null) || 
             (this.payTransItems!=null &&
              this.payTransItems.equals(other.getPayTransItems()))) &&
            this.payTransSellerPostageAmount == other.getPayTransSellerPostageAmount();
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
        _hashCode += getPayTransSellerId();
        if (getPayTransSellerName() != null) {
            _hashCode += getPayTransSellerName().hashCode();
        }
        if (getPayTransItems() != null) {
            _hashCode += getPayTransItems().hashCode();
        }
        _hashCode += new Float(getPayTransSellerPostageAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentSellersStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payTransSellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransSellerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payTransSellerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payTransItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentitemsstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransSellerPostageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payTransSellerPostageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
