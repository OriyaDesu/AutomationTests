package selenide.tests;

import org.apache.commons.text.RandomStringGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import selenide.pages.MainPage;

public class JutsuTests {
    private static final MainPage mainPage = new MainPage();
    private static final String randomText = generateRandomText(10);

    @BeforeClass
    public void setup() {
        mainPage.setUp();
        mainPage.openPage("https://jut.su/anime");
    }

    @Test
    @Description("Попытка авторизации с валидными данными -> успешно")
    public static void test() {
        mainPage.inputLogin("auto_testik", "Testik12345");
        Assert.assertTrue(MainPage.profile.isDisplayed());
    }

    @Test
    @Description("Попытка авторизации с невалидными данными -> ошибка")
    public static void checkAuthWithInValidLoginIsSuccessfullyTest() {
        mainPage.inputLogin(randomText, randomText);
        Assert.assertFalse(MainPage.profile.isDisplayed());
    }

    @Test
    @Description("Перейти на аниме из рекомендаций -> Отобразилась страница с медиа соответствующего аниме")
    public static void checkTest() {

    }

    @Test
    @Description("Найти в поиске ‘Наруто’, перейти на страницу '1 сезон' -> В результатах отобразился список с соответствующим названием ")
    public static void checkFTest() {
        mainPage.openAnimeTab().search("Наруто").selectFirstSeason().click();

    }

    @Test
    @Description("Быть на главной странице. Переключить на dark_mode -> успешно")
    public static void checkDTest() {

    }

    public static String generateRandomText(int length) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        return generator.generate(length);
    }
}
