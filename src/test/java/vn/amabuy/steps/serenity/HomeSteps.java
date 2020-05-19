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
    @Step
    public void select_state(String... states) {
        onHomePage.selectMultiState(states);
    }
    @Step
    public void select_states(String... states){
        visit_application();
        select_state(states);
    }
}
