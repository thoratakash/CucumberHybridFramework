package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) -> This option is used if u want to do execution using JUnit
@CucumberOptions(
		features="src/test/resources/features",
		glue={"stepdefinitions","hooks"},
		tags="@all",
		dryRun=false,
		plugin={"pretty",
				        "html:target/CucumberReports/CucumberReport.html",
				         "json:target/CucumberReports/CucumberReport.json",
				         "junit:target/CucumberReports/CucumberReport.xml"
				       }
        )
public class TestRunner extends AbstractTestNGCucumberTests{
	
}//class


