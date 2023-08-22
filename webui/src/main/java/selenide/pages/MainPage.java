package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage extends BasePage {
    private final SelenideElement entry = $x("//*[text() = 'Войти']");
    private final SelenideElement login = $x("//input[@name = 'login_name']");
    private final SelenideElement password = $x("//input[@type = 'password']");
    private final SelenideElement entryButton = $x("//input[@id = 'login_submit']");
    private final SelenideElement animeTab = $x("//a[text()='Аниме']");
    public static SelenideElement profile = $x("//a[text() ='Профиль']");


    public AnimePage openAnimeTab(){
        waitAndClick(animeTab);
        return new AnimePage();
    }

    public void openPage(String url) {
        Selenide.open(url);
    }

    public void inputLogin(String loginText, String passwordText) {
        entry.click();
        login.sendKeys(loginText);
        password.sendKeys(passwordText);
        entryButton.click();
    }



}
