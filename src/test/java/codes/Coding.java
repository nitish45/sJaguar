package codes;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import main.stepDefinations;

@JsonIgnoreProperties
public class Coding {
	
	public WebElement searchWebElement(WebDriver driver,String textforWebElement) {
		
		WebElement element = null ;
		
		return element;
	}
}
