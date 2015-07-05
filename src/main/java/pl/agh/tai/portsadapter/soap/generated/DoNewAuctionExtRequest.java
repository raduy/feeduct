/**
 * DoNewAuctionExtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class DoNewAuctionExtRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue fields;

    private java.lang.Integer itemTemplateId;

    private java.lang.Integer localId;

    private pl.agh.tai.portsadapter.soap.generated.ItemTemplateCreateStruct itemTemplateCreate;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct variants;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct tags;

    public DoNewAuctionExtRequest() {
    }

    public DoNewAuctionExtRequest(
           java.lang.String sessionHandle,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue fields,
           java.lang.Integer itemTemplateId,
           java.lang.Integer localId,
           pl.agh.tai.portsadapter.soap.generated.ItemTemplateCreateStruct itemTemplateCreate,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct variants,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct tags) {
           this.sessionHandle = sessionHandle;
           this.fields = fields;
           this.itemTemplateId = itemTemplateId;
           this.localId = localId;
           this.itemTemplateCreate = itemTemplateCreate;
           this.variants = variants;
           this.tags = tags;
    }


    /**
     * Gets the sessionHandle value for this DoNewAuctionExtRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoNewAuctionExtRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the fields value for this DoNewAuctionExtRequest.
     * 
     * @return fields
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this DoNewAuctionExtRequest.
     * 
     * @param fields
     */
    public void setFields(pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue fields) {
        this.fields = fields;
    }


    /**
     * Gets the itemTemplateId value for this DoNewAuctionExtRequest.
     * 
     * @return itemTemplateId
     */
    public java.lang.Integer getItemTemplateId() {
        return itemTemplateId;
    }


    /**
     * Sets the itemTemplateId value for this DoNewAuctionExtRequest.
     * 
     * @param itemTemplateId
     */
    public void setItemTemplateId(java.lang.Integer itemTemplateId) {
        this.itemTemplateId = itemTemplateId;
    }


    /**
     * Gets the localId value for this DoNewAuctionExtRequest.
     * 
     * @return localId
     */
    public java.lang.Integer getLocalId() {
        return localId;
    }


    /**
     * Sets the localId value for this DoNewAuctionExtRequest.
     * 
     * @param localId
     */
    public void setLocalId(java.lang.Integer localId) {
        this.localId = localId;
    }


    /**
     * Gets the itemTemplateCreate value for this DoNewAuctionExtRequest.
     * 
     * @return itemTemplateCreate
     */
    public pl.agh.tai.portsadapter.soap.generated.ItemTemplateCreateStruct getItemTemplateCreate() {
        return itemTemplateCreate;
    }


    /**
     * Sets the itemTemplateCreate value for this DoNewAuctionExtRequest.
     * 
     * @param itemTemplateCreate
     */
    public void setItemTemplateCreate(pl.agh.tai.portsadapter.soap.generated.ItemTemplateCreateStruct itemTemplateCreate) {
        this.itemTemplateCreate = itemTemplateCreate;
    }


    /**
     * Gets the variants value for this DoNewAuctionExtRequest.
     * 
     * @return variants
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct getVariants() {
        return variants;
    }


    /**
     * Sets the variants value for this DoNewAuctionExtRequest.
     * 
     * @param variants
     */
    public void setVariants(pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct variants) {
        this.variants = variants;
    }


    /**
     * Gets the tags value for this DoNewAuctionExtRequest.
     * 
     * @return tags
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this DoNewAuctionExtRequest.
     * 
     * @param tags
     */
    public void setTags(pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct tags) {
        this.tags = tags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoNewAuctionExtRequest)) return false;
        DoNewAuctionExtRequest other = (DoNewAuctionExtRequest) obj;
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
            ((this.itemTemplateId==null && other.getItemTemplateId()==null) || 
             (this.itemTemplateId!=null &&
              this.itemTemplateId.equals(other.getItemTemplateId()))) &&
            ((this.localId==null && other.getLocalId()==null) || 
             (this.localId!=null &&
              this.localId.equals(other.getLocalId()))) &&
            ((this.itemTemplateCreate==null && other.getItemTemplateCreate()==null) || 
             (this.itemTemplateCreate!=null &&
              this.itemTemplateCreate.equals(other.getItemTemplateCreate()))) &&
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
        if (getItemTemplateId() != null) {
            _hashCode += getItemTemplateId().hashCode();
        }
        if (getLocalId() != null) {
            _hashCode += getLocalId().hashCode();
        }
        if (getItemTemplateCreate() != null) {
            _hashCode += getItemTemplateCreate().hashCode();
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
        new org.apache.axis.description.TypeDesc(DoNewAuctionExtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest"));
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
        elemField.setFieldName("itemTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "localId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateCreateStruct"));
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
