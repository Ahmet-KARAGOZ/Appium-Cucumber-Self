package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = {"src/test/resources/features", "src/test/resources/mobileTesting"},
        glue = "stepdefinitions",
        tags = "@lidl",
        dryRun = false
)
public class runner {

}


