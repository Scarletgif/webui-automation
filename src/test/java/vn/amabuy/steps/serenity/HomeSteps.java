package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.HomePage;
import vn.amabuy.pages.LoginPage;
import vn.amabuy.pages.RegisterPage;

public class HomeSteps {
    HomePage onHomePage;

    @Step
    public void visit_application(){
        onHomePage.open();
    }
    @Step
    public void click_on_login_link(){
        onHomePage.clickOnLoginLink();
    }

}
