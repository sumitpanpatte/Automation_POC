package pagelibraray;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import base.Testbase;

public class RequestDemoPage extends Testbase {

	
	
	
	@FindBy(how = How.XPATH, using =  "//input[contains (@id, 'firstname')]")
	public WebElement inputBoxFirstName;
	
	@FindBy(how = How.XPATH, using =  "//input[contains (@id, 'lastname')]")
	public WebElement inputBoxLastName;
	
	@FindBy(how = How.XPATH, using =  "//input[contains (@id, 'company')]")
	public WebElement inputBoxCompanyName;
	
	@FindBy(how = How.XPATH, using =  "//input[contains (@id, 'jobtitle')]")
	public WebElement inputBoxJobTitle;
	
	@FindBy(how = How.XPATH, using =  "//input[contains (@id, 'email')]")
	public WebElement inputBoxBusinessEmail;
	
	@FindBy(how = How.XPATH, using =  "//input[contains (@id, 'direct_phone')]")
	public WebElement inputBoxPhoneNumber;
	
	@FindBy(how = How.NAME, using =  "type_of_prospect")
	public WebElement dropDownProspect;
	
	@FindBy(how = How.NAME, using =  "teu_shipped_anually")
	public WebElement dropDownAnuallyShipped;
	
	
	@FindBy(how = How.XPATH, using =  "//select[contains (@id, 'persona')]")
	public WebElement dropDonResponsibleFor;
	
	@FindBy(how = How.XPATH, using =  "//input[contains (@id, 'xeneta_industry_blog')]")
	public WebElement toggleButtonSubscribe;
	
	@FindBy(how = How.XPATH, using =  "//input[@type='submit']")
	public WebElement buttonSubmit;
	
	@FindBy(how = How.XPATH, using =  "//*[contains(text(),'Thanks for submitting the form.')]")
	public WebElement successfulMessage;
	
	@FindBy(how = How.XPATH, using =  "//*[contains(text(),'Please complete all required fields.')]")
	public WebElement CompleteAllFieldErrMessage;
	
	@FindBy(how = How.XPATH, using =  "//*[contains(text(),'Email must be formatted correctly.')]")
	public WebElement IncorrectEmailFormattErrMessage;
	
	@FindBy(how = How.XPATH, using =  "//div[@class='ytp-cued-thumbnail-overlay-duration']")
	public WebElement youtubeVideo;
	
	@FindBy(how = How.LINK_TEXT, using = "SHIPPERS")
	public WebElement linkShippers;
	
	@FindBy(how = How.LINK_TEXT, using = "FREIGHT FORWARDERS")
	public WebElement linkFreight;
	
	@FindBy(how = How.LINK_TEXT, using = "PRODUCTS")
	public WebElement linkProducts;
	
	@FindBy(how = How.LINK_TEXT, using = "LEARN")
	public WebElement linkLearn;
	
	@FindBy(how = How.LINK_TEXT, using = "BLOG")
	public WebElement linkBlog;
	
	@FindBy(how = How.LINK_TEXT, using = "FREE TRIAL & DEMO")
	public WebElement linkFreeTrial;
	
	@FindBy(how = How.LINK_TEXT, using = "SIGN IN")
	public WebElement linkSignIn;
	
	@FindBy(how = How.LINK_TEXT, using = "Data Method")
	public WebElement linkDataMethod;
	
	@FindBy(how = How.LINK_TEXT, using = "Customers")
	public WebElement linkCustomers;
	
	@FindBy(how = How.LINK_TEXT, using = "Our Company")
	public WebElement linkOurCompany;
	
	@FindBy(how = How.LINK_TEXT, using = "Careers")
	public WebElement linkCareers;
	
	@FindBy(how = How.LINK_TEXT, using = "Press")
	public WebElement linkPress;
	
	@FindBy(how = How.LINK_TEXT, using = "Terms of Service")
	public WebElement linkTermsofService;
	
	
	public RequestDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
}
