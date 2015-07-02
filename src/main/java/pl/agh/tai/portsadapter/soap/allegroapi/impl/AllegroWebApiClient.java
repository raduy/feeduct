package pl.agh.tai.portsadapter.soap.allegroapi.impl;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.Auction;
import pl.agh.tai.domain.Vendor;
import pl.agh.tai.portsadapter.soap.allegroapi.api.AuctionPredicate;
import pl.agh.tai.portsadapter.soap.generated.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@Component
class AllegroWebApiClient {
    private final static Logger LOG = LoggerFactory.getLogger(AllegroWebApiClient.class);
    private final AllegroWebApiConnector connector;
    private final String webApiKey;
    private final static String WHITE_SPACE_SEPARATOR = "\\s+";
    private final static String SEARCH_BY_KEYWORD_FILTER_ID = "search";
    private final static String AUCTION_URL_TEMPLATE = "http://allegro.pl/ShowItem2.php?item=";
    private final static String DEFAULT_PHOTO_URL = "http://wirtualnywydawca.pl/wp-content/uploads/2015/01/allegro-800x500_c.png";
    private final static int COUNTRY_ID_FOR_POLAND = 1;

    @Autowired
    public AllegroWebApiClient(AllegroWebApiConnector connector,
                               @Value("${app.portsadapters.allegro.username}") String username,
                               @Value("${app.portsadapters.allegro.password_base_64}") String encodedPassword,
                               @Value("${app.portsadapters.allegro.key}") String webApiKey) {
        this.connector = connector;
        this.webApiKey = webApiKey;

        doLogin(username, encodedPassword, webApiKey);
    }

    private void doLogin(String username, String encodedPassword, String webApiKey) {
        try {
            LOG.info("Logging to allegro with: {} {} {}", username, encodedPassword, webApiKey);
            this.connector.login(username, encodedPassword, webApiKey);
        } catch (Exception e) {
            LOG.error("Error during login to allegro!: ", e);
        }
    }


    public Set<Auction> loadAuctionsByPredicate(AuctionPredicate predicate) {
        try {
            DoGetItemsListRequest searchRequest = new DoGetItemsListRequest();
            searchRequest.setWebapiKey(webApiKey);
            searchRequest.setCountryId(COUNTRY_ID_FOR_POLAND);

            FilterOptionsType[] searchFilters = buildSearchFilters(predicate);
            searchRequest.setFilterOptions(new ArrayOfFilteroptionstype(searchFilters));

            DoGetItemsListResponse doGetItemsListResponse = connector.apiPort()
                    .doGetItemsList(searchRequest);

            ArrayOfItemslisttype itemsList = doGetItemsListResponse.getItemsList();
            return translateWSDLAuctionsToDomainModel(itemsList);
        } catch (Exception e) {
            LOG.error("Error occurred: Cause:", e);
            return Collections.emptySet();
        }
    }

    private FilterOptionsType[] buildSearchFilters(AuctionPredicate predicate) {
        FilterOptionsType keywordFilter = new FilterOptionsType();
        keywordFilter.setFilterId(SEARCH_BY_KEYWORD_FILTER_ID);

        Iterable<String> split = Splitter.on(WHITE_SPACE_SEPARATOR).split(predicate.keyword());
        keywordFilter.setFilterValueId(new ArrayOfString(Iterables.toArray(split, String.class)));
        return new FilterOptionsType[]{keywordFilter};
    }

    private Set<Auction> translateWSDLAuctionsToDomainModel(ArrayOfItemslisttype searchArray) {
        return Arrays.stream(searchArray.getItem())
                .map(wsdlAuction -> new Auction(Vendor.ALLEGRO,
                        parsePhotoUrl(wsdlAuction),
                        wsdlAuction.getItemTitle(),
                        AUCTION_URL_TEMPLATE + Long.valueOf(wsdlAuction.getItemId()).toString()))
                .collect(toSet());
    }

    private String parsePhotoUrl(ItemsListType wsdlAuction) {
        ArrayOfPhotoinfotype photosInfo = wsdlAuction.getPhotosInfo();
        try {
            return photosInfo.getItem(0).getPhotoUrl();
        } catch (IndexOutOfBoundsException ex) {
            //no photos for this auction, return default
        }
        return DEFAULT_PHOTO_URL;
    }
}
