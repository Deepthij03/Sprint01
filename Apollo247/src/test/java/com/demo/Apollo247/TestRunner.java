package com.demo.Apollo247;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",glue= {"steps"})
public class TestRunner extends AbstractTestNGCucumberTests 
{
	
}
//,glue= {"steps"}, plugin= {"pretty","html:target/cucumber-report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}