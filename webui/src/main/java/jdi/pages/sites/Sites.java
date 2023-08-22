package jdi.pages.sites;

import com.epam.commons.PropertyReader;
import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.settings.WebSettings;
import jdi.pages.BasePage;
import jdi.pages.MainPage;
import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.elements.init.PageFactory.initSite;

@JSite("https://jut.su")
public class Sites extends BasePage {
    @Url("/")
    @Title("Школа техник Наруто: стань героем мира ниндзя")
    public static MainPage mainPage;

    public interface Init {
        @BeforeSuite(alwaysRun = true)
        static void setUp() {
            initElements(Sites.class);
        }
    }

}
