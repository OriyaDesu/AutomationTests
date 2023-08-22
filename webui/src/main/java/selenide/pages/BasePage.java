package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public abstract class BasePage {
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1336x768";
        Configuration.timeout = Duration.of(20, ChronoUnit.SECONDS).toMillis();
    }

    @AfterClass
    public void tearDown(){
        Selenide.closeWebDriver();
    }

    public void waitAndClick(SelenideElement element){
        element.shouldBe(enabled, visible).click();
    }
}
