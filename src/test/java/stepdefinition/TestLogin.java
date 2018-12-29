package stepdefinition;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactoryCucu.Login;
import propertyReader.PropertiesLoad;

public class TestLogin {
	
	WebDriver driver;
	String Uname;
	String Paswd;
	PropertiesLoad object;
	Properties allObjects;
	String URL;
	SoftAssert softAssertion;
	JavascriptExecutor js;
	Login lgn;
	
	@Before
    public void setupLogin() throws IOException{
		object = new PropertiesLoad();
		allObjects = object.getObjectRepository();
		System.setProperty("webdriver.gecko.driver",allObjects.getProperty("geckodriver"));
		URL=allObjects.getProperty("url");
		softAssertion=new SoftAssert();
    }	

	@Given("Navigate to {string} Login Screen")
	public void navigateLogin(String string) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js = (JavascriptExecutor)driver;
		driver.get(URL+"/login");
	}
	
	@Then("I should see Login Page")
	public void validateLogin_Page() {
		softAssertion.assertTrue(driver.getCurrentUrl().equals(URL+"/login"));
	}


	@When("I fill in Email with {string} and Password with {string}")
	public void fillLoginDetails(String Username, String Password) {
		Uname=Username;
		Paswd=Password;
		lgn =new Login(driver);
		lgn.setLogin(Uname, Paswd);
	}


	@And("I click on the Log In button")
	public void clickLogin() {
		lgn.ClickLogin();
		js.executeScript("return document.readyState").toString().equals("complete");
	   
	}

	@Then("I am on the {string} page on URL {string}")
	public void My_Account_Login(String title, String expectedURL) {
		softAssertion.assertTrue(driver.getTitle().equals("My Account"));
		softAssertion.assertTrue(driver.getCurrentUrl().equals(expectedURL));
		softAssertion.assertAll();
		System.out.println("User "+Uname+ " logged in Successfully");
	}
	
	@After
    public void closeDriver(){
		System.out.println("Browser Close Invoked");
		if(driver!=null)
			   driver.close();
			else
			   System.out.println("No Browser Instance open to Close");
    }
}
