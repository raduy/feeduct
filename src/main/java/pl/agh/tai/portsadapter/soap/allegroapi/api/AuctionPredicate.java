package pl.agh.tai.portsadapter.soap.allegroapi.api;

public class AuctionPredicate {

    private String keyword;

    public AuctionPredicate(String keyword) {
        this.keyword = keyword;
    }

    public String keyword() {
        return keyword;
    }
}
