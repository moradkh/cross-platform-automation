package po;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.concurrent.TimeUnit;


public abstract  class LoginScreenPageObject extends BasePage{


    @AndroidFindBy(id = "Username")
    @iOSFindBy(accessibility = "Username")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
    MobileElement username;

    @AndroidFindBy(id = "Password")
    @iOSFindBy(accessibility = "Password")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
    MobileElement password;



    public LoginScreenPageObject(AppiumDriver<?> driver) {
        super(driver);
    }


    public void setUsername()
    {
        username.sendKeys("AnyUser");
    }
    
    public void setPassword()
    {
        password.sendKeys("AnyPassword");
    }

    public abstract void clickOnLogin();
}
