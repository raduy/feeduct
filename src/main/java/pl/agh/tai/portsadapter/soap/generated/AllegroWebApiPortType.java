/**
 * AllegroWebApiPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.agh.tai.portsadapter.soap.generated;

public interface AllegroWebApiPortType extends java.rmi.Remote {
    public void doAddDescToItems(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String itDescription, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemsIDHolder arrayItemsAddId, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.PostBuyFormPackageInfoStruct doAddPackageInfoToPostBuyForm(java.lang.String sessionId, long transactionId, pl.agh.tai.portsadapter.soap.generated.PackageInfoStruct[] packageInfo) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.UserBlackListAddResultStruct[] doAddToBlackList(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.WatchListInfoStruct doAddToWatchList(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public java.lang.String doBidItem(java.lang.String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow, pl.agh.tai.portsadapter.soap.generated.PharmacyRecipientDataStruct pharmacyRecipientData, java.lang.String variantId) throws java.rmi.RemoteException;
    public void doCancelBidItem(java.lang.String sessionHandle, long cancelItemId, int[] cancelBidsArray, java.lang.String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCancelBidsIDHolder cancelledBids, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException;
    public int doCancelTransaction(java.lang.String sessionId, long transactionId) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ChangedItemStruct doChangeItemFields(java.lang.String sessionId, long itemId, pl.agh.tai.portsadapter.soap.generated.FieldsValue[] fieldsToModify, int[] fieldsToRemove, int previewOnly, pl.agh.tai.portsadapter.soap.generated.VariantStruct[] variants, pl.agh.tai.portsadapter.soap.generated.TagNameStruct[] tags) throws java.rmi.RemoteException;
    public java.lang.String doChangePriceItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException;
    public void doChangeQuantityItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ItemDescriptionStruct doCheckItemDescription(java.lang.String sessionId, java.lang.String descriptionContent) throws java.rmi.RemoteException;
    public void doCheckNewAuctionExt(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.FieldsValue[] fields, pl.agh.tai.portsadapter.soap.generated.VariantStruct[] variants, pl.agh.tai.portsadapter.soap.generated.TagNameStruct[] tags, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.CreatedItemTemplateStruct doCreateItemTemplate(java.lang.String sessionId, java.lang.String itemTemplateName, pl.agh.tai.portsadapter.soap.generated.FieldsValue[] itemTemplateFields) throws java.rmi.RemoteException;
    public int doFeedback(java.lang.String sessionHandle, long feItemId, int feUseCommentTemplate, int feToUserId, java.lang.String feComment, java.lang.String feCommentType, int feOp, pl.agh.tai.portsadapter.soap.generated.SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.FeedbackResultStruct[] doFeedbackMany(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException;
    public int doFinishItem(java.lang.String sessionHandle, long finishItemId, int finishCancelAllBids, java.lang.String finishCancelReason) throws java.rmi.RemoteException;
    public void doFinishItems(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.FinishItemsStruct[] finishItemsList, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException;
    public float doGetAdminUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.BidListStruct2[] doGetBidItem2(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.BlackListStruct[] doGetBlackListUsers(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.CategoryData[] doGetCategoryPath(java.lang.String sessionId, int categoryId) throws java.rmi.RemoteException;
    public void doGetCatsData(int countryId, long localVersion, java.lang.String webapiKey, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetCatsDataCount(int countryId, long localVersion, java.lang.String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetCatsDataLimit(int countryId, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.CountryInfoType[] doGetCountries(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.DealsStruct[] doGetDeals(java.lang.String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.FavouritesCategoriesStruct[] doGetFavouriteCategories(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.FavouritesSellersStruct[] doGetFavouriteSellers(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public void doGetFeedback(java.lang.String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, java.lang.String feedbackKindList, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.FilledPostBuyFormsStruct doGetFilledPostBuyForms(java.lang.String sessionId, int paymentType, int userRole, long fillingTimeFrom, long fillingTimeTo) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.FieldsValue[] doGetItemFields(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ItemTemplatesStruct doGetItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ItemImagesStruct[] doGetItemsImages(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException;
    public void doGetItemsInfo(java.lang.String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemsIDHolder arrayItemsNotFound, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.MessageToBuyerStruct doGetMessageToBuyer(java.lang.String sessionId, long itemId) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.AddressInfoStruct[] doGetMyAddresses(java.lang.String sessionId) throws java.rmi.RemoteException;
    public void doGetMyBidItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder bidItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfBidItemStructHolder bidItemsList) throws java.rmi.RemoteException;
    public int doGetMyCurrentShipmentPriceType(java.lang.String sessionId) throws java.rmi.RemoteException;
    public void doGetMyData(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.holders.UserDataStructHolder userData, pl.agh.tai.portsadapter.soap.generated.holders.InvoiceDataStructHolder invoiceData, pl.agh.tai.portsadapter.soap.generated.holders.CompanyExtraDataStructHolder companyExtraData, pl.agh.tai.portsadapter.soap.generated.holders.CompanySecondAddressStructHolder companySecondAddress, pl.agh.tai.portsadapter.soap.generated.holders.PharmacyDataStructHolder pharmacyData, pl.agh.tai.portsadapter.soap.generated.holders.AlcoholDataStructHolder alcoholData, pl.agh.tai.portsadapter.soap.generated.holders.RelatedPersonsStructHolder relatedPersons) throws java.rmi.RemoteException;
    public void doGetMyFutureItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, pl.agh.tai.portsadapter.soap.generated.FutureFilterOptionsStruct filterOptions, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder futureItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfFutureItemStructHolder futureItemsList) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.UserIncomingPaymentStruct[] doGetMyIncomingPayments(java.lang.String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(java.lang.String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;
    public void doGetMyNotSoldItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, pl.agh.tai.portsadapter.soap.generated.NotSoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notSoldItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfNotSoldItemStructHolder notSoldItemsList) throws java.rmi.RemoteException;
    public void doGetMyNotWonItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notWonItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfNotWonItemStructHolder notWonItemsList) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.UserPaymentStruct[] doGetMyPayments(java.lang.String sessionId, int sellerId, long itemId, long paymentTimeFrom, long paymentTimeTo, int pageSize, int pageNumber) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.PaymentsInfoStruct doGetMyPaymentsInfo(java.lang.String sessionId) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(java.lang.String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.UserPayoutStruct[] doGetMyPayouts(java.lang.String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;
    public void doGetMySellItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, pl.agh.tai.portsadapter.soap.generated.SellFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder sellItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellItemStructHolder sellItemsList) throws java.rmi.RemoteException;
    public void doGetMySellRating(java.lang.String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException;
    public void doGetMySoldItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, pl.agh.tai.portsadapter.soap.generated.SoldFilterOptionsStruct filterOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder soldItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSoldItemStructHolder soldItemsList) throws java.rmi.RemoteException;
    public void doGetMyWatchItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfWatchItemStructHolder watchItemsList) throws java.rmi.RemoteException;
    public void doGetMyWatchedItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchedItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfWatchedItemStructHolder watchedItemsList) throws java.rmi.RemoteException;
    public void doGetMyWonItems(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.SortOptionsStruct sortOptions, java.lang.String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder wonItemsCounter, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfWonItemStructHolder wonItemsList) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.BillingDataType[] doGetPaymentData(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.PaymentMethodStruct[] doGetPaymentMethods(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ItemPostBuyDataStruct[] doGetPostBuyData(java.lang.String sessionHandle, long[] itemsArray) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.PostBuyFormForBuyersDataStruct[] doGetPostBuyFormsDataForBuyers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.PostBuyFormDataStruct[] doGetPostBuyFormsDataForSellers(java.lang.String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.PostBuyItemInfoStruct[] doGetPostBuyItemInfo(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public void doGetRefundsDeals(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.FilterOptionsType[] filterOptions, java.lang.String sortOrder, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder dealsCount, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfRefundsDealsListTypeHolder dealsList, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException;
    public void doGetRefundsList(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.FilterOptionsType[] filterOptions, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder refundsCount, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfRefundListTypeHolder refundsList, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.RelatedItemsStruct doGetRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public void doGetSellFormAttribs(int countryId, java.lang.String webapiKey, long localVersion, int catId, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetSellFormFields(int countryCode, long localVersion, java.lang.String webapiKey, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetSellFormFieldsExt(int countryCode, long localVersion, java.lang.String webapiKey, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SellFormFieldsForCategoryStruct doGetSellFormFieldsForCategory(java.lang.String webapiKey, int countryId, int categoryId) throws java.rmi.RemoteException;
    public void doGetSellFormFieldsLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SellRatingInfoStruct[] doGetSellRatingReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ServiceInfoStruct[] doGetServiceInfo(int countryCode, int anCatId, long anItDate, int anItId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ServiceInfoCatStruct[] doGetServiceInfoCategories(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.TemplateInfoType[] doGetServiceTemplates(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public void doGetSessionHandleForWidget(java.lang.String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public void doGetShipmentData(int countryId, java.lang.String webapiKey, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.RelatedItemsShipmentDataStruct doGetShipmentDataForRelatedItems(java.lang.String sessionId, long[] itemIds) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ShipmentPriceTypeStruct[] doGetShipmentPriceTypes(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public void doGetShopsTags(java.lang.String sessionId, javax.xml.rpc.holders.IntHolder shopsTagsCount, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfShopsTagTypeStructHolder shopsTags) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SiteJournal[] doGetSiteJournal(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SiteJournalDealsStruct[] doGetSiteJournalDeals(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SiteJournalDealsInfoStruct doGetSiteJournalDealsInfo(java.lang.String sessionId, long journalStart) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SiteJournalInfo doGetSiteJournalInfo(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;
    public void doGetSitesFlagInfo(int countryCode, java.lang.String webapiKey, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSitesFlagInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public void doGetSitesInfo(int countryCode, java.lang.String webapiKey, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSitesInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SpecialAuctionStruct[] doGetSpecialItems(java.lang.String sessionHandle, int specialType, int specialGroup, int offset, int orderFulfillmentTime) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.StateInfoStruct[] doGetStatesInfo(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public long doGetSystemTime(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public long[] doGetTransactionsIDs(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String userRole, long[] shipmentIdArray) throws java.rmi.RemoteException;
    public int doGetUserID(int countryId, java.lang.String userLogin, java.lang.String userEmail, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public void doGetUserItems(int userId, java.lang.String webapiKey, int countryId, int offset, int limit, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfUserItemListHolder userItemList, javax.xml.rpc.holders.IntHolder userItemCount) throws java.rmi.RemoteException;
    public float doGetUserLicenceDate(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public java.lang.String doGetUserLogin(int countryId, int userId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.WaitFeedbackStruct[] doGetWaitingFeedbacks(java.lang.String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException;
    public int doGetWaitingFeedbacksCount(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public int doInternalIStoreChange(java.lang.String webapiKey, long userId, long istoreId, java.lang.String actionType, long actionDate, long validDate) throws java.rmi.RemoteException;
    public int doInternalSendMessage(java.lang.String sessionHandle, int userId, int mail_template_id, java.lang.String[] arrayOfAdditionalData) throws java.rmi.RemoteException;
    public void doLogin(java.lang.String userLogin, java.lang.String userPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public void doLoginEnc(java.lang.String userLogin, java.lang.String userHashPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public void doLoginWithAccessToken(java.lang.String accessToken, int countryCode, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.MyAccountStruct2[] doMyAccount2(java.lang.String sessionHandle, java.lang.String accountType, int offset, long[] itemsArray, int limit) throws java.rmi.RemoteException;
    public int doMyAccountItemsCount(java.lang.String sessionHandle, java.lang.String accountType, long[] itemsArray) throws java.rmi.RemoteException;
    public java.lang.String doMyBilling(java.lang.String sessionHandle) throws java.rmi.RemoteException;
    public void doMyBillingItem(java.lang.String sessionHandle, long itemId, java.lang.String option, pl.agh.tai.portsadapter.soap.generated.holders.ItemBillingListHolder entryFees, pl.agh.tai.portsadapter.soap.generated.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.MyContactList[] doMyContact(java.lang.String sessionHandle, long[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.MyFeedbackListStruct2[] doMyFeedback2(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.MyFeedbackListStruct2[] doMyFeedback2Limit(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, long[] itemsArray, int packageElement) throws java.rmi.RemoteException;
    public void doNewAuctionExt(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.FieldsValue[] fields, int itemTemplateId, int localId, pl.agh.tai.portsadapter.soap.generated.ItemTemplateCreateStruct itemTemplateCreate, pl.agh.tai.portsadapter.soap.generated.VariantStruct[] variants, pl.agh.tai.portsadapter.soap.generated.TagNameStruct[] tags, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.SysStatusType[] doQueryAllSysStatus(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException;
    public void doQuerySysStatus(int sysvar, int countryId, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.BlackListResStruct[] doRemoveFromBlackList(java.lang.String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.ItemRemoveWatchStruct[] doRemoveFromWatchList(java.lang.String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.RemovedItemTemplatesStruct doRemoveItemTemplates(java.lang.String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException;
    public int doRequestCancelBid(java.lang.String sessionHandle, long requestItemId, java.lang.String requestCancelReason) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.RequestPayoutStruct doRequestPayout(java.lang.String sessionId) throws java.rmi.RemoteException;
    public int doRequestSurcharge(java.lang.String sessionHandle, long transactionId, float surchargeValue, java.lang.String surchargeMessageToBuyer) throws java.rmi.RemoteException;
    public void doSearch(java.lang.String sessionHandle, pl.agh.tai.portsadapter.soap.generated.SearchOptType searchQuery, javax.xml.rpc.holders.IntHolder searchCount, javax.xml.rpc.holders.IntHolder searchCountFeatured, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSearchResponseHolder searchArray, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfExcludedWordsHolder searchExcludedWords, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCategoriesStructHolder searchCategories) throws java.rmi.RemoteException;
    public void doSellSomeAgain(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, int[] localIds, int sellProlongOptions, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfStructSellAgainHolder itemsSellAgain, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfStructSellFailedHolder itemsSellFailed, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;
    public void doSellSomeAgainInShop(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, int[] localIds, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfStructSellAgainHolder itemsSellAgain, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfStructSellFailedHolder itemsSellFailed, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;
    public java.lang.String doSendEmailToUser(java.lang.String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, java.lang.String mailToUserMessage) throws java.rmi.RemoteException;
    public pl.agh.tai.portsadapter.soap.generated.PostBuyFormStruct doSendPostBuyForm(java.lang.String sessionId, pl.agh.tai.portsadapter.soap.generated.NewPostBuyFormSellerStruct[] newPostBuyFormSeller, pl.agh.tai.portsadapter.soap.generated.NewPostBuyFormCommonStruct newPostBuyFormCommon) throws java.rmi.RemoteException;
    public int doSetShipmentPriceType(java.lang.String sessionId, int shipmentPriceTypeId) throws java.rmi.RemoteException;
    public int doSetUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException;
    public void doShowCat(java.lang.String sessionHandle, int catId, int catItemState, int catItemOption, pl.agh.tai.portsadapter.soap.generated.DurationTimeInfo catItemDurationOption, pl.agh.tai.portsadapter.soap.generated.FieldsValue[] catAttribFields, int catSortOptions, pl.agh.tai.portsadapter.soap.generated.PriceCatInfo catItemsPrice, int catItemsOffset, int catItemsLimit, int catOrderFulfillmentTime, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCatInfoStructHolder catParentArray, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCatInfoStructHolder catChildArray, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCatInfoStructHolder catSisterArray, javax.xml.rpc.holders.IntHolder catItemsCount, javax.xml.rpc.holders.IntHolder catItemsCountFeatured, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSearchResponseHolder catItemsArray) throws java.rmi.RemoteException;
    public void doShowItemInfoExt(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, pl.agh.tai.portsadapter.soap.generated.holders.ItemInfoExtHolder itemListInfoExt, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemCatListHolder itemCatPath, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemImageListHolder itemImgList, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfAttribStructHolder itemAttribList, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfPostageStructHolder itemPostageOptions, pl.agh.tai.portsadapter.soap.generated.holders.ItemPaymentOptionsHolder itemPaymentOptions, pl.agh.tai.portsadapter.soap.generated.holders.CompanyInfoStructHolder itemCompanyInfo, pl.agh.tai.portsadapter.soap.generated.holders.ProductStructHolder itemProductInfo, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfItemVariantStructHolder itemVariants) throws java.rmi.RemoteException;
    public void doShowUser(java.lang.String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, pl.agh.tai.portsadapter.soap.generated.holders.ShowUserFeedbacksHolder userPositiveFeedback, pl.agh.tai.portsadapter.soap.generated.holders.ShowUserFeedbacksHolder userNegativeFeedback, pl.agh.tai.portsadapter.soap.generated.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard, javax.xml.rpc.holders.IntHolder userIsB2CSeller) throws java.rmi.RemoteException;
    public void doShowUserPage(java.lang.String webapiKey, int countryId, long userId, javax.xml.rpc.holders.StringHolder userPageContent, javax.xml.rpc.holders.StringHolder userPagePharmacyPermit, javax.xml.rpc.holders.StringHolder userPageAlcoholPermit) throws java.rmi.RemoteException;
    public void doVerifyItem(java.lang.String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed, javax.xml.rpc.holders.LongHolder itemStartingTime) throws java.rmi.RemoteException;
}