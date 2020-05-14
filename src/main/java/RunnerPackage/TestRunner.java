package RunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "/Users/sumitsharma/MyStuff/BDD/FreeCRMBDDFramework/src/main/java/Features/contacts.feature",
		glue= {"StepDefinition"},
		format= {"pretty", "html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//to generate different types of report.
		dryRun=false,//it is defined to check mapping is proper between feature and step definition file.
		monochrome=true,//to give output in proper format on console.
		strict=true//it will check if any step is not defined in step definition file
		)	

public class TestRunner {

}