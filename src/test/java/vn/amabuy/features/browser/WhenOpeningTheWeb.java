package vn.amabuy.features.browser;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.steps.serenity.HomeSteps;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
@WithTags(
        {
          @WithTag("parallel"),
          @WithTag("sessionvariable")
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
    @Test
    public void verify_email_session_variable(){
        assertThat("minh@gmail.com").isEqualTo(Serenity.sessionVariableCalled("Email"));
    }


}
