package pl.agh.tai.portsadapter.soap.allegroapi.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.Auction;
import pl.agh.tai.domain.Vendor;
import pl.agh.tai.portsadapter.soap.allegroapi.api.AuctionPredicate;
import pl.agh.tai.portsadapter.soap.generated.SearchOptType;
import pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfCategoriesStructHolder;
import pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfExcludedWordsHolder;
import pl.agh.tai.portsadapter.soap.generated.holders.ArrayOfSearchResponseHolder;

import javax.xml.rpc.holders.IntHolder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@Component
class AllegroWebApiClient {
    private final static Logger LOG = LoggerFactory.getLogger(AllegroWebApiClient.class);
    private final AllegroWebApiConnector connector;

    @Autowired
    public AllegroWebApiClient(AllegroWebApiConnector connector,
                               @Value("${app.portsadapters.allegro.username}") String username,
                               @Value("${app.portsadapters.allegro.password_base_64}") String encodedPassword,
                               @Value("${app.portsadapters.allegro.key}") String webApiKey) {
        this.connector = connector;

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
        IntHolder searchCount = new IntHolder();
        IntHolder searchCountFeatured = new IntHolder();

        try {
            ArrayOfSearchResponseHolder searchArray = new ArrayOfSearchResponseHolder();
            ArrayOfExcludedWordsHolder searchExcludedWords = new ArrayOfExcludedWordsHolder();
            ArrayOfCategoriesStructHolder searchCategories = new ArrayOfCategoriesStructHolder();

            SearchOptType searchQuery = new SearchOptType(predicate.keyword(), 0,
                    0, 0, 0, 0, 0, "", 0, 0, 0, 100, 0, 0);

            connector.apiPort().doSearch(connector.sessionHolder().value, searchQuery, searchCount,
                    searchCountFeatured, searchArray, searchExcludedWords,
                    searchCategories);


            String auctionUrlTemplate = "http://allegro.pl/ShowItem2.php?item=";
            return translateWSDLAuctionsToDomainModel(searchArray, auctionUrlTemplate);

        } catch (Exception e) {
            LOG.error("Error occurred: Cause:", e);
            return Collections.emptySet();
        }
    }

    private Set<Auction> translateWSDLAuctionsToDomainModel(ArrayOfSearchResponseHolder searchArray, String auctionUrlTemplate) {
        return Arrays.stream(searchArray.value)
                .map(wsdlAuction -> new Auction(Vendor.ALLEGRO,
                        wsdlAuction.getSItThumbUrl(),
                        wsdlAuction.getSItName(),
                        auctionUrlTemplate + Long.valueOf(wsdlAuction.getSItId()).toString()))
                .collect(toSet());
    }
}
