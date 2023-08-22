package jdi.tests;


import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.settings.WebSettings;
import jdi.pages.sites.Sites;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.init.PageFactory.initSite;
import static jdi.pages.sites.Sites.mainPage;

public class JutsuTests {
    @BeforeClass
    public void setup() {
//        WebSettings.setDomain("https://jut.su/");
//
//        WebDriverFactory.getDriver().manage().window().maximize();

        mainPage.open();
        mainPage.checkOpened();
    }

    @Test
//    @Description("Попытка авторизации с валидными данными -> успешно")
    public static void test() {
        mainPage.inputLogin("", "");
    }

    @Test
//    @Description("Попытка авторизации с невалидными данными -> ошибка")
    public static void checkAuthWithInValidLoginIsSuccessfullyTest() {
        mainPage.inputLogin("", "");
    }
}
