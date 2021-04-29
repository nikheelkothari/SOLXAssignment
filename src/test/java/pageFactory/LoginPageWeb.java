package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWeb {

	WebDriver driver = null;

	public LoginPageWeb(WebDriver driver) {
		super();
		//Initialize Driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "web_username")
	WebElement txt_web_username;

	@FindBy(id = "web_password")
	WebElement txt_web_password;

	@FindBy(id = "web_login_button")
	WebElement web_login_button;
	
	@FindBy(id = "web_error_message")
	WebElement web_error_message;

	public void enterUsername(String username) {
		// Enter username
	}

	public void enterPassword(String password) {
		// Enter password
	}

	public void clickLoginBtn() {
		// Click login
	}
	
	public String getErrorMessage() {
		// get error message
		return null;
	}
	
	public boolean isSubmitButtonEnabled() {
		// check submit button is enabled
		return false;
	}
}
