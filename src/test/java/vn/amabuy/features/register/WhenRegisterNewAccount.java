package vn.amabuy.features.register;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.features.models.Account;
import vn.amabuy.steps.serenity.HomeSteps;
import vn.amabuy.steps.serenity.LoginSteps;
import vn.amabuy.steps.serenity.RegisterSteps;

@RunWith(SerenityRunner.class)
public class WhenRegisterNewAccount {
    @Managed
    WebDriver driver;
    @Steps
    HomeSteps homeSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    RegisterSteps registerSteps;

    Account accountInfo = new Account("Minh Minh","minh@gmail.com","123456789","123456");
    String errMsg ="Passwords must match";
    @Test
    public void register_new_account_with_incorrect_password(){

        homeSteps.visit_application();
        homeSteps.click_on_login_link();
        loginSteps.click_on_register_link();
        registerSteps.register_new_account(accountInfo);
        registerSteps.should_see_warning_error_message(errMsg);
    }

}
