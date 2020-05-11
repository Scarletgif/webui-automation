package vn.amabuy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
    private static final String INPUT_TYPE_EMAIL="//*[@id=\"ap_email\"]";
    private static final String INPUT_TYPE_PASSWORD="//*[@id=\"ap_password\"]";
    private static final String INPUT_TYPE_CHECKPASSWORD="//*[@id=\"ap_password_check\"]";
    private static final String LABEL_PASSWORD="//*[@id=\"ap_register_form\"]/div/div/div[3]/div[1]/label/following-sibling::input";
    @FindBy(xpath = "//*[@id=\"ap_customer_name\"]")
    WebElementFacade yourNamefield;
    public void enterTextIntoYourName(String yourName){
        yourNamefield.type(yourName);
    }

    public void enterTextIntoEmail (String email){
        $(INPUT_TYPE_EMAIL).type(email);
    }

    public void enterTextIntoPassword(String password){
        element(LABEL_PASSWORD).type(password);
    }
    public void enterTextIntoCheckPassword(String password){
        $(INPUT_TYPE_CHECKPASSWORD).type(password);
    }
}
