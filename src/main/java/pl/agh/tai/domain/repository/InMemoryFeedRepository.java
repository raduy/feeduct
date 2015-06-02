package pl.agh.tai.domain.repository;

import com.google.common.collect.ImmutableSet;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.feed.Feed;
import pl.agh.tai.domain.feed.FeedId;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

@Component
public class InMemoryFeedRepository implements IFeedRepository {
    private final Map<FeedId, Feed> feeds = new HashMap<>();

    @Override
    public void add(@NotNull Feed feed) {
        checkNotNull(feed);
        this.feeds.put(feed.id(), feed);
    }

    @Override
    public Feed load(FeedId id) {
        return this.feeds.get(id);
    }

    @Override
    public Collection<Feed> immutableView() {
        return ImmutableSet.copyOf(feeds.values());
    }
}
