package pl.agh.tai.portsadapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.tai.domain.feed.Feed;
import pl.agh.tai.domain.feed.FeedFactory;
import pl.agh.tai.domain.feed.FeedQuery;
import pl.agh.tai.domain.repository.IFeedRepository;

import java.util.Collection;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/feeds")
public class FeedsController {

    @Autowired
    private IFeedRepository feedRepository;

    @Autowired
    private FeedFactory feedFactory;

    @ResponseStatus(CREATED)
    @RequestMapping(value = "/",
            method = RequestMethod.POST,
            consumes = "application/json")
    public JsonResponse addFeed(@RequestBody FeedQuery feed) {
        this.feedRepository.add(feedFactory.newFeed(feed));

        return JsonResponse.ofSuccess();
    }

    @RequestMapping(value = "/",
            method = RequestMethod.GET,
            produces = "application/json")
    public JsonResponse<Feed> listAllFeeds() {
        Collection<Feed> allFeeds = this.feedRepository.immutableView();
        return JsonResponse.ofSuccess(allFeeds);
    }
}
