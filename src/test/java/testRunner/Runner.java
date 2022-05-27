package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=" C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\CucumberWithPom\\src\\main\\java\\feature\\freeCrm.feature",
glue={"com/qa/stepdefination"},monochrome=false,strict=true,dryRun=false)

public class Runner {

}
