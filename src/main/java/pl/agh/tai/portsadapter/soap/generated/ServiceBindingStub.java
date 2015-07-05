/**
 * ServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public class ServiceBindingStub extends org.apache.axis.client.Stub implements pl.agh.tai.portsadapter.soap.generated.ServicePort_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[126];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddDescToItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddDescToItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddPackageInfoToPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest"), pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddPackageInfoToPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest"), pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToWatchListRequest"), pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToWatchListResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest"), pl.agh.tai.portsadapter.soap.generated.DoBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest"), pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest"), pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundWarning");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundWarningRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningRequest"), pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundWarningResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest"), pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest"), pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangePriceItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest"), pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangePriceItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeQuantityItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest"), pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeQuantityItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckItemDescriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest"), pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckItemDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest"), pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCreateItemTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCreateItemTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest"), pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCreateItemTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest"), pl.agh.tai.portsadapter.soap.generated.DoFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackManyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest"), pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackManyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest"), pl.agh.tai.portsadapter.soap.generated.DoFinishItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoFinishItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoFinishItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoFinishItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetAdminUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetAdminUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetArchiveRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetArchiveRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetArchiveRefundsListRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetArchiveRefundsListResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetArchiveRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBidItem2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request"), pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBidItem2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBlackListUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBlackListUsersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCategoryPathRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCategoryPathResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFilledPostBuyFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFilledPostBuyFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsImagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsImagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetItemsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetItemsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMessageToBuyer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMessageToBuyerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMessageToBuyerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyBidItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyBidItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyCurrentShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyFutureItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyFutureItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotSoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotSoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPayoutsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPayoutsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellRatingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellRatingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWatchItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWatchItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWatchedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchedItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchedItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWatchedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentMethodsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentMethodsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForBuyersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForBuyersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyItemInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyItemInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormAttribsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormAttribsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsForCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsForCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellRatingReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellRatingReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSessionHandleForWidgetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSessionHandleForWidgetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentDataForRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataForRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataForRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentPriceTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentPriceTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopsTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShopsTagsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopsTagsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopsTagsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShopsTagsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetStatesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetStatesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSystemTimeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSystemTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetTransactionsIDsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetTransactionsIDsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetUserIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetUserIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest"), pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doInternalIStoreChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoInternalIStoreChangeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoInternalIStoreChangeRequest"), pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doInternalIStoreChangeResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doInternalIStoreChangeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest"), pl.agh.tai.portsadapter.soap.generated.DoLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginEncRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest"), pl.agh.tai.portsadapter.soap.generated.DoLoginEncRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoLoginEncResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginEncResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginWithAccessToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginWithAccessTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest"), pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginWithAccessTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccount2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request"), pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccount2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccountItemsCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest"), pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccountItemsCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest"), pl.agh.tai.portsadapter.soap.generated.DoMyBillingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoMyBillingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest"), pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyContactRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest"), pl.agh.tai.portsadapter.soap.generated.DoMyContactRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoMyContactResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyContactResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request"), pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2LimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest"), pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2LimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest"), pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQueryAllSysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest"), pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQueryAllSysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQuerySysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest"), pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQuerySysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest"), pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromWatchListRequest"), pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromWatchListResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest"), pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestCancelBidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest"), pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestCancelBidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestPayoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest"), pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestPayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestSurchargeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest"), pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestSurchargeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest"), pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainInShopRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest"), pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainInShopResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendEmailToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest"), pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendEmailToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest"), pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest"), pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest"), pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest"), pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest"), pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowItemInfoExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest"), pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowItemInfoExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest"), pl.agh.tai.portsadapter.soap.generated.DoShowUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoShowUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUserPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowUserPageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserPageRequest"), pl.agh.tai.portsadapter.soap.generated.DoShowUserPageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserPageResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoShowUserPageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowUserPageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoVerifyItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest"), pl.agh.tai.portsadapter.soap.generated.DoVerifyItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse"));
        oper.setReturnClass(pl.agh.tai.portsadapter.soap.generated.DoVerifyItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doVerifyItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

    }

    public ServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToWatchListRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToWatchListResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFinishItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFinishItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFinishItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoFinishItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetArchiveRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetArchiveRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCountriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetCountriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchedItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchedItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopsTagsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopsTagsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetUserIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetUserIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoInternalIStoreChangeRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doInternalIStoreChangeResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoLoginEncRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoLoginEncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyBillingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyBillingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyContactRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyContactResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromWatchListRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromWatchListResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserPageRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoShowUserPageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserPageResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoShowUserPageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoShowUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoShowUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoVerifyItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DoVerifyItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ActionDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ActionDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.AddressInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.AddressUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.AdvertInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AlcoholDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.AlcoholDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AmountStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.AmountStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArchiveRefundsListTypeStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArchiveRefundsListTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfActiondatastruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfActiondatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAddressinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfAddressinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfArchiverefundslisttypestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfArchiverefundslisttypestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAttribstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfAttribstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBiditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfBiditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBidliststruct2");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfBidliststruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBillingdatatype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfBillingdatatype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlacklistresstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfBlacklistresstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlackliststruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfBlackliststruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorydata");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfCategorydata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorypathtype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfCategorypathtype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorytreetype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfCategorytreetype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCatinfotype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfCatinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCountryinfotype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfCountryinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfDealsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfDealsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritescategoriesstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFavouritescategoriesstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritessellersstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFavouritessellersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbacklist");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFeedbacklist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackmanystruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFeedbackmanystruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFeedbackresultstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFieldsvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilteroptionstype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFilteroptionstype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilterslisttype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFilterslisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFiltervaluetype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFiltervaluetype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishfailurestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFinishfailurestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishitemsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFinishitemsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFutureitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfFutureitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItembilling");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItembilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemcatlist");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemcatlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemgetimage");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemgetimage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagelist");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemimagelist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagesstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemimagesstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfIteminfostruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfIteminfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItempostbuydatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempricestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItempricestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemreminderstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemreminderstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemremovewatchstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemremovewatchstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemslisttype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemslisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsnotaddedstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemsnotaddedstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsurchargestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemsurchargestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemtemplateliststruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemtemplateliststruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemvariantattributestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemvariantattributestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemvariantstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfItemvariantstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfLong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyaccountstruct2");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfMyaccountstruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMycontactlist");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfMycontactlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyfeedbackliststruct2");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfMyfeedbackliststruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNewpostbuyformsellerstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfNewpostbuyformsellerstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotsolditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfNotsolditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotwonitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfNotwonitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPackageinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPackageinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfParameterinfotype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfParameterinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentdetailsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentdetailsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentitemsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentitemsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentmethodstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentmethodstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentsellersstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPaymentsellersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPhotoinfotype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPhotoinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostagestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostagestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostbuyformdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformforbuyersdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostbuyformforbuyersdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemdealsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostbuyformitemdealsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostbuyformitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformsellersstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostbuyformsellersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformshipmenttrackingstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostbuyformshipmenttrackingstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyiteminfostruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPostbuyiteminfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPriceinfotype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfPriceinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersgroupstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfProductparametersgroupstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfProductparametersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfReasoninfotype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfReasoninfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundlisttype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfRefundlisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundsdealslisttype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfRefundsdealslisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRelateditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfRelateditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellershipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellershipmentdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellformtype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellformtype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragepermonthstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratingaveragepermonthstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratingaveragestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingdetailstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratingdetailstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingestimationstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratingestimationstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratinginfostruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratinginfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratingreasonstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonsumstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratingreasonsumstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingstatsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSellratingstatsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfShipmentdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpaymentinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfShipmentpaymentinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpricetypestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfShipmentpricetypestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShopstagtypestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfShopstagtypestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournal");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSitejournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournaldealsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSitejournaldealsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSolditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSolditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStateinfostruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfStateinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellagain");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfStructsellagain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellfailed");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfStructsellfailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSysstatustype");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfSysstatustype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfTagnamestruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfTagnamestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblacklistaddresultstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserblacklistaddresultstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblackliststruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserblackliststruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserincomingpaymentrefundsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserincomingpaymentstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserpaymentrefundsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserpaymentstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpayoutstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserpayoutstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfUserpostbuydatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantquantitystruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantquantitystruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfVariantstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWaitfeedbackstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfWaitfeedbackstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWatcheditemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfWatcheditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWatchitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfWatchitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWonitemstruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ArrayOfWonitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.AttribStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.BidItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.BidListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BillingDataType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.BillingDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.BlackListResStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CategoriesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CategoryPathType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CategoryTreeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CatInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ChangedItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ChangedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyExtraDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CompanyExtraDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CompanyInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanySecondAddressStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CompanySecondAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CountryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CreatedItemTemplateStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.CreatedItemTemplateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DurationInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.DurationInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesCategoriesStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FavouritesCategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesSellersStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FavouritesSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackList");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FeedbackList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackManyStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FeedbackManyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FeedbackResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FieldsValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilledPostBuyFormsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FilledPostBuyFormsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FilterOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterPriceStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FilterPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterRelationType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FilterRelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FiltersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FilterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FinishFailureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FinishItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FulfillmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FulfillmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FutureFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.FutureItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.InvoiceDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.InvoiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemDescriptionStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemDescriptionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemGetImage");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemGetImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImagesStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemImagesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoExt");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemInfoExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemPaymentOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemReminderStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemReminderStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemRemoveWatchStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemRemoveWatchStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsNotAddedStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemsNotAddedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemSurchargeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateCreateStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemTemplateCreateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemTemplateListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantAttributeStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemVariantAttributeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ItemVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MessageToBuyerStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.MessageToBuyerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.MyAccountStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyContactList");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.MyContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyFeedbackListStruct2");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.MyFeedbackListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormCommonStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.NewPostBuyFormCommonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormSellerStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.NewPostBuyFormSellerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.NotSoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.NotSoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.NotWonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ParameterInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PaymentDetailsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PaymentItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PaymentMethodStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PaymentSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PaymentsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsPayoutStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PaymentsPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsUserDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PaymentsUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoFrequencyStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PayoutAutoFrequencyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoSettingsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PayoutAutoSettingsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PharmacyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyRecipientDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PharmacyRecipientDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PhotoInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormForBuyersDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormItemDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormPackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormShipmentTrackingStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyFormStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PostBuyItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.PriceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ProductParametersGroupStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ProductParametersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ProductStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeDateValueStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RangeDateValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeFloatValueStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RangeFloatValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeIntValueStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RangeIntValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeValueType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RangeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ReasonInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ReasonInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundDetailsType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RefundDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundListType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RefundListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RefundsDealsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RelatedItemsShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RelatedItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RelatedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedPersonsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RelatedPersonsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RemovedItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RemovedItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RequestPayoutStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.RequestPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellerPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellerShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormFieldsForCategoryStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellFormFieldsForCategoryStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingAveragePerMonthStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingAverageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingDetailStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingEstimationStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingEstimationStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingReasonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonSumStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingReasonSumStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingStatsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SellRatingStatsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ShipmentPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ShipmentPriceTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ShipmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShopsTagTypeStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ShopsTagTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.ShowUserFeedbacks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SiteJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SiteJournalDealsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SiteJournalDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalInfo");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SiteJournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SortOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.StateInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.StructSellAgain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.StructSellFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.SysStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TagNameStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.TagNameStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TransactionPayByLinkStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.TransactionPayByLinkStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserBlackListAddResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserBlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserIncomingPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserIncomingPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoType");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserSentToDataStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.UserSentToDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantQuantityStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.VariantQuantityStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.VariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WaitFeedbackStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.WaitFeedbackStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchedItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.WatchedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.WatchItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchListInfoStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.WatchListInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            cachedSerQNames.add(qName);
            cls = pl.agh.tai.portsadapter.soap.generated.WonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsResponse doAddDescToItems(pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddDescToItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoAddDescToItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddPackageInfoToPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoAddPackageInfoToPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListResponse doAddToBlackList(pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoAddToBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListResponse doAddToWatchList(pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoAddToWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoBidItemResponse doBidItem(pl.agh.tai.portsadapter.soap.generated.DoBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemResponse doCancelBidItem(pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoCancelBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormResponse doCancelRefundForm(pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoCancelRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningResponse doCancelRefundWarning(pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundWarning");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundWarning"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoCancelRefundWarningResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionResponse doCancelTransaction(pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoCancelTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsResponse doChangeItemFields(pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoChangeItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemResponse doChangePriceItem(pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangePriceItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoChangePriceItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemResponse doChangeQuantityItem(pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeQuantityItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoChangeQuantityItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionResponse doCheckItemDescription(pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckItemDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoCheckItemDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtResponse doCheckNewAuctionExt(pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoCheckNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateResponse doCreateItemTemplate(pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCreateItemTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCreateItemTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoCreateItemTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoFeedbackResponse doFeedback(pl.agh.tai.portsadapter.soap.generated.DoFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyResponse doFeedbackMany(pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedbackMany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoFeedbackManyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoFinishItemResponse doFinishItem(pl.agh.tai.portsadapter.soap.generated.DoFinishItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoFinishItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoFinishItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoFinishItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoFinishItemsResponse doFinishItems(pl.agh.tai.portsadapter.soap.generated.DoFinishItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoFinishItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoFinishItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoFinishItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateResponse doGetAdminUserLicenceDate(pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetAdminUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetAdminUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListResponse doGetArchiveRefundsList(pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetArchiveRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetArchiveRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetArchiveRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Response doGetBidItem2(pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBidItem2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Response) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetBidItem2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersResponse doGetBlackListUsers(pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBlackListUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetBlackListUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathResponse doGetCategoryPath(pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCategoryPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetCategoryPathResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataResponse doGetCatsData(pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountResponse doGetCatsDataCount(pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitResponse doGetCatsDataLimit(pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetCatsDataLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetCountriesResponse doGetCountries(pl.agh.tai.portsadapter.soap.generated.DoGetCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCountriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetCountriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetDealsResponse doGetDeals(pl.agh.tai.portsadapter.soap.generated.DoGetDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesResponse doGetFavouriteCategories(pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersResponse doGetFavouriteSellers(pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetFavouriteSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackResponse doGetFeedback(pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFilledPostBuyForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetFilledPostBuyFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountResponse doGetFreeDeliveryAmount(pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsResponse doGetItemFields(pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesResponse doGetItemTemplates(pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesResponse doGetItemsImages(pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsImages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetItemsImagesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoResponse doGetItemsInfo(pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetItemsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetItemsListResponse doGetItemsList(pl.agh.tai.portsadapter.soap.generated.DoGetItemsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetItemsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetItemsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerResponse doGetMessageToBuyer(pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMessageToBuyer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMessageToBuyer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMessageToBuyerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesResponse doGetMyAddresses(pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsResponse doGetMyBidItems(pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyBidItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyBidItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyCurrentShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyCurrentShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyDataResponse doGetMyData(pl.agh.tai.portsadapter.soap.generated.DoGetMyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsResponse doGetMyFutureItems(pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyFutureItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyFutureItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyIncomingPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotSoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyNotSoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsResponse doGetMyNotWonItems(pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyNotWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsResponse doGetMyPayments(pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsResponse doGetMyPaymentsRefunds(pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsResponse doGetMyPayouts(pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayouts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyPayoutsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsResponse doGetMySellItems(pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMySellItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingResponse doGetMySellRating(pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellRating");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMySellRatingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsResponse doGetMySoldItems(pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMySoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsResponse doGetMyWatchItems(pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsResponse doGetMyWatchedItems(pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyWatchedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsResponse doGetMyWonItems(pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetMyWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataResponse doGetPaymentData(pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetPaymentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsResponse doGetPaymentMethods(pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetPaymentMethodsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataResponse doGetPostBuyData(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForBuyers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForBuyersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsDataForSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyFormsIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyItemInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetPostBuyItemInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsResponse doGetRefundsDeals(pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetRefundsDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListResponse doGetRefundsList(pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsResponse doGetRefundsReasons(pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetRefundsReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsResponse doGetRelatedItems(pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsResponse doGetSellFormAttribs(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormAttribs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSellFormAttribsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsResponse doGetSellFormFields(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtResponse doGetSellFormFieldsExt(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitResponse doGetSellFormFieldsExtLimit(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExtLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsExtLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsForCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsForCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitResponse doGetSellFormFieldsLimit(pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSellFormFieldsLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsResponse doGetSellRatingReasons(pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellRatingReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSellRatingReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetResponse doGetSessionHandleForWidget(pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSessionHandleForWidget");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSessionHandleForWidgetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataResponse doGetShipmentData(pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsResponse doGetShipmentDataForRelatedItems(pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentDataForRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentDataForRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetShipmentDataForRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentPriceTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetShipmentPriceTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsResponse doGetShopsTags(pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShopsTags");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShopsTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetShopsTagsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalResponse doGetSiteJournal(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsResponse doGetSiteJournalDeals(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDealsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalDealsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoResponse doGetSiteJournalInfo(pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSiteJournalInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoResponse doGetStatesInfo(pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetStatesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetStatesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeResponse doGetSystemTime(pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSystemTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetSystemTimeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsResponse doGetTransactionsIDs(pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetTransactionsIDs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetTransactionsIDsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetUserIDResponse doGetUserID(pl.agh.tai.portsadapter.soap.generated.DoGetUserIDRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetUserIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetUserIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetUserIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateResponse doGetUserLicenceDate(pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginResponse doGetUserLogin(pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetUserLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksResponse doGetWaitingFeedbacks(pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountResponse doGetWaitingFeedbacksCount(pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacksCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoGetWaitingFeedbacksCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeResponse doInternalIStoreChange(pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doInternalIStoreChange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doInternalIStoreChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoInternalIStoreChangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoLoginResponse doLogin(pl.agh.tai.portsadapter.soap.generated.DoLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoLoginEncResponse doLoginEnc(pl.agh.tai.portsadapter.soap.generated.DoLoginEncRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginEnc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoLoginEncResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoLoginEncResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoLoginEncResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenResponse doLoginWithAccessToken(pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginWithAccessToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginWithAccessToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoLoginWithAccessTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Response doMyAccount2(pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccount2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Response) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoMyAccount2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountResponse doMyAccountItemsCount(pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccountItemsCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoMyAccountItemsCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoMyBillingResponse doMyBilling(pl.agh.tai.portsadapter.soap.generated.DoMyBillingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBilling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyBillingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyBillingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoMyBillingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemResponse doMyBillingItem(pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBillingItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoMyBillingItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoMyContactResponse doMyContact(pl.agh.tai.portsadapter.soap.generated.DoMyContactRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyContact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyContactResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyContactResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoMyContactResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Response doMyFeedback2(pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Response) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitResponse doMyFeedback2Limit(pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2Limit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoMyFeedback2LimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtResponse doNewAuctionExt(pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusResponse doQueryAllSysStatus(pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQueryAllSysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoQueryAllSysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusResponse doQuerySysStatus(pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQuerySysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoQuerySysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListResponse doRemoveFromBlackList(pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoRemoveFromBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListResponse doRemoveFromWatchList(pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoRemoveFromWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesResponse doRemoveItemTemplates(pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoRemoveItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidResponse doRequestCancelBid(pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestCancelBid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoRequestCancelBidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutResponse doRequestPayout(pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestPayout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoRequestPayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeResponse doRequestSurcharge(pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestSurcharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoRequestSurchargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainResponse doSellSomeAgain(pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopResponse doSellSomeAgainInShop(pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgainInShop");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSellSomeAgainInShopResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserResponse doSendEmailToUser(pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendEmailToUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSendEmailToUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormResponse doSendPostBuyForm(pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSendPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormResponse doSendRefundForm(pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSendRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountResponse doSetFreeDeliveryAmount(pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeResponse doSetShipmentPriceType(pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSetShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateResponse doSetUserLicenceDate(pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoSetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtResponse doShowItemInfoExt(pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowItemInfoExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoShowItemInfoExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoShowUserResponse doShowUser(pl.agh.tai.portsadapter.soap.generated.DoShowUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoShowUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoShowUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoShowUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoShowUserPageResponse doShowUserPage(pl.agh.tai.portsadapter.soap.generated.DoShowUserPageRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUserPage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUserPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoShowUserPageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoShowUserPageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoShowUserPageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.agh.tai.portsadapter.soap.generated.DoVerifyItemResponse doVerifyItem(pl.agh.tai.portsadapter.soap.generated.DoVerifyItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doVerifyItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.agh.tai.portsadapter.soap.generated.DoVerifyItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pl.agh.tai.portsadapter.soap.generated.DoVerifyItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pl.agh.tai.portsadapter.soap.generated.DoVerifyItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
