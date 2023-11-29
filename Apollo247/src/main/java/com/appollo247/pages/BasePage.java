package com.appollo247.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	   public WebDriver driver;
	   
	    public BasePage(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void implicitWait() 
	    {
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }
	    
	    public void forceWait() throws InterruptedException {
	    	Thread.sleep(10000);
	    }

	    public void maximizeWindow() 
	    {
	    driver.manage().window().maximize();
	    }
}
