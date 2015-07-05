package pl.agh.tai.portsadapter.soap.allegroapi.api;

import pl.agh.tai.domain.Auction;

import java.util.Set;

public interface IWebApiFacade {
    Set<Auction> findAuctionsByPredicate(AuctionPredicate predicate);
}
