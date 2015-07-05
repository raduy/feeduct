package pl.agh.tai.domain.feed;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author Lukasz Raduj 2015 raduj.lukasz@gmail.com.
 */
@Converter
public class FeedIdConverter implements AttributeConverter<FeedId, String> {
    @Override
    public String convertToDatabaseColumn(FeedId feedId) {
        return feedId.toString();
    }

    @Override
    public FeedId convertToEntityAttribute(String s) {
        return new FeedId(s);
    }
}
