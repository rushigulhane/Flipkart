package com.Automation.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\rushi\\eclipse-workspace\\FlipKart\\src\\test\\resources\\Features\\flip.feature" }, 
glue = "com.Automation.StepDef", plugin = {
        "html:reports/reports.html"}, tags = "@regression")
public class TestRunner {
       
	
}
