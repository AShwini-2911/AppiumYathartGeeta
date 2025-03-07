package pages;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignPage {

	private AndroidDriver driver;
    private static final Logger logger = LogManager.getLogger(SignPage.class);

	public SignPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
	private WebElement permissionAllow;
	
	public void permissionAllow() {
		permissionAllow.click();
	}
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement mobileNum;
	
	public void mobileNum() {
		mobileNum.click();
		mobileNum.sendKeys("9579049963");
	}
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
	private WebElement loginBtn;
	
	public void loginBtn() {
		loginBtn.click();
	}
	
}
