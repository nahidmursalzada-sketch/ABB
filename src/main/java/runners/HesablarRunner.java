package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/Hesablar.feature",
        glue = {"stepDefinition", "config"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/HesablarReport.json",
                "html:target/cucumber-reports/html/HesablarReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        tags = "@Hesablar",
        monochrome = true
)
public class HesablarRunner {
}
