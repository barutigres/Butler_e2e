package butler.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports.json",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},

        features = "src/test/resources/features/",
        glue = "com/Butler_e2e/step_definitions",
        tags = "@smoke",
        dryRun = false
)

public class CukesRunner {
}
