package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.HomePage;

public class HomeSteps {
    HomePage onHomepage;
    @Step
    public void vitsit_application(){
        onHomepage.open();
    }

}
