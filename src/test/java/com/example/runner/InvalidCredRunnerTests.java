package com.example.runner;

/*
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
*/
//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("features")
//@SelectClasspathResource("com.example")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:") 
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example")
  
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "src/test/resources/features/InvalidCredentials.feature", glue = "com.example.definitions",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class InvalidCredRunnerTests  {
  
}