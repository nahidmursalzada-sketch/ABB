package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/OnlaynXidmetler.feature",
        glue = {"stepDefinition", "config"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/OnlaynXidmetlerReport.json",
                "html:target/cucumber-reports/html/OnlaynXidmetlerReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        tags = "@OnlaynXidmetler",
        monochrome = true
)
public class OnlaynXidmetlerRunner {
}
