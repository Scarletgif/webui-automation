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
    public void launch_web_application(){
        Scarletgif.vitsit_application();
    }
}
