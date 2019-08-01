package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.base.Verify;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDo {
	
	public static WebDriver driver; 
	public static String aa;
	public static String currentWindowHandle;
	
	@SuppressWarnings("null")
	@Before
	public void setup() {
		ChromeOptions options = new ChromeOptions();

		List<String> arguments = new ArrayList<String>();
		arguments.add("start-maximised");
		arguments.add("disable-infobars");
		options.addArguments(arguments);
		driver = new ChromeDriver(options);
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
	
	
	@When("^I navigate to \"([^\"]*)\" website$")
	public void i_navigate_to_website(String arg1) throws Throwable {
	    
	    //driver.manage().window().maximize();
	    driver.get(arg1);
	}
	
	@SuppressWarnings("deprecation")
	@When("^I navigate to \"([^\"]*)\" website using firefox$")
	public void i_navigate_to_website_using_firefox(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\eclipse\\DRIVERS\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get(arg1);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void iclick_on_button(String arg1) throws Throwable {
		System.out.println(driver.findElement(By.xpath(arg1)).getCssValue("background-color"));
	    driver.findElement(By.xpath(arg1)).sendKeys("jjjjjj");
	    driver.findElement(By.xpath(arg1)).click();
	}

	@Then("^I capture the text in Alert box and pass to next step$")
	public void icapture_the_text_in_Alert_box_and_pass_to_next_step() throws Throwable {
	    aa = driver.switchTo().alert().getText();
	}

	@Then("^I preint the previous text in console window$")
	public void i_preint_the_previous_text_in_console_window() throws Throwable {
	    System.out.println(aa);
	}

	@Then("^I dismiss the alert$")
	public void i_dismiss_the_alert() throws Throwable {
		Thread.sleep(5000); 
		driver.switchTo().alert().dismiss();
	    driver.close();
	}
	
	@Then("^I store the windowhandler in static variable$")
	public void store_current_window_handle() throws Throwable {
		currentWindowHandle = driver.getWindowHandle();
		System.out.println("home page windwH "+currentWindowHandle);
	}
	
	@Then("^I navigate to a iframe containing element \"([^\"]*)\"$")
	public void nvigate_to_iframe(String aaa) throws Throwable {
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/iframe"));
		driver.switchTo().frame(elem);
		System.out.println(driver.findElement(By.xpath("//a[@title='JavaScript Tutorial']")).getText());
	}
	
	@Then("^I navigate back to previous window and close it$")
	public void get_all_handles() throws InterruptedException {
		Set whs = driver.getWindowHandles();
		System.out.println(whs);
		
		Iterator ite = whs.iterator();
		
		System.out.println(currentWindowHandle);
		String hh = null;
		while(ite.hasNext()) {
			hh=ite.next().toString();
			if((ite.next().toString()).contains(currentWindowHandle)) {
				driver.switchTo().window(hh);
			}
		}
		
//		for (String handle1 : driver.getWindowHandles()) {
//			 
//	          if(handle1.equalsIgnoreCase(currentWindowHandle)) {
//	        	  driver.switchTo().window(handle1);  
//	          }
//	               
//		}
		
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandle());
		driver.close();
	}

}
