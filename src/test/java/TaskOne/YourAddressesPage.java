package TaskOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAddressesPage {
    private static WebDriver driver;
    WebElement alertSuccess;
    String id;
    String xpathExpression;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickCreateNewAddress() {
        WebElement plusCreateNewAddress = driver.findElement(By.xpath("//a[@data-link-action = 'add-address']"));
        plusCreateNewAddress.click();

    }

    public boolean alertSuccessIsDisplayed() {

        alertSuccess = driver.findElement(By.xpath("//article[@role='alert' and @data-alert='success']"));
        boolean alertSuccessDisplayed = alertSuccess.isDisplayed();
        return alertSuccessDisplayed;

    }

    public String getAddressId() {
        WebElement lastCurrentAddressDate = driver.findElements(By.className("address")).getLast();
        id = lastCurrentAddressDate.getAttribute("id");
       // System.out.println(id);
        return id;
    }

    public String lastAddressAreaIsDisplayed() {

        String xpathExpression = "//article[@id='" + id + "']";
        return xpathExpression;
    }

    public String getLastAddress() {

        String xpathExpression = "//article[@id='" + id + "']/div/address";
        WebElement lastAddressFind = driver.findElement(By.xpath(xpathExpression));
        String lastAddress = lastAddressFind.getText();
        // System.out.println("lastAddress: " + lastAddress);
        return lastAddress;
    }

    public String getLastAlias() {
        String xpathExpression = "//article[@id='" + id + "']/div/h4";
        WebElement lastAliasFind = driver.findElement(By.xpath(xpathExpression));
        String lastAlias = lastAliasFind.getText();
        // System.out.println("lastAlias: " + lastAlias);
        return lastAlias;

    }


    public void clickAddressDelete() {
        xpathExpression = "//article[@id='" + id + "']/div/a[@data-link-action='delete-address']";
        WebElement deleteAddress = driver.findElement(By.xpath(xpathExpression));
        deleteAddress.click();
    }


}
