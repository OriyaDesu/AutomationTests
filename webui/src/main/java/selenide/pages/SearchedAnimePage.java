package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchedAnimePage {

    private final ElementsCollection narutoSeasons = $$x("//div[@class='all_anime_global']");

    public SelenideElement selectFirstSeason() {
        return narutoSeasons
                .filter(Condition.text("1 сезон"))
                .first();
    }
}
