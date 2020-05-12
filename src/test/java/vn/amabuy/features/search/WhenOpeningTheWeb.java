package vn.amabuy.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
public class WhenOpeningTheWeb {

    @Managed
    WebDriver driver;

    @Steps
    HomeSteps scarletGif;

    @Test
    public void visit_app(){
        scarletGif.visit_application();
    }
    @Test
    public void redirect_register(){
        scarletGif.redirect_register_onloginpage();
    }

    /*
    public void create_account(){
     //   Scarletgif.create_account("Minh Minh", "minh@gmail.com","12345689","12345689");
        scarletGif.visit_application();
        scarletGif.redirect_register_onloginpage();
        scarletGif.enter_account_info("Minh Minh", "minh@gmail.com","12345689","12345689");
    }
    */

}
