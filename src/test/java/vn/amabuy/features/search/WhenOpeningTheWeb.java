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
    HomeSteps Scarletgif;

    @Test
    public void create_account(){
        Scarletgif.create_account("Minh Minh", "minh@gmail.com","12345689","12345689");
    }

}
