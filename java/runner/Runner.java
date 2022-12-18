package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.Baseclass;

@CucumberOptions(features = "src/test/java/feature",
					glue = "steps",
					monochrome = true
					)
public class Runner extends Baseclass{

}
