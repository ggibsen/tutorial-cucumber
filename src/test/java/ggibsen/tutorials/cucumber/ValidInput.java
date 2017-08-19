package ggibsen.tutorials.cucumber;

import ggibsen.tutorials.cucumber.model.BizPojo;
import ggibsen.tutorials.cucumber.service.BizValidationService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This class is example of a StepDefinition.  Runs the ValidInput feature file
 * (note naming of step def class and feature file doesn't have to be 1-1).
 * <p>
 * Created by ggibsen on 6/30/2017.
 */
public class ValidInput extends CucumberSpringStepDefConfig {

    private static final int NUM_IDEAS_IF_HAVE_DUPLICATE = 2;

    @Autowired
    private BizValidationService service;

    @Autowired
    private World world;

    @Given("^I have a duplicate business idea ID (\\d+) \"(.*)\"$")
    public void createAndInsertBizValue(long id, String value) {
        BizPojo bizVal = new BizPojo(id, value);
        receiveBizIdea(bizVal);
    }

    @When("^Business idea is received$")
    public void receiveBizIdea() {
        receiveBizIdea(world.getBizPojo());
    }

    private void receiveBizIdea(BizPojo bizVal) {
        service.insertBizIdea(bizVal);
    }

    @Then("^Idea should be thoroughly explained$")
    public void verifyThoroughlyExplainedBizValue() {
        service.verifyExplanation(world.getBizPojo().getId());
    }

    @Then("^Idea should have at least (\\d+) sponsors$")
    public void verifyMinimumSponsorship(final int MIN_NUM_SPONSORS) {
        if (service.getSponsors(world.getBizPojo().getId()).size() < MIN_NUM_SPONSORS) {
            throw new RuntimeException("Not enough sponsorship for biz idea!");
        }
    }

    @Then("^Business idea is not accepted$")
    public void verifyBusinessIdeaIsNotAdded() {
        if (service.getNumberIdeas() >= NUM_IDEAS_IF_HAVE_DUPLICATE) {
            throw new RuntimeException("Got a duplicate biz idea");
        }
    }
}
