package uk.nhs.hra.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Sunil Suhagiya
 */

@CucumberOptions(features = "src/test/resources/features",
        glue = "uk/nhs/hra",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/rerun.txt"},
        tags = "@smoke or @regression"
)
public class RunCuke extends AbstractTestNGCucumberTests {

}