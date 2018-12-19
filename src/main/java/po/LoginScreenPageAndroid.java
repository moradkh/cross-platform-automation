package po;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.util.concurrent.TimeUnit;

public class LoginScreenPageAndroid extends LoginScreenPageObject{


    @AndroidFindBy(id = "Login")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
    MobileElement login;
    AndroidDriver _driver;


    public LoginScreenPageAndroid(AppiumDriver driver) {
        super(driver);
        _driver = (AndroidDriver) driver;
    }

    public void clickOnLogin()
    {
        System.out.println("I WILL CLICK ON LOGIN FROM ANDROID");
        login.click();

//        _driver.findElementByAndroidUIAutomator("");
    }


}
