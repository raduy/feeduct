package pl.agh.tai.domain.feed;

import java.util.UUID;


public class FeedId {
    private final String id;

    public FeedId() {
        this.id = UUID.randomUUID().toString();
    }

    public FeedId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeedId feedId = (FeedId) o;

        return id.equals(feedId.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
