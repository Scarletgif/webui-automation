package vn.amabuy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"createAccountSubmit\"]")
    WebElementFacade registerLink;

    public void clickonRegisterLink(){
        registerLink.click();
    }


}