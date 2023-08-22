package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class AnimePage {
    private final SelenideElement searchField = $x("//div[@id='search_b']//input[@name='ystext']");

    public SearchedAnimePage search(String name ){
        searchField.sendKeys(name, Keys.ENTER);
        return new SearchedAnimePage();
    }
}
