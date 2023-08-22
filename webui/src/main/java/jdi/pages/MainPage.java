package jdi.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import jdi.pages.sectors.LoginPanel;
@JSite("https:")
public class MainPage extends WebPage {
    @UI("//*[text() = 'Войти']")
    public UIElement entry;
    @UI("//div[@id = 'login_panel']")
    public LoginPanel loginPanel;

    public void inputLogin(String login, String password) {
        entry.click();
        loginPanel.login.sendKeys(login);
        loginPanel.password.sendKeys(password);
        loginPanel.entry.click();
    }



}
