package runner;

import base.CustomizeTestNGCucum;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "E:\\Appium\\YatharthGeeta\\src\\test\\resources\\features\\login.feature",
		glue = { "stepDef", "Hooks" },
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" 
				, "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		}		
		)

public class TestRunner extends CustomizeTestNGCucum{

}
