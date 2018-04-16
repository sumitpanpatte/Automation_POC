package pagelibraray;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class MediaResourcePage extends Testbase {

	
	@FindBy(how = How.LINK_TEXT, using = "English")
	public WebElement switchToEnglish ;
	
	@FindBy(how = How.XPATH, using =  "//*[contains(text(),'Deutsch')]")
	public WebElement switchToDeutsch;
	
	@FindBy(how = How.LINK_TEXT, using = "Product Screenshots")
	public WebElement productScreenshots ;
	
	@FindBy(how = How.XPATH, using =  ".//img[@alt='Dashboard 16-9']")
	public WebElement productsGallery ;
	
	@FindBy(how = How.LINK_TEXT, using = "Xeneta Logo")
	public WebElement xenetaLogo ;
	
	@FindBy(how = How.XPATH, using =  ".//a[@class='primary-button']")
	public WebElement downloadLogo ;
	
	@FindBy(how = How.LINK_TEXT, using = "Spokespersons")
	public WebElement spokespersonsLink;

	@FindBy(how = How.XPATH, using =  "//*[@id='spokespersons']")
	public WebElement sopkespersonSection ;
	
	@FindBy(how = How.LINK_TEXT, using = "Image of Founders")
	public WebElement imageOfFounders;
	
	@FindBy(how = How.XPATH, using =  "//*[@id='image-of-founders']")
	public WebElement imageOfFounderSection;
		
	@FindBy(how = How.XPATH, using =  "//input[@type='email']")
	public WebElement email;
	
	@FindBy(how = How.XPATH, using =  "//input[@type='submit']")
	public WebElement submit;
	
	@FindBy(how = How.XPATH, using =  "//*[@class='submitted-message']")
	public WebElement SuccessfulSubmitMesg;
	
	@FindBy(how = How.XPATH, using =  "//*[contains(text(),'Please enter')]")
	public WebElement ErrorMesgForGmail;
	
	@FindBy(how = How.XPATH, using =  "//*[contains(text(),'Email must be formatted correctly')]")
	public WebElement ErrorMesgForIncorrectEmail;
	
	
	public MediaResourcePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public void switchLanguageDeutsch() {
		
		sendClick(switchToDeutsch);
		
		}
	
	public void switchLanguageEnglish() {
				
		sendClick(switchToDeutsch);
		}
		
}
