package pl.agh.tai.portsadapter.rest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.tai.domain.appservice.FeedService;
import pl.agh.tai.domain.feed.Feed;
import pl.agh.tai.domain.feed.FeedFactory;
import pl.agh.tai.domain.feed.FeedId;
import pl.agh.tai.domain.feed.FeedQuery;
import pl.agh.tai.domain.repository.IFeedRepository;

import javax.validation.Valid;
import java.util.Collection;

import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api/v1/feeds")
public class FeedsController {
    private static final Logger LOG = getLogger(FeedsController.class);

    private final IFeedRepository feedRepository;
    private final FeedFactory feedFactory;
    private final FeedService feedService;

    @Autowired
    public FeedsController(IFeedRepository feedRepository,
                           FeedFactory feedFactory,
                           FeedService feedService) {
        this.feedRepository = feedRepository;
        this.feedFactory = feedFactory;
        this.feedService = feedService;
    }

    @ResponseStatus(CREATED)
    @RequestMapping(method = POST,
            consumes = APPLICATION_JSON_VALUE)
    public JsonResponse addFeed(@RequestBody @Valid FeedQuery feedQuery) {
        LOG.debug("Adding new feed: {}", feedQuery);
        this.feedService.registerNewFeed(feedFactory.newFeed(feedQuery));

        return JsonResponse.ofSuccess();
    }

    @RequestMapping(method = GET,
            produces = APPLICATION_JSON_VALUE)
    public JsonResponse<Feed> listAllFeeds() {
        Collection<Feed> allFeeds = this.feedRepository.immutableView();
        return JsonResponse.ofSuccess(allFeeds);
    }

    @RequestMapping(value = "/{id}",
            method = GET,
            produces = APPLICATION_JSON_VALUE)
    public JsonResponse<Feed> findFeed(@PathVariable String id) {
        Feed feed = this.feedRepository.load(new FeedId(id));
        return JsonResponse.ofSuccess(feed);
    }

    @RequestMapping(value = "/{id}",
            method = DELETE)
    public JsonResponse<String> deleteFeed(@PathVariable String id) {
        LOG.debug("Removing feed of id: {}", id);
        this.feedRepository.delete(new FeedId(id));
        return JsonResponse.ofSuccess(id);
    }
}
