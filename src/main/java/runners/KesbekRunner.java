package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/Kesbek.feature",
        glue = {"stepDefinition", "config"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/KesbekReport.json",
                "html:target/cucumber-reports/html/KesbekReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        tags = "@Kesbek",
        monochrome = true
)
public class KesbekRunner {
}
