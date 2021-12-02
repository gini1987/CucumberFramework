package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//Package name
		features = {"src/test/java/Features"},
		glue = {"stepDefinitions"}
		
		)

public class TestRunner {

}
