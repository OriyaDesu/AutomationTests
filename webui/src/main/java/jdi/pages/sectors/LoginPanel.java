package jdi.pages.sectors;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Input;
import jdi.pages.BasePage;

public class LoginPanel extends BasePage {

    @UI("//div[@name = 'login_name']")
    public Input login;
    @UI("//div[@type = 'password']")
    public Input password;
    @UI("//div[@id = 'login_submit']")
    public Button entry;

}
