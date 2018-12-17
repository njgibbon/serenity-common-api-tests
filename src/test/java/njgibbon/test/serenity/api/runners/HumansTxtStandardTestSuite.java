package njgibbon.test.serenity.api.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "junit:target/cucumber.xml"},
        strict = true,
        monochrome = true,
        features = "src/test/resources/features",
        tags = {"@humansTxtStandardTest"},
        glue = "njgibbon.test.serenity.api.steps"
)
public class HumansTxtStandardTestSuite {
}
