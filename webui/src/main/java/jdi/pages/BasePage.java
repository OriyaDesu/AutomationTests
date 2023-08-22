package jdi.pages;

import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.driver.get.DriverData;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.settings.WebSettings;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebPage {

    public WebDriver.Window window() {
        return this.driver().manage().window();
    }

    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
