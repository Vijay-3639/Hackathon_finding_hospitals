package runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( tags = "", features = "C:\\Users\\2303639\\eclipse-workspace\\hackathon\\features\\findingHospitalsTest.feature", 
glue = {"stepDefinitionFiles"},
plugin = {"pretty","html:reports/htmlreport.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun = false,
monochrome = true,
publish = true)
public class runnerTest extends AbstractTestNGCucumberTests {

}
