package pl.agh.tai.domain.feed;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FeedQuery {
    private final String keywords;
    private final String description;

    @JsonCreator
    public FeedQuery(@JsonProperty("keywords") String keywords,
                     @JsonProperty("description") String description) {
        this.keywords = keywords;
        this.description = description;
    }

    public String keywords() {
        return keywords;
    }

    public String description() {
        return description;
    }
}
