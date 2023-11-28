package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appollo247.pages.BasePage;
import com.appollo247.pages.HomePage;
import com.appollo247.pages.LabTestsPage;
import com.appollo247.pages.LoginPage;
import com.demo.Apollo247.DriverSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LabTestsStepDefinition 
{
	WebDriver driver;
	WebDriverWait wait;
	HomePage homePage;
	LoginPage loginPage;
	LabTestsPage labTestPage;
	
//	BasePage basePage=new BasePage(driver);
	
	@Given("user is on the Apollo App Login Screen")
	public void user_is_on_the_apollo_app_login_screen() throws InterruptedException {
		DriverSetup driverSetup = new DriverSetup("chrome");
        driver = driverSetup.initDriver();
        driver.get("https://www.apollo247.com/");
//		homePage.maximizeWindow();		 
//		basePage.implicitWait();		 
       
        driver.manage().window().maximize();      
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
        homePage=new HomePage(driver);
		homePage.clickProfile();
	}

	@When("user enters a valid mobile number and OTP")
	public void user_enters_a_valid_mobile_number_and_otp() throws InterruptedException {
		loginPage=new  LoginPage(driver);
	    loginPage.enterMobileNumber();
	    loginPage.clickNext();
	    loginPage.clickOtpInput();
//	    Thread.sleep(10000);
        homePage.forceWait();
	}
	

	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		loginPage.clickSubmit();
	}

	@When("user is logged in and clicks on lab tests")
	public void user_is_logged_in_and_clicks_on_lab_tests() {
		homePage.clickLabTestsModule();
	}

	@Then("user is on lab tests page")
	public void user_is_on_lab_tests_page() {
	    System.out.println("user is on lab tests page");
	}

//	@Given("user clicks on search bar and enters labTests {string}")
//	public void user_clicks_on_search_bar_and_enters_lab_tests(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user clicks on that particular Test")
//	public void user_clicks_on_that_particular_test() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("user is redirected to that test page and sees product details")
//	public void user_is_redirected_to_that_test_page_and_sees_product_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Given("user clicks on search bar and selects one popular test")
	public void user_clicks_on_search_bar_and_selects_one_popular_test() {
//		DriverSetup driverSetup = new DriverSetup("chrome");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//      driver = driverSetup.initDriver();
        driver.get("https://www.apollo247.com/lab-tests");		 
       
//      driver.manage().window().maximize();      
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement element=driver.findElement(By.xpath("//*[@id='__next']//input]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
//		labTestPage.clickSearchBar(driver);
	}

	@When("user clicks on complete blood count")
	public void user_clicks_on_complete_blood_count() {
		labTestPage.clickCompleteBloodCount();
	}

	@Then("user is user is on complete blood count page")
	public void user_is_user_is_on_complete_blood_count_page() {
		System.out.println("user is user is on complete blood count page");
	}

	@Given("user clicks on viewAll of vital organs and selects Heart")
	public void user_clicks_on_view_all_of_vital_organs_and_selects_heart() {
//		labTestPage.clickViewAll();
//		labTestPage.clickHeart();
	}

	@When("user is able to click on Cholestrol serum")
	public void user_is_able_to_click_on_cholestrol_serum() {
		System.out.println("click on Cholestrol serum");
	}

	@When("user clicks on add to cart button1")
	public void user_clicks_on_add_to_cart_button1() {
		System.out.println("add to cart");
	}

	@When("user clicks on proceed to cart button")
	public void user_clicks_on_proceed_to_cart_button() {
		System.out.println("proceed to cart button");
	}

	@Then("user is on cart page and an item is present in the cart")
	public void user_is_on_cart_page_and_an_item_is_present_in_the_cart() {
		System.out.println("item is present in the cart");
	}

//	@Given("user clicks on view all of top booked tests")
//	public void user_clicks_on_view_all_of_top_booked_tests() {
//		System.out.println("1");
//	}
//
//	@When("user clicks add button of a labTest")
//	public void user_clicks_add_button_of_a_lab_test(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//		System.out.println("1");
//	}
//
//	@When("user clicks on top cart button")
//	public void user_clicks_on_top_cart_button() {
//		System.out.println("1");
//	}
//
//	@Then("user remove the test from cart")
//	public void user_remove_the_test_from_cart() {
//		System.out.println("1");
//	}
//
//	@Given("User clicks on search lab tests bar")
//	public void user_clicks_on_search_lab_tests_bar() {
//		System.out.println("1");
//	}
//
//	@When("user is able to search the invalid labtest")
//	public void user_is_able_to_search_the_invalid_labtest() {
//		System.out.println("1");
//	}
//
//	@Then("user should not be able to see the lab test")
//	public void user_should_not_be_able_to_see_the_lab_test() {
//		System.out.println("1");
//	}
//	

}