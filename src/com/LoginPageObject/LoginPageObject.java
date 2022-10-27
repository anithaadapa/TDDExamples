package com.LoginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
WebDriver driver;
    
    @FindBy(id="username")
    public static WebElement userid;
    
    @FindBy(name="password")
    public static WebElement password;
    
    @FindBy(id="submit")
    public static WebElement submit;
    
    
    public  LoginPageObject(WebDriver driver)
    {
        this.driver = driver;
        
        PageFactory.initElements(driver, this);
    }


	
	
}
