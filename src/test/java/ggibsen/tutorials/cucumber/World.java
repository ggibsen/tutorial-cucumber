package ggibsen.tutorials.cucumber;

import ggibsen.tutorials.cucumber.model.BizPojo;
import ggibsen.tutorials.cucumber.service.BizValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Follows pattern of Cucumber world, for purposes of sharing state across different steps.
 * <p>
 * By definition, new scenarios should always start with fresh state, so that scenarios aren't contaminated.
 * Created by ggibsen on 7/24/2017.
 */
@Component
public class World {

    @Autowired
    public BizValidationService service;

    private BizPojo bizPojo;

    public void createBizPojo(long id, String bizProp) {
        bizPojo = new BizPojo(id, bizProp);
    }

    public BizPojo getBizPojo() {
        return bizPojo;
    }

    public void clearStateAfterScenario() {
        service.clear();
    }
}
