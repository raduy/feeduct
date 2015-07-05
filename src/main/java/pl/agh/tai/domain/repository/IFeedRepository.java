package pl.agh.tai.domain.repository;

import pl.agh.tai.domain.feed.Feed;
import pl.agh.tai.domain.feed.FeedId;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public interface IFeedRepository {

    void add(@NotNull Feed feed);

    Feed load(@NotNull FeedId id);

    void delete(@NotNull FeedId id);

    Collection<Feed> immutableView();
}
