package main;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import codes.Coding;
import codes.Locators;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDefinations {

	public WebDriver driver;
	Coding aa =new Coding();
	Locators ll = new Locators();
	public static String propfilepath = "src/test/java/main/Properties.json";
	
	WebDriverWait wait = new WebDriverWait(driver,10);  


	@Given("^I navigate to the url \"([^\"]*)\"$")
	public void i_navigate_to_the_url(String webLink) throws Throwable {
		System.setProperty("WebDriver.Chrome.driver", "C:\\eclipse\\DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get(aa.searchforLink(driver,webLink));
		driver.get("https://www.zoopla.co.uk/");
	}

	@When("^I enter text \"([^\"]*)\" in textbox \"([^\"]*)\" for \"([^\"]*)\"$")
	public void i_enter_text_in_textbox_on_page_for(String textforWebElement, String webElementLink, String userstory) throws Throwable {
		//WebElement ele = ll.getLocator(driver,textforWebElement);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='search-input-location-wrapper']/span/span[text()='e.g. Oxford, NW3 or Waterloo Station']")));
		//driver.findElement(By.xpath("//div[@id='search-input-location-wrapper']/span/span[text()='e.g. Oxford, NW3 or Waterloo Station']")).sendKeys(textforWebElement);
		ele.sendKeys("London");
 	}

	@When("^I click on \"([^\"]*)\" for \"([^\"]*)\"$")
	public void i_click_on_on_page_for(String arg1, String arg2, String arg3) throws Throwable {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//div[@id='search-input-location-wrapper']/span/span[text()='e.g. Oxford, NW3 or Waterloo Station']"));
			}
		});

		driver.close();
	}



}
