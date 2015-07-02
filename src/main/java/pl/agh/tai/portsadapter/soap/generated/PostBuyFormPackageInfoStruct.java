/**
 * PostBuyFormPackageInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class PostBuyFormPackageInfoStruct  implements java.io.Serializable {
    private pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsAdded;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsNotAddedIncorrectOperatorId;

    private pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsNotAddedIncorrectPackageId;

    public PostBuyFormPackageInfoStruct() {
    }

    public PostBuyFormPackageInfoStruct(
           pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsAdded,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsNotAddedIncorrectOperatorId,
           pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsNotAddedIncorrectPackageId) {
           this.packageIdsAdded = packageIdsAdded;
           this.packageIdsNotAddedIncorrectOperatorId = packageIdsNotAddedIncorrectOperatorId;
           this.packageIdsNotAddedIncorrectPackageId = packageIdsNotAddedIncorrectPackageId;
    }


    /**
     * Gets the packageIdsAdded value for this PostBuyFormPackageInfoStruct.
     * 
     * @return packageIdsAdded
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfString getPackageIdsAdded() {
        return packageIdsAdded;
    }


    /**
     * Sets the packageIdsAdded value for this PostBuyFormPackageInfoStruct.
     * 
     * @param packageIdsAdded
     */
    public void setPackageIdsAdded(pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsAdded) {
        this.packageIdsAdded = packageIdsAdded;
    }


    /**
     * Gets the packageIdsNotAddedIncorrectOperatorId value for this PostBuyFormPackageInfoStruct.
     * 
     * @return packageIdsNotAddedIncorrectOperatorId
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfString getPackageIdsNotAddedIncorrectOperatorId() {
        return packageIdsNotAddedIncorrectOperatorId;
    }


    /**
     * Sets the packageIdsNotAddedIncorrectOperatorId value for this PostBuyFormPackageInfoStruct.
     * 
     * @param packageIdsNotAddedIncorrectOperatorId
     */
    public void setPackageIdsNotAddedIncorrectOperatorId(pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsNotAddedIncorrectOperatorId) {
        this.packageIdsNotAddedIncorrectOperatorId = packageIdsNotAddedIncorrectOperatorId;
    }


    /**
     * Gets the packageIdsNotAddedIncorrectPackageId value for this PostBuyFormPackageInfoStruct.
     * 
     * @return packageIdsNotAddedIncorrectPackageId
     */
    public pl.agh.tai.portsadapter.soap.generated.ArrayOfString getPackageIdsNotAddedIncorrectPackageId() {
        return packageIdsNotAddedIncorrectPackageId;
    }


    /**
     * Sets the packageIdsNotAddedIncorrectPackageId value for this PostBuyFormPackageInfoStruct.
     * 
     * @param packageIdsNotAddedIncorrectPackageId
     */
    public void setPackageIdsNotAddedIncorrectPackageId(pl.agh.tai.portsadapter.soap.generated.ArrayOfString packageIdsNotAddedIncorrectPackageId) {
        this.packageIdsNotAddedIncorrectPackageId = packageIdsNotAddedIncorrectPackageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormPackageInfoStruct)) return false;
        PostBuyFormPackageInfoStruct other = (PostBuyFormPackageInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageIdsAdded==null && other.getPackageIdsAdded()==null) || 
             (this.packageIdsAdded!=null &&
              this.packageIdsAdded.equals(other.getPackageIdsAdded()))) &&
            ((this.packageIdsNotAddedIncorrectOperatorId==null && other.getPackageIdsNotAddedIncorrectOperatorId()==null) || 
             (this.packageIdsNotAddedIncorrectOperatorId!=null &&
              this.packageIdsNotAddedIncorrectOperatorId.equals(other.getPackageIdsNotAddedIncorrectOperatorId()))) &&
            ((this.packageIdsNotAddedIncorrectPackageId==null && other.getPackageIdsNotAddedIncorrectPackageId()==null) || 
             (this.packageIdsNotAddedIncorrectPackageId!=null &&
              this.packageIdsNotAddedIncorrectPackageId.equals(other.getPackageIdsNotAddedIncorrectPackageId())));
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
        if (getPackageIdsAdded() != null) {
            _hashCode += getPackageIdsAdded().hashCode();
        }
        if (getPackageIdsNotAddedIncorrectOperatorId() != null) {
            _hashCode += getPackageIdsNotAddedIncorrectOperatorId().hashCode();
        }
        if (getPackageIdsNotAddedIncorrectPackageId() != null) {
            _hashCode += getPackageIdsNotAddedIncorrectPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormPackageInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageIdsAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsNotAddedIncorrectOperatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageIdsNotAddedIncorrectOperatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsNotAddedIncorrectPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageIdsNotAddedIncorrectPackageId"));
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
