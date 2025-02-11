package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit
@CucumberOptions(features = "D:\\JAVA_selenium_practice\\ZoodTestWeb\\src\\test\\java\\cucumber",
        glue = "zoodtest.stepDefinitions",
        monochrome = true,
        tags = "@Regression",
        plugin = {"html:target/cucumber.html"},
        dryRun = true) // Add this temporarily
public class TestNGTestRunner extends AbstractTestNGCucumberTests { }

