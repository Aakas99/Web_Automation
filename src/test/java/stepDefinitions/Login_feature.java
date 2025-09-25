package stepDefinitions;


import Pages.Login_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_feature {
	Login_page login;
	

	@SuppressWarnings("static-access")
	@Given("Launch the Web browser")
	public void launch_the_web_browser() {
		
		login = new Login_page(Hooks.getDriverSetup().getDriver());
		
	}
	
	@When("UserId {word} and password {word} is entered")
	public void user_id_user_id_and_password_password_is_entered(String userId, String password) {
		 login.username().sendKeys(userId);
	     login.Password().sendKeys(password);
	    
	}
	
	@Then("Login button is clicked")
	public void login_button_is_clicked() {
		login.LoginBT().click();
	   
	}
	

}
