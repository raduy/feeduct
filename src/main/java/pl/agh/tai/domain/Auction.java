package pl.agh.tai.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
public class Auction extends AbstractPersistable<Long>{
    private Vendor vendor;
    private String image;
    private String title;
    private String url;

    public Auction(Vendor vendor, String image, String title, String url) {
        this.vendor = vendor;
        this.image = image;
        this.title = title;
        this.url = url;
    }

    Auction() { //why JPA why
    }
}
