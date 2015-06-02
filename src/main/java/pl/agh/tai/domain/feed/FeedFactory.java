package pl.agh.tai.domain.feed;

import org.springframework.stereotype.Component;

@Component
public class FeedFactory {

    public Feed newFeed(FeedQuery feedQuery) {
        return new Feed(feedQuery);
    }
}
