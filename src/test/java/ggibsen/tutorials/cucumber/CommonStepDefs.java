package ggibsen.tutorials.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicLong;

/**
 * This class holds common step definitions that we see more than one feature file wanting to leverage.
 * <p>
 * Cucumber doesn't allow inheritance of step definition classes, so instead we're using a separate "common" class for
 * reusable steps.
 * Created by ggibsen on 6/30/2017.
 */
public class CommonStepDefs {

    // NOTE:  Don't use static variables... we don't want to share scope/state across different scenario runs
    // I learned that a step definition class gets instantiated every time a NEW
    // scenario is run in the feature file.
    private final AtomicLong counter = new AtomicLong(0);

    @Autowired
    private World world;

    @Given("^I have a business idea$")
    public void createBizValue() {
        long id = counter.incrementAndGet();
        world.createBizPojo(id, "Some great idea for " + id);
    }

    @After
    public void clearStateAfterScenario() {
        world.clearStateAfterScenario();
    }
}
