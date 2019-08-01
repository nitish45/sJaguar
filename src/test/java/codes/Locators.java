package codes;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	
	public List<String> locators = new ArrayList<String>();		
			
	public WebElement getLocator(WebDriver driver,String weblink) {		
		
		return driver.findElement(By.xpath(getWebElement(weblink)));
	}
	
	public String getWebElement(String text) {
		
		String temp = null;
		locators.add("searchPlace://div[@id='search-input-location-wrapper']/span/span[text()='e.g. Oxford, NW3 or Waterloo Station']");
		System.out.println(locators);
		Iterator<String> ite = locators.iterator();
		while(ite.hasNext()) {
			if(ite.next().contains(text)) {
				String xpathExpression[] = ite.next().split(":");
				System.out.println(xpathExpression);
				temp = xpathExpression[1];
				System.out.println(temp);
			}
		}
		return temp;
		
	}
}
