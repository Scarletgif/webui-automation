package vn.amabuy.features.browser;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
@WithTags(
        {
          @WithTag("parallel"),
          @WithTag("Opening")
        }
)

public class WhenOpeningTheWeb {

    @Managed
    WebDriver driver;

    @Steps
    HomeSteps scarletGif;

    @Test
    public void create_account(){
        scarletGif.visit_application();
        //scarletGif.select_states("Alaska");
    }


}
