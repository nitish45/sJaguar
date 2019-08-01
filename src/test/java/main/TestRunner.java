package main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
          
@RunWith(Cucumber.class)
@CucumberOptions(features=".",
		//glue= {"classpath:main/StepDo"},
		tags= {"@@allscenarios"},
		 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner {
	

}

//classpath:features/zoopla.feature   