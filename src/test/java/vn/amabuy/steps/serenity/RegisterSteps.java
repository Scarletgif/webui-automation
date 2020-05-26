package vn.amabuy.steps.serenity;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.RegisterPage;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;
import org.openqa.selenium.support.ui.FluentWait;
import vn.amabuy.features.models.Account;


public class RegisterSteps {
    RegisterPage onRegisterPage;
    @Step
    public void register_new_account(Account accountInfo){
        Serenity.setSessionVariable("Fullname").to(accountInfo.getFullname());
        Serenity.setSessionVariable("Email").to(accountInfo.getEmail());
        enter_your_name(accountInfo.getFullname());
        enter_email(accountInfo.getEmail());
        enter_password(accountInfo.getPassword());
        enter_confirm_password(accountInfo.getRePassword());
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
        //assertThat(expectedErrMsg, equalTo(actualErMsg));
        assertThat(actualErMsg).isEqualTo(expectedErrMsg);
        
    }
}
