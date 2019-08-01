package commom.Utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridHelper {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(url, cap);
		
		driver.get("http://learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();
}
}

