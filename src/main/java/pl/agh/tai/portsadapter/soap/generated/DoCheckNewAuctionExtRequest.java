/**
 * DoCheckNewAuctionExtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class DoCheckNewAuctionExtRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue fields;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct variants;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct tags;

    public DoCheckNewAuctionExtRequest() {
    }

    public DoCheckNewAuctionExtRequest(
           java.lang.String sessionHandle,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue fields,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct variants,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct tags) {
           this.sessionHandle = sessionHandle;
           this.fields = fields;
           this.variants = variants;
           this.tags = tags;
    }


    /**
     * Gets the sessionHandle value for this DoCheckNewAuctionExtRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoCheckNewAuctionExtRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the fields value for this DoCheckNewAuctionExtRequest.
     * 
     * @return fields
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this DoCheckNewAuctionExtRequest.
     * 
     * @param fields
     */
    public void setFields(pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue fields) {
        this.fields = fields;
    }


    /**
     * Gets the variants value for this DoCheckNewAuctionExtRequest.
     * 
     * @return variants
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct getVariants() {
        return variants;
    }


    /**
     * Sets the variants value for this DoCheckNewAuctionExtRequest.
     * 
     * @param variants
     */
    public void setVariants(pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct variants) {
        this.variants = variants;
    }


    /**
     * Gets the tags value for this DoCheckNewAuctionExtRequest.
     * 
     * @return tags
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this DoCheckNewAuctionExtRequest.
     * 
     * @param tags
     */
    public void setTags(pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct tags) {
        this.tags = tags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCheckNewAuctionExtRequest)) return false;
        DoCheckNewAuctionExtRequest other = (DoCheckNewAuctionExtRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              this.fields.equals(other.getFields()))) &&
            ((this.variants==null && other.getVariants()==null) || 
             (this.variants!=null &&
              this.variants.equals(other.getVariants()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        if (getFields() != null) {
            _hashCode += getFields().hashCode();
        }
        if (getVariants() != null) {
            _hashCode += getVariants().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCheckNewAuctionExtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variants");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "variants"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfTagnamestruct"));
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
