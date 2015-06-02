package pl.agh.tai.domain.appservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.feed.Feed;
import pl.agh.tai.domain.repository.IFeedRepository;

import static com.google.common.base.Preconditions.checkNotNull;

@Component
public class FeedService {

    private final IFeedRepository feedRepository;
    private final IAllegroClient allegroClient;

    @Autowired
    public FeedService(IFeedRepository feedRepository, IAllegroClient allegroClient) {
        this.feedRepository = feedRepository;
        this.allegroClient = allegroClient;
    }

    public void registerNewFeed(Feed feed) {
        checkNotNull(feed);
        this.feedRepository.add(feed);
        feed.updateAuctions(allegroClient.findMatchingAuctions(feed.feedQuery()));
    }
}

