package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

import static browser.Browser.getPropertyValue; //Static Import

public class HomePage {
    @FindBy(id="txtUsername")private WebElement userNameElement;
    @FindBy(id="txtPassword")private WebElement passwordElement;
    @FindBy(className = "button") private WebElement loginBtn;



    public void logIn() throws IOException {
        userNameElement.sendKeys(getPropertyValue("userName"));
        passwordElement.sendKeys(getPropertyValue("passWord"));
        loginBtn.click();
    }

}
