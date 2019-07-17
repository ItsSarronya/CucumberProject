package saro.fb.runner;

import org.junit.runner.RunWith;

/*To be completed*/
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features={"feature/ExcelDataRead.feature"},
		glue = {"stepDefinition"},
		dryRun = false,
		monochrome = true
		)
public class ExcelDataRead_Runner {

}

