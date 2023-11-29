package com.appollo247.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) throws InterruptedException {
		super(driver);
	}

	@FindBy(name="mobileNumber")
	WebElement mobileNumberInput;
	
	@FindBy(className="SignIn_action__QuU_k")
	WebElement arrow;
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input']")
	WebElement otpInput;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiFab-root MuiFab-primary']")
	WebElement submit;
	
	public void enterMobileNumber() {
		mobileNumberInput.sendKeys("9502614670");
	}
	
	public void clickNext() {
		arrow.click();
	}
	public void clickOtpInput()	{
		otpInput.click();
	}
	public void clickSubmit()	{
		submit.click();
	}
}
