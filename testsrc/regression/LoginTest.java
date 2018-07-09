package regression;

import com.oxycaterers.pages.Login;
import com.oxycaterers.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class LoginTest
{
    WebDriver driver= Driver.getDriver(Driver.DriverTypes.CHROME);

    @Test
    public void logintest()
    {
        ResourceBundle dbDetails = ResourceBundle.getBundle("OxyCaterers");
        String url=dbDetails.getString("url");

        driver.get(url);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


        Login login=new Login(driver);

        login.setTxtUserName("sara");
        login.setTxtPassword("Admin@123");
        login.clickLogin();


    }
}