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
		
		@FindBy(xpath="//h6[text()='Liver Function Test (LFT)']")
		WebElement liverTestFunction;
		
		@FindBy(xpath="//h6[text()='Vitamin B12']")
		WebElement vitaminB12;
		
		@FindBy(xpath="//a[@href='/lab-tests/complete-blood-count-cbc?source=Popular_search']")
		WebElement completeBloodCount;
		
		@FindBy(xpath="//a[@title='Vital Organs - View All' and text()='View All']")
		WebElement viewAll;
		
		@FindBy(xpath="//*[@id=\"mainContainerCT\"]/div[3]/div[2]/div[2]/div[2]")
		WebElement heart;
		
		@FindBy(xpath="//div[@id='__next']//p[text()='Cholesterol - Serum']")
		WebElement cholestrolSerum;
		
		@FindBy(xpath="//span[text()='Add To Cart']")
		WebElement addToCart;
		
		@FindBy(xpath="//span[text()='Proceed to cart']")
		WebElement proceedToCart;
		
		public void clickSearchBar() {
//			this.driver= driver;
//			driver.switchTo().defaultContent();
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", searchBar);
			searchBar.click();
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
//		public void clickViewAll() {
//			viewAll.click();
//		}

		public void clickViewAll() throws InterruptedException {
			Actions action = new Actions(driver);
			Thread.sleep(1000);
			action.moveToElement(viewAll).click().build().perform();
			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//	    	js.executeScript("arguments[0].scrollIntoView();",viewAll );
//	    	viewAll.click();
		}
//		@FindBy(className="wrapper-container")
//		WebElement frame1;
	//	
//		@FindBy(xpath="//span[@class='close']")
//		WebElement closeFreame;
	//	
//		public void frameSwitch_close() {
//			driver.switchTo().frame(frame1);
//			closeFreame.click();
//		}
		
		public void clickHeart() {
			heart.click();
		}
		
		public void clickCholestrolSerum() {
		 cholestrolSerum.click();
		}
		
		public void clickAddToCart() {
			addToCart.click();
		}
		
		public void clickProceedToCart() {
			proceedToCart.click();
		}
}



