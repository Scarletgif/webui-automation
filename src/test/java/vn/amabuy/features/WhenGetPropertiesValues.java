package vn.amabuy.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.features.properties.MyProperties;

@RunWith(SerenityRunner.class)
public class WhenGetPropertiesValues {

    private EnvironmentVariables environments;
  @Test
    public void get_properties_value_from_serenity_config_test(){
        String myProperties = environments.optionalProperty(MyProperties.WebDriver).orElse("lala");
        System.out.println(myProperties);


  }


}
