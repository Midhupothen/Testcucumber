package stepdefinitions;


	import org.openqa.selenium.WebDriver;

import com.base.Baseclass;
import com.pages.Login;

import io.cucumber.java.After;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Loginstep extends Baseclass {
		
		public WebDriver driver;
		
		public Login obj;
		
		
		@Given("I am on the Sauce Demo Login Page")
		public void i_am_on_the_sauce_demo_login_page() {
			driver=initializeDriver();
			obj=new Login(driver);
		    
		}

		@When("I fill the account information for account StandardUser into the User name field and the Password field")
		public void i_fill_the_account_information_for_account_standard_user_into_the_user_name_field_and_the_password_field() {
			//obj=new loginPage(driver);
			obj.login("standard_user","secret_sauce");
		}
		@When("I fill the account information for account LockedOutUser into the Username field and the Password field")
		public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {
			obj.login("locked_out_user","secret_sauce");
		}
		

		/*@And("I click the Login Button")
		public void i_click_the_login_button(){
		    obj.click();
		}*/

		@Then("I am redirected to the Sauce Demo Main Page")
		public void i_am_redirected_to_the_sauce_demo_main_page() {
		    System.out.println(obj.logo());
		}
		
		@Then("I verify the Error Message contains the text {string}")
		public void i_verify_the_error_message_contains_the_text(String string) {
			String s=obj.checkError();
		    System.out.println(s);
		}

		/*@Then("I verify the App logo exists")
		public void i_verify_the_app_logo_exists() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@After
		public void teardown()
		{
			driver.close();
		}*/

	}


