package vn.amabuy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
    private static final String YOUR_NAME_FIELD = "Your name";
    private static final String EMAIL_FIELD="Email";
    private static final String PASSWORD_FIELD="Password";
    private static final String CONFIRM_PASS_FIELD="Password";


    public void enterTextIntoYourName(String yourName){
        element(Target.of(YOUR_NAME_FIELD)).type(yourName);
    }

    public void enterTextIntoEmail (String email){
        element(Target.of(EMAIL_FIELD)).type(email);
    }

    public void enterTextIntoPassword(String password){

        element(Target.of(PASSWORD_FIELD)).type(password);
    }
    public void enterTextIntoCheckPassword(String password){
        element(Target.of(CONFIRM_PASS_FIELD)).type(password);
    }

    static class Target{
        private static final String TARGET = "//label[contains(text(),'%s')]/following-sibling::input";
        public static String of (String label){
            return String.format(TARGET,label);
        }
    }
}
