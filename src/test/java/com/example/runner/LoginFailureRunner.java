package com.example.runner;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "src/test/resources/features/LoginFailureRunner.feature", glue = "com.example.definitions",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class LoginFailureRunner  {
  
}