package Suadeo.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/SuadeoLogin2.feature",glue = {"StepDefination"}, 
tags = "@mustrun", 
stepNotifications = true,
monochrome = true,
plugin = {"pretty","html:target/report/HtmlReports.html",
				   "json:target/report/JsonReports.json",
				   "junit:target/report/xmlReports.xml"}
)
public class TestRunner {

}

//Step 5 - Run test runner class with different combination of tags
//
//Single tag - tags = {"@smoke"}
//
//Multiple tags
//Tags with AND OR conditions
//tags = {"@smoke or @regression"}
//tags = {"@smoke and @regression"}
//tags = {"@smoke and not @regression"}
//
//Skip or Ignore Tags
//tags = {"(@smoke or @regression) and not @important"}


//Useful Tips - General
//Tags can be placed above the following Gherkin elements:
//Feature
//Scenario
//Scenario Outline
//Examples
//It is not possible to place tags above Background or steps (Given, When, Then, And and But)
//
//Useful Tips - Tags Inheritance
//Tags are inherited by child elements.
//Tags that are placed above a Feature will be inherited by Scenario, Scenario Outline, or Examples.
//Tags that are placed above a Scenario Outline will be inherited by Examples