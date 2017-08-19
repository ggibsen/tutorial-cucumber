package ggibsen.tutorials.cucumber;

import org.springframework.boot.test.IntegrationTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * This class loads a Spring context for testing.  The context will have beans that can get injected
 * into the various Step definitions.
 * <p>
 * Created by ggibsen on 7/11/2017.
 */

@ContextConfiguration(classes = MainApp.class)
// starting in spring boot 1.5, use SpringBootTest
@IntegrationTest
public class CucumberSpringStepDefConfig {

}
