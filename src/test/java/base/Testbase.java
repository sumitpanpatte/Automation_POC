package base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ConfigReader;

public class Testbase {
	
	private String browserName;
	private JavascriptExecutor js;
	
	public WebDriver driver;
	
	static {

		ConfigReader.loadConfig();

	}

	public WebDriver LaunchBaseURL() {

		browserName = ConfigReader.readConfig("browser");
		
		if (browserName.toLowerCase().contains("chrome")) {

			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
			
		} else if (browserName.toLowerCase().contains("firefox")) {

			System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			

		} else {

			System.setProperty("webdriver.ie.driver", ConfigReader.readConfig("ieBrowserPath"));
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
  	}

	public void cleanUp() {

		driver.quit();
	}
	
	 public void waitForPageToLoad(WebElement el) {
	        WebDriverWait wait = new WebDriverWait(driver, 15);
	        wait.until(ExpectedConditions.elementToBeClickable(el));
	    }
	 
	
	public void sendClick(WebElement el) {
		 
		 waitForPageToLoad(el);
		 js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);", el);
		 el.click();
	        
	    }
	
		 public void waitForElementToDisAppear(String id) {
	        WebDriverWait wait = new WebDriverWait(driver, 15);
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	    }
	 
	 public void sendText(String text,WebElement el) {
		 
		 waitForPageToLoad(el);
        js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);", el);
		 el.clear();
		 el.sendKeys(text);
	        
	    }
	 
	 public void selectFromDropDownValue(String value,WebElement el) {
		 waitForPageToLoad(el);
         js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);", el);
	     Select selectobj = new Select (el);  
	     selectobj.selectByValue(value);
		 
	    }
	 
	 public void selectFromDropDownValue(int index,WebElement el) {
		 waitForPageToLoad(el);
         js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);", el);
	     Select selectobj = new Select (el);  
	     selectobj.deselectByIndex(index);
		 
	    }

	 public void customeScrollIntoView (WebElement el) {
		 
		 waitForPageToLoad(el);
         js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);", el);
	 }
}
