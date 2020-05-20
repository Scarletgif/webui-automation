package vn.amabuy.features.register;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.features.models.Account;
import vn.amabuy.steps.serenity.HomeSteps;
import vn.amabuy.steps.serenity.LoginSteps;
import vn.amabuy.steps.serenity.RegisterSteps;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/registernewaccount_testdata1.csv,src/test/resources/registernewaccount_testdata2.csv")
@WithTags(
        {
                @WithTag("parallel"),
                @WithTag("register")
        }
)
public class WhenRegisterNewAccount {
    @Managed
    WebDriver driver;
    @Steps
    HomeSteps homeSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    RegisterSteps registerSteps;

    //Data driven test
    private String fullName;
    private String email;
    private String password;
    private String rePassword;

    //Account accountInfo = new Account("Minh Minh","minh@gmail.com","123456789","123456");
    Account accountInfo;

    String errMsg ="Passwords must match";
    @Test
    public void register_new_account_with_incorrect_password(){

        accountInfo=new Account (fullName,email,password,rePassword);
        homeSteps.visit_application();
        homeSteps.click_on_login_link();
        loginSteps.click_on_register_link();
        registerSteps.register_new_account(accountInfo);
        registerSteps.should_see_warning_error_message(errMsg);


    }

}