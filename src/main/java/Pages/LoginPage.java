package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
	super(driver);
	
	}
	@FindBy (id = "user-name")
	WebElement username;
	
	@FindBy (id= "password")
	WebElement password;
	
	@FindBy (id= "login-button")
	WebElement Login;
	
	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		Login.click();
	}
	
}
