package Testss;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
}
	@Test (priority=2)
	public void invalidLoginTest() {
		LoginPage login =new LoginPage(driver);
		login.login("invalid" , "invalid");
		Assert.assertTrue(driver.getPageSource().contains("Epic sadface"));
	}
}