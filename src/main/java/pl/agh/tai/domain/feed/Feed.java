package pl.agh.tai.domain.feed;

import pl.agh.tai.domain.Auction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

import static com.google.common.base.Preconditions.checkNotNull;

@Entity
public class Feed {

    @EmbeddedId
    private FeedId id;

    @Embedded
    private FeedQuery feedQuery;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Auction> auctions;

    public Feed(FeedQuery feedQuery) {
        this.feedQuery = feedQuery;
        this.auctions = new ArrayList<>();
        this.id = new FeedId();
    }

    public FeedId id() {
        return id;
    }

    public FeedQuery feedQuery() {
        return feedQuery;
    }

    public void updateAuctions(@NotNull Collection<Auction> newAuctions) {
        checkNotNull(newAuctions, "New auctions cannot be null. Provide empty if notching match");
        this.auctions = newAuctions;
    }

    Feed() { //why JPA why
    }
}
