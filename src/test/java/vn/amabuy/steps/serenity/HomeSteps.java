package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.HomePage;
import vn.amabuy.pages.LoginPage;
import vn.amabuy.pages.RegisterPage;

public class HomeSteps {
    HomePage onHomepage;
    LoginPage onLoginpage;
    RegisterPage onRegisterpage;
    @Step
    public void visit_application(){
        onHomepage.open();
        onHomepage.clickonLoginLink();
    }
    @Step
    public void redirect_register_onloginpage(){
        onLoginpage.clickonRegisterLink();
    }
    @Step
    public void enter_account_info(String yourName, String email, String password, String checkPassword){
        onRegisterpage.enterTextIntoYourName(yourName);
        onRegisterpage.enterTextIntoEmail(email);
        onRegisterpage.enterTextIntoPassword(password);
        onRegisterpage.enterTextIntoCheckPassword(checkPassword);
    }
    @Step
    public void create_account(String yourName, String email, String password, String checkPassword){
        visit_application();
        redirect_register_onloginpage();
        enter_account_info(yourName, email, password, checkPassword);

    }

}
