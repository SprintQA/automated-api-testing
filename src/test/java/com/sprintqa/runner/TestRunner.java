package com.sprintqa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Tafseer Haider 27 Sep. 2020
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "resources/features",
		glue = "com.sprintqa.stepdefs",
		monochrome = true,
		plugin = {"html:report", "json:target/cucumber.json"}

)
public class TestRunner
{
}
