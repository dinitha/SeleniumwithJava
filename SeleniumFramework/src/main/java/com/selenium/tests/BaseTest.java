package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver;
	 
    @BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.
    	System.setProperty("webdriver.gecko.driver", "C:\\chromedriver\\geckodriver.exe");
        driver = new FirefoxDriver();
 
        //Maximize Window
        driver.manage().window().maximize();
    }
 
    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
