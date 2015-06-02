package pl.agh.tai.domain.aggregage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Feed {
    private final FeedId id;
    private final String keywords;
    private final String description;

    @JsonCreator
    public Feed(@JsonProperty("keywords") String keywords,
                @JsonProperty("description") String description) {
        this.keywords = keywords;
        this.description = description;
        this.id = new FeedId();
    }


    public FeedId id() {
        return id;
    }
}
