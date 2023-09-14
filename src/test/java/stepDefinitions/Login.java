package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {	
	
	WebDriver driver;
	
	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
	   driver = DriverFactory.getDriver();
	   driver.findElement(By.xpath("//span[text()='My Account']")).click();
	   driver.findElement(By.linkText("Login")).click();
	}

	@When("User enter valid email address {string} into the email text field")
	public void user_enter_valid_email_address_into_the_email_text_field(String valEmailId) {
		driver.findElement(By.id("input-email")).sendKeys(valEmailId);
	}

	@When("User enter valid password {string} into the password field")
	public void user_enter_valid_password_into_the_password_field(String valPwd) {
	    driver.findElement(By.id("input-password")).sendKeys(valPwd);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	    Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@When("User enter invalid email address {string} into the email text field")
	public void user_enter_invalid_email_address_into_the_email_text_field(String invalEmailId) {
		driver.findElement(By.id("input-email")).sendKeys(invalEmailId);
	}

	@When("User enter invalid password {string} into the password field")
	public void user_enter_invalid_password_into_the_password_field(String invalPwd) {
		driver.findElement(By.id("input-password")).sendKeys(invalPwd);
	}

	@Then("User should get a warning message about credential mismatch")
	public void user_should_get_a_warning_message_about_credential_mismatch() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));   
	}

	@When("User doesnt enter email address into the email text field")
	public void user_doesnt_enter_email_address_into_the_email_text_field() {
		driver.findElement(By.id("input-email")).sendKeys("");
	}

	@When("User doesnt enter password into the password field")
	public void user_doesnt_enter_password_into_the_password_field() {
		driver.findElement(By.id("input-password")).sendKeys("");
	}

}
