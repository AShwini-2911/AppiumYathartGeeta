package stepDef;

import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;

import base.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;
import io.qameta.allure.Step;

import pages.SignPage;

public class SignInStep extends DriverManager{
private AndroidDriver driver;
	
	private SignPage login ; 
	
    private static final Logger logger = LogManager.getLogger(SignInStep.class);

	
	@Given("The user is on the login screen")
	@Step("The user is on login screen")
	public void the_user_is_on_the_login_screen() throws InterruptedException {
		DriverManager.initializeDriver();
	     login = new SignPage(DriverManager.getDriver());
	     logger.info("Yatharth Geeta app is launched");
		    Thread.sleep(3000);
		    
		    login.permissionAllow();
		    Thread.sleep(3000);

		    
	}
	@When("The user enters a valid mobile number")
	@Step("User enters a valid mobile number")
	public void the_user_enters_a_valid_mobile_number() {
	    login.mobileNum();
	}
	@When("Clicks on the login button")
	@Step("Clicks on the login button")
	public void clicks_on_the_login_button() {
	    login.loginBtn();
	}
	
	@When("user enters enter OTP")
	@Step("user enters OTP")
	public void user_enters_enter_otp() {
	    
	}

	@Then("user should able to see home page")
	@Step("user should able to see home page")
	public void user_should_able_to_see_home_page() {
	   
	}



}
