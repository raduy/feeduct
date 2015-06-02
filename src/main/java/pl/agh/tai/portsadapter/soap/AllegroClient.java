package pl.agh.tai.portsadapter.soap;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import pl.agh.tai.domain.Auction;
import pl.agh.tai.domain.Vendor;
import pl.agh.tai.domain.appservice.IAllegroClient;
import pl.agh.tai.domain.feed.FeedQuery;

import java.util.Collection;

@Component
public class AllegroClient implements IAllegroClient {

    @Override
    public Collection<Auction> findMatchingAuctions(FeedQuery query) {
        return mockResponse(query);
    }

    private Collection<Auction> mockResponse(FeedQuery query) {
        String image = "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcReJlLAflWKPwl6wU-jDzJVL_XDX8Yb72HwxpoakQRCgirJXQsjfQ";
        String url = "http://allegro.pl/audi-rs6plus-2011-5-0tfsi-abt-700km-limitowana-i5406666662.html";
        Auction auction = new Auction(Vendor.ALLEGRO, image, query.keywords(), url);

        return Lists.newArrayList(auction, auction, auction);
    }
}
