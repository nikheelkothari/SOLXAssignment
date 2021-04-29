package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPageAndroid;
import pageFactory.LoginPageIOS;
import pageFactory.LoginPageWeb;

public class LoginCovidRoxTest {

	// Driver driver = null;
	String device = null;
	LoginPageAndroid loginPageAndroid;
	LoginPageIOS loginPageIOS;
	LoginPageWeb loginPageWeb;

	@Given("^user navigate to the login page on (.+)$")
	public void user_navigate_to_the_login_page_on(String device) throws Throwable {
		// based on the device type initialize the driver instance
		this.device = device;
		if (device.equals("iOS")) {
			//driver = new IOSDriver();
		} else if (device.equals("android")) {
			//driver = new AndroidDriver();
		} else if (device.equals("web")) {
			//driver = new WebDriver();
		}
		
		// open page
		//driver.get("application url");

	}

	@When("^user enters (.+) and (.+)$")
	public void user_enters_and(String username, String password) throws Throwable {
		// based on the device type initialize the page object and enter user details 
		if (device.equals("iOS")) {
			//loginPageIOS = new LoginPageIOS(driver);
		} else if (device.equals("android")) {
			//loginPageAndroid = new LoginPageAndroid(driver);
		} else if (device.equals("web")) {
			//loginPageWeb = new LoginPageWeb(driver);
			//loginPageWeb.enterPassword(password);
			//loginPageWeb.enterUsername(password);
		}
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		//based on the device type identify the Page instance and click on logon button 
		//loginPage = new LoginPageAndroid(driver);
		//loginPage.clickLoginBtn();
		if (device.equals("iOS")) {
		} else if (device.equals("android")) {
		} else if (device.equals("web")) {
		}
	}

	@Then("^user is navigated to landing screen$")
	public void user_is_navigated_to_landing_screen() throws Throwable {
		//landingPage = new LandingPage(driver);
		//boolean isLogoutOnLandingPageDisplayed = landingPage.checkLogoutDisplayed();
		// perform assertions 
		// 1. user is redirected to landing page 
		if (device.equals("iOS")) {
		} else if (device.equals("android")) {
		} else if (device.equals("web")) {
		}
	}

	@Then("^user is prompted with error message$")
	public void user_is_prompted_with_error_message() throws Throwable {
		String errorMessage = null;
		if (device.equals("iOS")) {
			errorMessage = loginPageIOS.getErrorMessage();
		} else if (device.equals("android")) {
			errorMessage = loginPageAndroid.getErrorMessage();
		} else if (device.equals("web")) {
			errorMessage = loginPageWeb.getErrorMessage();
		}
		// perform assertions 
		// 1. user is prompted with error message 
	}

	@Then("^submit button is disabled$")
	public void submit_button_is_disabled() throws Throwable {
		if (device.equals("iOS")) {
			loginPageIOS.isSubmitButtonEnabled();
		} else if (device.equals("android")) {
			loginPageAndroid.isSubmitButtonEnabled();
		} else if (device.equals("web")) {
			loginPageWeb.isSubmitButtonEnabled();
		}
		// perform assertions 
		// 1. user is prompted with error message 
	}

}