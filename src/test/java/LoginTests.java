import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import po.LoginScreenPageAndroid;
import po.LoginScreenPageObject;
import po.LoginScreenPageiOS;
import po.Utils;

public class LoginTests {
    private AppiumDriver<?> driver;


    @Before
    public void setUp() throws Exception {
        driver = Utils.returnDriver(Utils.readProperty("run.platform"));
        AndroidDriver d;
    }


    @After
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void loginTestAndroid() {
        LoginScreenPageObject loginScreenPageObject = new LoginScreenPageAndroid(driver);
        loginScreenPageObject.setUsername();
        loginScreenPageObject.setPassword();
        loginScreenPageObject.clickOnLogin();

    }

    @Test
    public void loginTestiOS() {
        LoginScreenPageObject loginScreenPageObject = new LoginScreenPageiOS(driver);
        loginScreenPageObject.setUsername();
        loginScreenPageObject.setPassword();
        loginScreenPageObject.clickOnLogin();
    }
}
