package pl.agh.tai.domain;

public class Auction {
    private final Vendor vendor;
    private final String image;
    private final String title;
    private final String url;

    public Auction(Vendor vendor, String image, String title, String url) {
        this.vendor = vendor;
        this.image = image;
        this.title = title;
        this.url = url;
    }


}
