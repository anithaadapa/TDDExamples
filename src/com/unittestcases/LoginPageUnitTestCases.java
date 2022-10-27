package com.unittestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginPageUnitTestCases {
	@FindBy (id="username")
    public static WebElement userid;
    
    @FindBy(name="password")
    public static WebElement password;
    
    @FindBy(id="submit")
    public static WebElement submit;
    
    public static WebDriver driver;
    
    @BeforeClass
    
    public void OpenBrowser()
    {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.get("D:\\SimpliLearn\\Automation Test Engineer\\Phase 2\\WebContent\\Login.html");
        
    }
    
    
    
    
    
    @AfterClass
    
    public void CloseBrowser()
    {
        driver.close();
    }


	
	
}
