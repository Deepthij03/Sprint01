package com.appollo247.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver) throws InterruptedException 
	{
		super(driver);
	}
	@FindBy(xpath="//span[@class='icon-ic_account']")
	WebElement profile;
	@FindBy(xpath="(//a[@href='/lab-tests'])[2]")
	WebElement labTestsModule;

	public void clickProfile() 
	 {
	 	profile.click();
	 }
	 public void clickLabTestsModule() 
	 {
		 labTestsModule.click();
	 }

}
