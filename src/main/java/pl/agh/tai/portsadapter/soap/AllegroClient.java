package pl.agh.tai.portsadapter.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.Auction;
import pl.agh.tai.domain.appservice.IAllegroClient;
import pl.agh.tai.domain.feed.FeedQuery;
import pl.agh.tai.portsadapter.soap.allegroapi.api.AuctionPredicate;
import pl.agh.tai.portsadapter.soap.allegroapi.api.IWebApiFacade;

import java.util.Collection;

@Component
public class AllegroClient implements IAllegroClient {

    private final IWebApiFacade webApiFacade;

    @Autowired
    public AllegroClient(IWebApiFacade webApiFacade) {
        this.webApiFacade = webApiFacade;
    }

    @Override
    public Collection<Auction> findMatchingAuctions(FeedQuery query) {
        AuctionPredicate predicate = new AuctionPredicate(query.keywords());
        return webApiFacade.findAllAuctionByPredicate(predicate);
    }

}
