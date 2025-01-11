package TaskOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {

    private static WebDriver driver;

    @FindBy(id = "addresses-link")
    WebElement createAdrress;

    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToNewAddressForm() {
        createAdrress.click();
    }


}
