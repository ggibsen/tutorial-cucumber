package ggibsen.tutorials.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by ggibsen on 6/28/2017.
 * <p>
 * This is test runner for Cucumber tests(invoking feature file(s))
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},
        features = {"classpath:."})
public class CucumberTest {

}
