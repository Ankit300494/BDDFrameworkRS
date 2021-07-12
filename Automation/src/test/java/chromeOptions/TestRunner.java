package chromeOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications=true,monochrome = true,
features =
{"src/test/java/undoFeature/LoginDemo.feature" },
glue = {"stepDefinition"},tags="@Smoke", plugin= {"pretty", "json:target/JSONReport/report.json"} )    

public class TestRunner {



}
