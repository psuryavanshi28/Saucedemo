package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "finish")
    WebElement finishBtn;

    public void finishOrder() {
        finishBtn.click();
    }
}
