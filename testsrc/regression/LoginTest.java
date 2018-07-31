package regression;

import com.oxycaterers.pages.Login;
import com.oxycaterers.utilities.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.NetworkMode;
import javafx.scene.layout.Priority;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class LoginTest
{
    WebDriver driver= Driver.getDriver(Driver.DriverTypes.CHROME);
    ExtentReports extent;


    @BeforeClass
    public void login() {

        extent = new ExtentReports("Report/report.html", false, NetworkMode.OFFLINE);

        ResourceBundle dbDetails = ResourceBundle.getBundle("OxyCaterers");
        String url=dbDetails.getString("url");

        driver.get(url);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


    }

    @AfterClass
    public void after()
    {

        extent.flush();
    }



   /* @Test(priority = 1)
    public void logintest()
    {

        Login login=new Login(driver);

        login.setTxtUserName("sara");
        login.setTxtPassword("Admin@123");
        login.clickLogin();

        String expected="Dashboard";
        String actual="";


        try
        {
            actual= driver.findElement(By.xpath("//b[text()='Dashboard']")).getText();
        }
        catch (Exception e)
        {
            actual="";

        }

        Assert.assertEquals("Test is failed",expected,actual);


    }*/


    @Test(priority = 2)
    public void BothFIledsBlank()
    {
        Login login=new Login(driver);

        login.setTxtUserName("");
        login.setTxtPassword("");
        login.clickLogin();

        String expected="submit";
        String actual="";

        try
        {
            actual= driver.findElement(By.xpath("//*[@id='login']/div[4]/input")).getText();
        }
        catch (Exception e)
        {
            actual="";

        }

        Assert.assertEquals("Test is failed",expected,actual);


    }
}