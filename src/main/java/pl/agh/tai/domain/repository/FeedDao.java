package pl.agh.tai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.feed.Feed;
import pl.agh.tai.domain.feed.FeedId;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Component
public interface FeedDao extends JpaRepository<Feed, FeedId> {
    //AOP magic
}
