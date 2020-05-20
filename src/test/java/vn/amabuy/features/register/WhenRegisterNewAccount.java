package vn.amabuy.features.register;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.features.models.Account;
import vn.amabuy.steps.serenity.HomeSteps;
import vn.amabuy.steps.serenity.LoginSteps;
import vn.amabuy.steps.serenity.RegisterSteps;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class WhenRegisterNewAccount {
    @Managed
    WebDriver driver;
    @Steps
    HomeSteps homeSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    RegisterSteps registerSteps;
    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[] []
                {
                        {"Minh Minh","minh@gmail.com","12345689","123456"},
                        {"MaiDao","mai@gmail.com","012345","0123"}
                }
        );
    }


    //Data driven test
    private String fullName;
    private String email;
    private String password;
    private String rePassword;
    public WhenRegisterNewAccount (String fullName, String email, String password,String rePassword){
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.rePassword=rePassword;
    }

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
        //System.out.println(fullName);
    }


}
