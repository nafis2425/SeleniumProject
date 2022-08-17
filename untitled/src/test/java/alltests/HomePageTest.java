package alltests;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static browser.Browser.getPropertyValue;

public class HomePageTest {
    WebDriver driver;
    @BeforeMethod
    public void setup() throws IOException {
        Browser.setDriver();
        driver=Browser.getDriver();
        driver.navigate().to(getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }
    @Test
    public void test1(){
        System.out.println("MOCK TEST");
    }
}

