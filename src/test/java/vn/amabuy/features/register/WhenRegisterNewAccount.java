
package vn.amabuy.features.register;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
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

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SerenityRunner.class)
//@UseTestDataFrom("src/test/resources/registernewaccount_testdata1.csv")
@WithTags(
        {
                @WithTag("parallel"),
                @WithTag("sessionvariable")
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


   Account accountInfo = Account.named("Minh Minh")
           .withEmail("minh@gmail.com")
           .withPassword("12345689")
           .withRePassword("123456")
           .build();

    //Account accountInfo;
    //Account info=Account.

    String errMsg ="Passwords must match";
    @Test
    public void register_new_account_with_incorrect_password(){
        
        homeSteps.visit_application();
        homeSteps.click_on_login_link();
        loginSteps.click_on_register_link();
        registerSteps.register_new_account(accountInfo);
        registerSteps.should_see_warning_error_message(errMsg);


    }
    @Test
    public void verify_fullname_session_variable(){
        assertThat("Minh Minh").isEqualTo(Serenity.sessionVariableCalled("Fullname"));
    }
    @Test
    public void verify_email_session_variable(){

        assertThat("minh@gmail.com").isEqualTo(Serenity.sessionVariableCalled("Email"));
    }

}