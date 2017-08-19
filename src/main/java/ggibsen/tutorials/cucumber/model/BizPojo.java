package ggibsen.tutorials.cucumber.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ggibsen on 6/27/2017.
 */
public class BizPojo {

    private final String bizValue;

    private final long id;

    public BizPojo(long id, String bizValue) {
        this.bizValue = bizValue;
        this.id = id;
    }

    public String getBizValue() {
        return bizValue;
    }

    public long getId() {
        return id;
    }

    public List<String> getSponsors() {
        // this is just a silly implementation to prove out Cucumber test
        return Arrays.asList("Night Wing", "Alfred", "Oracle");
    }

    public List<String> getCorporateSponsors() {
        // this is just a silly implementation to prove out Cucumber test
        return Arrays.asList("Batman");
    }

    public List<String> getApprovals() {
        // this is just a silly implementation to prove out Cucumber test
        return Arrays.asList("Joker", "Two Face", "Poison Ivy");
    }
}
