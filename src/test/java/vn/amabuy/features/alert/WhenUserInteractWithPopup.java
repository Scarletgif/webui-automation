package vn.amabuy.features.alert;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.steps.AlertStep;
import vn.amabuy.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
@WithTags(
        @WithTag("Popup")
)
public class WhenUserInteractWithPopup {

    @Managed
    WebDriver driver;

    @Steps
    HomeSteps scarletGift;
    @Steps
    AlertStep alertStep;
    @Test
    public void when_answer_prompt(){
        scarletGift.visit_application();
        alertStep.answer_prompt("Serenity online courser");
      //  alertStep.accept_alert_prompt();
    }


}
