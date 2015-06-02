package pl.agh.tai.portsadapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.tai.domain.aggregage.Feed;
import pl.agh.tai.domain.repository.IFeedRepository;

import java.util.Collection;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/feeds")
public class FeedsController {

    @Autowired
    private IFeedRepository feedRepository;

    @ResponseStatus(CREATED)
    @RequestMapping(value = "/",
            method = RequestMethod.POST,
            consumes = "application/json")
    public JsonResponse addFeed(@RequestBody Feed feed) {
        this.feedRepository.add(feed);

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
