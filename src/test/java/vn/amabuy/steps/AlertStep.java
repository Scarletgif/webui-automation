package vn.amabuy.steps;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.AlertPage;

public class AlertStep {
    AlertPage onAlertPage;

    @Step
    public void answer_prompt(String answer) {
        onAlertPage.answerPrompt(answer);

    }
    @Step
    public void accept_alert_prompt() {
        onAlertPage.acceptAlertPrompt();
    }
    @Step
    public void cancel_alert_prompt(){
        onAlertPage.cancelAlertPrompt();
    }
}
