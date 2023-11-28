package com.demo.Apollo247;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dummy {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollo247.com/lab-tests");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement viewAll=driver.findElement(By.xpath("//a[@class='ViewAllDetails_viewAllText__Sqf9S' and @title='Vital Organs - View All']"));
		Actions action = new Actions(driver);
		action.moveToElement(viewAll).click().build().perform();
		Thread.sleep(2000);
		driver.close();

	}

}
