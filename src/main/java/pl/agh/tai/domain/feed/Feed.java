package pl.agh.tai.domain.feed;

import pl.agh.tai.domain.Auction;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

import static com.google.common.base.Preconditions.checkNotNull;

public class Feed {
    private final FeedId id;
    private final FeedQuery feedQuery;
    private Collection<Auction> auctions;

    public Feed(FeedQuery feedQuery) {
        this.feedQuery = feedQuery;
        this.auctions = new ArrayList<>();
        this.id = new FeedId();
    }

    public FeedId id() {
        return id;
    }

    public void updateAuctions(@NotNull Collection<Auction> newAuctions) {
        checkNotNull(newAuctions, "New auctions cannot be null. Provide empty if notching match");
        this.auctions = newAuctions;
    }

}
