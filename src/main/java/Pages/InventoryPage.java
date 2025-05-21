package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[data-test='add-to-cart-sauce-labs-backpack']")
    WebElement addBackpack;

    @FindBy(css = ".shopping_cart_link")
    WebElement cartIcon;

    public void addItemToCart() {
        addBackpack.click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
