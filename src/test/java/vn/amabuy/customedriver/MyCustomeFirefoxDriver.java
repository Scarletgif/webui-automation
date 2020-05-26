package vn.amabuy.customedriver;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class MyCustomeFirefoxDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {

            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.startup.homepage", "http://www.google.com");
            profile.setPreference("browser.private browsing.autostart", true);

            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);
            capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

            FirefoxOptions options = new FirefoxOptions(capabilities);
            /*
            options.addArguments("--headless");
            options.addArguments("--width=800");
            options.addArguments("--height=800");
            options.addArguments("-private");
            */
            return new FirefoxDriver(options);

    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
