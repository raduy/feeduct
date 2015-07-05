package pl.agh.tai.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.agh.tai.domain.feed.Feed;
import pl.agh.tai.domain.feed.FeedId;

import javax.validation.constraints.NotNull;
import java.util.Collection;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Repository
public class JpaFeedRepository implements IFeedRepository {
    private final FeedDao feedDao;

    @Autowired
    public JpaFeedRepository(FeedDao feedDao) {
        this.feedDao = feedDao;
    }

    @Override
    public void add(@NotNull Feed feed) {
        checkNotNull(feed, "Cannot save null as feed");
        feedDao.save(feed);
    }

    @Override
    public Feed load(@NotNull FeedId id) {
        checkNotNull(id, "FeedId cannot be null");
        return feedDao.findOne(id);
    }

    @Override
    public void delete(@NotNull FeedId id) {
        checkNotNull(id, "FeedId cannot be null");
        feedDao.delete(id);
    }

    @Override
    public Collection<Feed> immutableView() {
        return feedDao.findAll();
    }
}
