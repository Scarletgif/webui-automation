package vn.amabuy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    @FindBy(id="ap_customer_name")    WebElementFacade yourNameField;
    @FindBy (id="ap_email")    WebElementFacade emailField;
    @FindBy (id="ap_password")    WebElementFacade passwordField;
    @FindBy(id="ap_password_check")    WebElementFacade checkPasswordField;
    @FindBy(id = "auth-password-mismatch-alert")    WebElementFacade passwordMismatchField ;
    @FindBy(id = "continue")    WebElementFacade continueField ;

    public void enterTextIntoYourName(String yourName){
        $(yourNameField).type(yourName);
    }

    public void enterTextIntoEmail (String email){
        $(emailField).type(email);
    }

    public void enterTextIntoPassword(String password){

        $(passwordField).type(password);
    }
    public void enterTextIntoCheckPassword(String password){
        $(checkPasswordField).type(password);
    }

    public String getWarningErrMegs() {
        return $(passwordMismatchField).getText();
    }

    public void clickOnRegisterButton() {
        $(continueField).click();
    }

    static class Target{
        private static final String TARGET = "//label[contains(text(),'%s')]/following-sibling::input";
        public static String of (String label){
            return String.format(TARGET,label);
        }
    }
}
