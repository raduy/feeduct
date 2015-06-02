package pl.agh.tai.domain.appservice;

import pl.agh.tai.domain.Auction;
import pl.agh.tai.domain.feed.FeedQuery;

import java.util.Collection;

public interface IAllegroClient {

    Collection<Auction> findMatchingAuctions(FeedQuery query);
}
