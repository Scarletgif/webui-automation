package vn.amabuy;

import com.google.common.base.Predicate;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import java.time.Clock;

public class MyPageObject extends PageObject {
    protected MyPageObject() {
       super();
    }

    protected MyPageObject(final WebDriver driver, Predicate<? super PageObject> callback) {
        super(driver,callback);
    }

    public MyPageObject(final WebDriver driver, final int ajaxTimeout) {
        super(driver,ajaxTimeout);
    }

    public MyPageObject(final WebDriver driver) {
       super(driver);
    }

    public MyPageObject(final WebDriver driver, final EnvironmentVariables environmentVariables) {
        super(driver,environmentVariables);
    }

}
