package Testss;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.CheckoutOverviewPage;
import Pages.CheckoutPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckOutTest extends BaseTest{
	@Test
	
	public void completecheckoutflow () throws InterruptedException{
		LoginPage login = new LoginPage(driver);
		login.login("standard_user", "secret_sauce");
		
		InventoryPage inventory = new InventoryPage (driver);
		inventory.addItemToCart();
		inventory.goToCart();
		Thread.sleep(3000);
		
		CartPage cart = new CartPage(driver);
        cart.clickCheckout();
        Thread.sleep(3000);

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillDetailsAndContinue("John", "Doe", "12345");

        CheckoutOverviewPage overview = new CheckoutOverviewPage(driver);
        overview.finishOrder();

        Assert.assertTrue(driver.getPageSource().contains("Thank you for your order!"));
	}

}
