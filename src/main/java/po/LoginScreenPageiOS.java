package po;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.util.concurrent.TimeUnit;

public class LoginScreenPageiOS extends LoginScreenPageObject {

    @iOSFindBy(accessibility = "Log In")
    @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
    MobileElement login;
    IOSDriver _driver;

    public LoginScreenPageiOS(AppiumDriver driver) {
        super(driver);
        _driver = (IOSDriver) driver;
    }


    public void clickOnLogin() {
        System.out.println("I WILL CLICK ON LOGIN FROM IOS");
        login.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
