package com.bdd.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/login.feature" }, 
        glue = { "classpath:com.bdd.stepDefinitions" }, plugin = {
	    "pretty:build/reports/cucumber-pretty.txt",
        "html:build/reports/cucumber",
		"junit:build/reports/junit.xml",
		"json:build/reports/cucumber.json",
		"usage:build/reports/cucumber-uasge.json"}, 
       tags = { "@login" })
public class JunitTestRunner {

}
