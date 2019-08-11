package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinition", "config"},
        format = {"pretty", "html:test-outout"},
        monochrome = true,
        strict = false,
        dryRun = false
)

public class TestRunner {
}
