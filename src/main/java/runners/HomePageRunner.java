package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/HomePage.feature",
        glue = {"stepDefinition", "config"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/HomePageReport.json",
                "html:target/cucumber-reports/html/HomePageReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        tags = "@HomePage",
        monochrome = true
)
public class HomePageRunner {
}
