package vn.amabuy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.Fluent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends PageObject {

    @FindBy(id = "nav-link-accountList")
    WebElementFacade loginLink ;

    //Lesson 22
    @FindBy(xpath = "//input[@type='search']") WebElementFacade MultiSelect2;

    public void clickOnLoginLink(){
        loginLink.click();
        //loginLink.waitUntilClickable().click(); //Explicit Wait//Lay tham so ben serenity.properties
        //Fluent Wait
        /*
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(7))
                .pollingEvery(Duration.ofSeconds(6))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        */
    }

    public void selectMultiState(String[] states) {
        for (String state:states
             ) {
            MultiSelect2.waitUntilPresent().typeAndEnter(state);
        }
    }
}
