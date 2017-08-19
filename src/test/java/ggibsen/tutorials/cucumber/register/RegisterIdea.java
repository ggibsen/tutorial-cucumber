package ggibsen.tutorials.cucumber.register;

import ggibsen.tutorials.cucumber.CucumberSpringStepDefConfig;
import ggibsen.tutorials.cucumber.World;
import ggibsen.tutorials.cucumber.model.BizPojo;
import ggibsen.tutorials.cucumber.service.BizValidationService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This class is example of a StepDefinition.  Runs the RegisterIdea feature file
 * (note naming of step def class and feature file doesn't have to be 1-1).
 * <p>
 * Created by ggibsen on 6/30/2017.
 */
public class RegisterIdea extends CucumberSpringStepDefConfig {

    @Autowired
    private BizValidationService service;

    @Autowired
    private World world;

    @When("^Business idea is registered$")
    public void registerBizIdea() {
        registerBizIdea(world.getBizPojo());
    }

    private void registerBizIdea(BizPojo bizVal) {
        service.register(bizVal);
    }

    @Then("^Idea should have (\\d+) approvals$")
    public void verifyApprovals(final int NUM_APPROVALS) {
        if (service.getApprovals(world.getBizPojo().getId()).size() < NUM_APPROVALS) {
            throw new RuntimeException("Not enough approvers for biz idea!");
        }
    }

    @Then("^Idea should have at least (\\d+) corporate sponsors$")
    public void verifyExistCorporateSponsorship(final int MIN_NUM_SPONSORS) {
        if (service.getCorporateSponsors(world.getBizPojo().getId()).size() < MIN_NUM_SPONSORS) {
            throw new RuntimeException("Not enough corporate sponsorship for biz idea!");
        }
    }
}
