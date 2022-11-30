package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class UIChromeDriver {

    private static WebDriver driver = null;

    @Before("@FrontendTest")
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriverManager.chromedriver().setup();
        driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After("@FrontendTest")
    public void teardown(Scenario scenario) {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
