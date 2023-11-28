package com.appollo247.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LabTestsPage extends BasePage
{
	
	public LabTestsPage(WebDriver driver) throws InterruptedException {
		super(driver);
	}

	@FindBy(xpath="//*[@id='__next']//input")
	WebElement searchBar;
	
	@FindBy(xpath="(//div[@class='FH GH']/h6)[1]")
	WebElement liverTestFunction;
	
	@FindBy(xpath="(//div[@class='FH GH']/h6)[1]")
	WebElement vitaminB12;
	
	@FindBy(xpath="//a[@href='/lab-tests/complete-blood-count-cbc?source=Popular_search']")
	WebElement completeBloodCount;
	
	@FindBy(xpath="//a[@class='ViewAllDetails_viewAllText__Sqf9S' and @title='Vital Organs - View All']")
	WebElement viewAll;
	
	@FindBy(xpath="//div[@id=\"mainContainerCT\"]/div[3]/div[2]/div[2]/div[2]/a/div/div[2]/p")
	WebElement heart;
	
	public void clickSearchBar(WebDriver driver) {
		this.driver= driver;
		driver.switchTo().defaultContent();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", searchBar);
//		searchBar.click();
	}
	public void clickLiverTestFunction() {
		liverTestFunction.click();
	}
	
	public void clickVitaminB12() {
		vitaminB12.click();
	}
	public void clickCompleteBloodCount() {
		completeBloodCount.click();
	}
//	public void clickViewAll() {
//		viewAll.click();
//	}
	public void clickViewAll(){
		Actions action = new Actions(driver);
		action.moveToElement(viewAll).click().build().perform();
	}
	
	public void clickHeart() {
		heart.click();
	}
}
