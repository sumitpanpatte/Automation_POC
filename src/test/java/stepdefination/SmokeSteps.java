package stepdefination;



import org.apache.log4j.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import base.Testbase;
import pagelibraray.MediaResourcePage;
import pagelibraray.RequestDemoPage;
import utility.ConfigReader;
import utility.CustomSeleniumMethod;

public class SmokeSteps extends Testbase {

	static Logger log = Logger.getLogger(SmokeSteps.class.getName());
	
	private MediaResourcePage MediaResourcePageObj;
	private RequestDemoPage RequestDemoPageObj;

	@Before
	public void beforeScenario() {
		
		log.info("***** Browser Launch********");
		driver = LaunchBaseURL();
		
	}

	@After
	public void afterScenario() {
		log.info("***** Browser quit********");
		cleanUp();

	}
	@Given("^user navigates to media Resource page in English$")
	public void user_navigates_to_media_Resource_page_in_English() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		MediaResourcePageObj = new MediaResourcePage (driver);
		log.info("  User navigate to media resource page  ");
		driver.get(ConfigReader.readConfig("mediaResourceurl"));
		driver.manage().window().maximize();
		
		
	   
	}
	@When("^User clicks Deutsch language link$")
	public void user_clicks_Deutsch_language_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 log.info("  User click on Deutsch to change language  ");
		 MediaResourcePageObj.switchToDeutsch.click();
	    
	}

	@Then("^language should change to Deutsch$")
	public void language_should_change_to_Deutsch() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		log.info("  Verify language changed to Deutsch   ");
		CustomSeleniumMethod.hardWait(2);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.xeneta.com/de/pressematerialien");
	   
	}


	@Then("^Product Screenshots link should work$")
	public void product_Screenshots_link_should_work() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		log.info("  Verify Scroll to product screesnshot   ");
		 sendClick(MediaResourcePageObj.productScreenshots);
		 CustomSeleniumMethod.hardWait(2);
		 Assert.assertTrue(MediaResourcePageObj.productsGallery.isDisplayed());
		
	 
	}

	@Then("^Xeneta Logo link should work$")
	public void xeneta_Logo_link_should_work() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("  Verify Scroll to Xeneta Logo   ");
		
		sendClick(MediaResourcePageObj.xenetaLogo);
		CustomSeleniumMethod.hardWait(2);
		 Assert.assertTrue(MediaResourcePageObj.downloadLogo.isDisplayed());
	 
	}

	@Then("^Spokpersons link should work$")
	public void spokpersons_link_should_work() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("  Verify Scroll to spokpersons link   ");
		
		sendClick(MediaResourcePageObj.spokespersonsLink);
		CustomSeleniumMethod.hardWait(2);
		 Assert.assertTrue(MediaResourcePageObj.sopkespersonSection.isDisplayed());
	    
	}

	@Then("^Image of Founders link should work$")
	public void image_of_Founders_link_should_work() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		log.info("  Verify Scroll to Founders section   ");
		sendClick(MediaResourcePageObj.imageOfFounders);
		CustomSeleniumMethod.hardWait(2);
		Assert.assertTrue(MediaResourcePageObj.imageOfFounderSection.isDisplayed());
	
	}


@When("^User enters \"([^\"]*)\" to Sign up for news letter$")
public void user_enters_to_Sign_up_for_news_letter(String emailID) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  User enters email to signup for news letter  ");
	sendText(emailID, MediaResourcePageObj.email);
	
 
}

@When("^User clicks submit button$")
public void user_clicks_submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  User clicks on submit to signup for news letter  ");
	sendClick(MediaResourcePageObj.submit);
}

@Then("^successful signing up message should be displayed$")
public void successful_signing_up_message_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify successful mesg  ");
	CustomSeleniumMethod.hardWait(3);
	Assert.assertTrue(MediaResourcePageObj.SuccessfulSubmitMesg.isDisplayed());
   
}

@Then("^Error message to enter business email should be displayed$")
public void error_message_to_enter_business_email_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify error mesg  ");
	CustomSeleniumMethod.hardWait(2);
	Assert.assertTrue(MediaResourcePageObj.ErrorMesgForGmail.isDisplayed());
    
}

@Then("^Error message to enter proper formatted email should be displayed$")
public void error_message_to_enter_proper_formatted_email_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify error mesg  ");
	CustomSeleniumMethod.hardWait(2);
	Assert.assertTrue(MediaResourcePageObj.ErrorMesgForIncorrectEmail.isDisplayed());
}



@Given("^user navigates to request demo page$")
public void user_navigates_to_request_demo_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	RequestDemoPageObj = new RequestDemoPage (driver);
	
	log.info(" user navigates to request demo page   ");
	driver.get(ConfigReader.readConfig("requestDemourl"));
	//driver.get("https://www.xeneta.com/test-request-xeneta-demo");
	driver.manage().window().maximize();
 	
}

@When("^user eneters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void user_eneters(String fName, String lName, String company, String job, String email, String number) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	log.info(" user enter details in inputbox to request demo   ");
	
	sendText(fName, RequestDemoPageObj.inputBoxFirstName );
	sendText(lName, RequestDemoPageObj.inputBoxLastName  );
	sendText(company, RequestDemoPageObj.inputBoxCompanyName );
	sendText(job   , RequestDemoPageObj.inputBoxJobTitle );
	sendText(email, RequestDemoPageObj.inputBoxBusinessEmail );
	sendText(number, RequestDemoPageObj.inputBoxPhoneNumber);
	 
}

@When("^user selects from drop down \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void user_selects_from_drop_down(String IAm, String Shipped, String ResponsibleFor) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	log.info(" user enter selects from dropdown to request demo   ");
	
  	selectFromDropDownValue(IAm,RequestDemoPageObj.dropDownProspect);
  	selectFromDropDownValue(Shipped,RequestDemoPageObj.dropDownAnuallyShipped);
  	selectFromDropDownValue(ResponsibleFor,RequestDemoPageObj.dropDonResponsibleFor);
  	
 
}

@When("^user clicks on Subscribe xeneta toggle button$")
public void user_clicks_on_Subscribe_xeneta_toggle_button() throws Throwable {
	
	log.info(" user click on togglebutton   ");
    sendClick(RequestDemoPageObj.toggleButtonSubscribe);
    
  
}

@When("^User clicks on submit$")
public void user_clicks_on_submit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info(" user click on submit   ");
	sendClick(RequestDemoPageObj.buttonSubmit);
    
}

@Then("^successful message should be displayed$")
public void successful_message_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify successful message displayed after submitting form ");
	CustomSeleniumMethod.hardWait(2);
	customeScrollIntoView(RequestDemoPageObj.successfulMessage);
	Assert.assertTrue(RequestDemoPageObj.successfulMessage.isDisplayed());
  
}

@Then("^Please complete all required fields message should be displayed$")
public void please_complete_all_required_fields_message_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify Please complete all required fields message displayed after submitting form ");
	CustomSeleniumMethod.hardWait(2);
	customeScrollIntoView(RequestDemoPageObj.CompleteAllFieldErrMessage);
	Assert.assertTrue(RequestDemoPageObj.CompleteAllFieldErrMessage.isDisplayed());
    
}

@When("^user eneters \"([^\"]*)\"$")
public void user_eneters(String email) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	log.info(" user enter email   ");
	sendText(email, RequestDemoPageObj.inputBoxBusinessEmail );

}



@Then("^Email must be formatted correctly message should be displayed$")
public void email_must_be_formatted_correctly_message_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify Email must be formatted correctly message displayed ");
	CustomSeleniumMethod.hardWait(2);
	customeScrollIntoView(RequestDemoPageObj.IncorrectEmailFormattErrMessage);
	Assert.assertTrue(RequestDemoPageObj.IncorrectEmailFormattErrMessage.isDisplayed());
    
}


@Then("^SHIPPERS, FREIGHT FORWARDERS, PRODUCTS, LEARN$")
public void shippers_FREIGHT_FORWARDERS_PRODUCTS_LEARN() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	log.info("  Verify shippers link is displayed ");
	Assert.assertTrue(RequestDemoPageObj.linkShippers.isDisplayed());
	
	log.info("  Verify freight forwarders link is displayed ");
	Assert.assertTrue(RequestDemoPageObj.linkFreight.isDisplayed());
	
	log.info("  Verify Products link is displayed ");
	Assert.assertTrue(RequestDemoPageObj.linkProducts.isDisplayed());
	
	log.info("  Verify Learn link is displayed ");
	Assert.assertTrue(RequestDemoPageObj.linkLearn.isDisplayed());
}

@Then("^BLOG, FREE TRIAL & DEMO, SIGN IN  links are present in header$")
public void blog_FREE_TRIAL_DEMO_SIGN_IN_links_are_present_in_header() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify Blog link is displyed ");
	Assert.assertTrue(RequestDemoPageObj.linkBlog.isDisplayed());
	
	log.info("  Verify Free trial and demo link is displyed ");
	Assert.assertTrue(RequestDemoPageObj.linkFreeTrial.isDisplayed());
	
	log.info("  Verify sign link is displyed ");
	Assert.assertTrue(RequestDemoPageObj.linkSignIn.isDisplayed());
    
}

@Then("^Data Method, Customers, Our Company, Careers$")
public void data_Method_Customers_Our_Company_Careers() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	log.info("  Verify Data Method link is displyed ");
	Assert.assertTrue(RequestDemoPageObj.linkDataMethod.isDisplayed());
	
	log.info("  Verify Customer link is displyed ");
	Assert.assertTrue(RequestDemoPageObj.linkCustomers.isDisplayed());
	
	log.info("  Verify Our Company link ");
	Assert.assertTrue(RequestDemoPageObj.linkOurCompany.isDisplayed());
	
	log.info("  Verify Careers link ");
	Assert.assertTrue(RequestDemoPageObj.linkCareers.isDisplayed());

}

@Then("^Press, Terms of Service links are present in footer$")
public void press_Terms_of_Service_links_are_present_in_footer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	log.info("  Verify Press link ");
	Assert.assertTrue(RequestDemoPageObj.linkPress.isDisplayed());
	
	log.info("  Verify Terms of Services link ");
	Assert.assertTrue(RequestDemoPageObj.linkTermsofService.isDisplayed());

}



}
