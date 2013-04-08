package tests;

//import junit.framework.Assert;
//import static junit.framework.Assert.assertEquals;
//import junit.framework.Assert;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	private WebDriver driver;
	
	@Before
	public void intialize(){
		driver=new InternetExplorerDriver();
		
	}
	@After
	public void closing(){
		driver.close();
		
		
	}
	
	@Given("^I want to use the browser$")
	public void I_want_to_use_the_browser() throws Throwable {
		driver.get("https://www.bhf.org.uk/login.aspx?sc_id=FrontNAV-Login&utm_source=FrontNAV-Login&utm_medium=FrontNAV-Login&utm_campaign=FrontNAV-Login");
		
//		    throw new PendingException();
	}

	@When("^I type testuser(\\d+) in the username input field$")
	public void I_type_testuser_in_the_username_input_field(String username)  {
	      driver.findElement(By.xpath("//input[@id='Template_ctl13_ctl00_Login1_UserName']")).sendKeys("madhushashank22@gmail.com");
	//    throw new PendingException();
	}

	@When("^I type testuser(\\d+) in the password input field$")
	public void I_type_testuser_in_the_password_inputfield(String password)  {
		driver.findElement(By.xpath("//*[@id='Template_ctl13_ctl00_Login1_Password']")).sendKeys("madhu123");
	  //  throw new PendingException();
	}

	@When("^I click the login button$")
	public void I_click_the_login_button()   {
	   driver.findElement(By.xpath("//*[@id='Template_ctl13_ctl00_Login1_Login']")).click();
	   //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		
		//e.printStackTrace();
	}
	   //throw new PendingException();
	}
  @Then("^I am on the (.*) page$")
    public void I_am_on_the_login_page(String successpage) throws Exception {
	  Assert.assertEquals(driver.findElement(By.xpath("//*[@id='content']/h1")).getText(), "My Account");
	
	  
	  
     //throw new PendingException();
}	
  }
