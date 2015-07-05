package pl.agh.tai.domain.feed;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Embeddable;

@Embeddable
public class FeedQuery {
    @NotEmpty
    private String keywords;
    private String description;

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

    FeedQuery() {
    }
}
