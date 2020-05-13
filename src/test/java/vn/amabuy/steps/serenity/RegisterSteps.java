package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.RegisterPage;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class RegisterSteps {
    RegisterPage onRegisterPage;
    @Step
    public void register_new_account(String yourName, String email, String password, String checkPassword){
        enter_your_name(yourName);
        enter_email(email);
        enter_password(password);
        enter_confirm_password(checkPassword);
        click_on_register_button();
    }

    @Step
    public void click_on_register_button() {
        onRegisterPage.clickOnRegisterButton();
    }

    @Step
    public void enter_confirm_password(String checkPassword) {
        onRegisterPage.enterTextIntoCheckPassword(checkPassword);
    }

    @Step
    public void enter_password(String password) {
        onRegisterPage.enterTextIntoPassword(password);
    }
    @Step
    public void enter_email(String email) {
        onRegisterPage.enterTextIntoEmail(email);
    }

    @Step
    public void enter_your_name(String yourName) {
        onRegisterPage.enterTextIntoYourName(yourName);
    }
    @Step
    public void should_see_warning_error_message(String expectedErrMsg) {
        String actualErMsg =onRegisterPage.getWarningErrMsg();
        //assertEquals(expectedErrMsg,actualErMsg);
        assertThat(expectedErrMsg, equalTo(actualErMsg));
    }
}
