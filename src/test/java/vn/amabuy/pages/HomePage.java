package vn.amabuy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

public class HomePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElementFacade loginLink;


    public void clickOnLoginLink(){
        loginLink.click();
    }
}
