package vn.amabuy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.collections.functors.NonePredicate;
import org.apache.commons.collections.functors.TruePredicate;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import vn.amabuy.MyPageObject;

public class AlertPage extends PageObject {


    public void answerPrompt(String answer) {
       getDriver().switchTo().frame("iframeResult");
        $("//button[.='Try it']").click();
         waitABit(10000);
       //   getAlert().sendKeys(answer);
    }

    public void acceptAlertPrompt() {
        getAlert().accept();
    }

    public void cancelAlertPrompt() {
        getAlert().dismiss();
    }

    public void waitForAlert(){
        new WebDriverWait(getDriver(),60)
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());
    }
}
