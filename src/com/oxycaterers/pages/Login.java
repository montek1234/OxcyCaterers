package com.oxycaterers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
    WebDriver driver;

    @FindBy(xpath = "//input[@name='user_username']")
    public WebElement txtUserName;
    //WebElement txtemail = driver.findElement(By.name("email"));  //This is equivalent to above two statement

    @FindBy(xpath = "//input[@name='user_password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement btnLogin;

    public Login(WebDriver driver)
    {
       this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void setTxtUserName(String userName)
    {
        txtUserName.sendKeys(userName);
    }


    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }


    public void clickLogin()
    {
        btnLogin.click();
    }


   /* @FindBy(xpath = "//h1[text()='Login']")
    public WebElement lblLogin;



    @FindBy(xpath = "//label[text()='Email']")
    public WebElement lblEmail;


    @FindBy(xpath = "//label[text()='Password']")
    public WebElement lblPassword;


    @FindBy(xpath = "//a[contains(text(),'I forgot')]")
    public WebElement btnForgotPassword;*/
}