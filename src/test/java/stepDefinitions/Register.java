package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	WebDriver driver;
	@Given("user navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	    driver = DriverFactory.getDriver();
	    driver.findElement(By.xpath("//span[text()='My Account']")).click();
	    driver.findElement(By.linkText("Register")).click();
	    
	}

	@When("User enters below details")
	public void user_enters_below_details(DataTable dataTable) {
	   Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
	   driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstname"));
	   driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastname"));
	   driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
	   driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
	   driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
	   driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("password"));
	}

	@When("User selects Yes for Newaletter")
	public void user_selects_yes_for_newaletter() {
	    
	}

	@When("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
	    
	}

	@When("User clicks on COntinue button")
	public void user_clicks_on_c_ontinue_button() {
	    
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
	    
	}

	@Then("User should get a proper warning about duplicate mail")
	public void user_should_get_a_proper_warning_about_duplicate_mail() {
	    
	}

	@When("User doesnt enter any details into fields")
	public void user_doesnt_enter_any_details_into_fields() {
	    
	}

	@Then("User should get a proper warning message for every mandatory field")
	public void user_should_get_a_proper_warning_message_for_every_mandatory_field() {
	    
	}

}
