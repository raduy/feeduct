package pl.agh.tai.portsadapter.soap.allegroapi.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.Auction;
import pl.agh.tai.portsadapter.soap.allegroapi.api.AuctionPredicate;
import pl.agh.tai.portsadapter.soap.allegroapi.api.IWebApiFacade;

import java.util.Set;

@Component
class WebApiFacade implements IWebApiFacade {

    private final AllegroWebApiClient client;

    @Autowired
    public WebApiFacade(AllegroWebApiClient client) {
        this.client = client;
    }

    @Override
    public Set<Auction> findAuctionsByPredicate(AuctionPredicate predicate) {
        return client.loadAuctionsByPredicate(predicate);
    }
}
