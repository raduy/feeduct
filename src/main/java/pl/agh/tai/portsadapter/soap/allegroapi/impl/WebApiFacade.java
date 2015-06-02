package pl.agh.tai.portsadapter.soap.allegroapi.impl;

import org.springframework.stereotype.Component;
import pl.agh.tai.domain.Auction;
import pl.agh.tai.portsadapter.soap.allegroapi.api.AuctionPredicate;
import pl.agh.tai.portsadapter.soap.allegroapi.api.IWebApiFacade;

import java.util.Set;

/**
 * @author Lukasz Raduj <raduj.lukasz@gmail.com>
 */
@Component
public class WebApiFacade implements IWebApiFacade {

    private final AllegroWebApiClient client = new AllegroWebApiClient();

    @Override
    public Set<Auction> findAllAuctionByPredicate(AuctionPredicate predicate) {
        return client.loadAuctionsByPredicate(predicate);
    }
}
