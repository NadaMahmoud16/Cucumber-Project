package org.example.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "org.example.StepDefs",
        plugin = {
                "pretty",
                "html:Reports/report.html"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
}
