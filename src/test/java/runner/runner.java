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
        tags = "@browser",
        dryRun = false
)
public class runner {

}


git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Ahmet-KARAGOZ/Appium-Cucumber-Self.git
git push -u origin main