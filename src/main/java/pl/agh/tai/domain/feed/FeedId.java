package pl.agh.tai.domain.feed;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class FeedId implements Serializable {
    private final String id;

    public FeedId() {
        this.id = UUID.randomUUID().toString();
    }

    public FeedId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
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
