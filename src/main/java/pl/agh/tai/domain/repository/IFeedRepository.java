package pl.agh.tai.domain.repository;

import pl.agh.tai.domain.aggregage.Feed;
import pl.agh.tai.domain.aggregage.FeedId;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public interface IFeedRepository {

    void add(@NotNull Feed feed);

    Feed load(@NotNull FeedId id);

    Collection<Feed> immutableView();
}
