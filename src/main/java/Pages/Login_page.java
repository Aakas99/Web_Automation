package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CustomCode.Screenshot;
import CustomCode.textfilereader;



public class Login_page  {
	textfilereader text = new textfilereader();
	WebDriver driver;
	Screenshot sc = new Screenshot();
	
	public Login_page(WebDriver driversetup) {
		this.driver= driversetup;
	}
	
	public WebElement username() {
		WebElement UserName = driver.findElement(By.xpath(text.textreader("Username")));
		sc.captureElementScreenshot(UserName, "Username field");
		return UserName;
		
	}
	public WebElement Password() {
		WebElement Password = driver.findElement(By.xpath(text.textreader("Password")));
		sc.captureElementScreenshot(Password, "Password field");
		return Password;
		
		
	}
	public WebElement LoginBT() {
		WebElement LoginBT = driver.findElement(By.xpath(text.textreader("LoginBT")));
		sc.captureElementScreenshot(LoginBT, "Login Button field");
		return LoginBT;
		
	}

}
