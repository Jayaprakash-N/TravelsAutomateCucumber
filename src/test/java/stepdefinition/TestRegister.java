package stepdefinition;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactoryCucu.Signup;
import propertyReader.PropertiesLoad;

public class TestRegister {
	
	WebDriver driver;
	PropertiesLoad object;
	Properties allObjects;
	String URL;
	String Fname;
	String emailId;
	SoftAssert softAssertion;
	JavascriptExecutor js;
	Signup sgn;

	@Before
    public void setupRegister() throws IOException{
		object = new PropertiesLoad();
		allObjects = object.getObjectRepository();
		System.setProperty("webdriver.gecko.driver",allObjects.getProperty("geckodriver"));
		URL=allObjects.getProperty("url");
		softAssertion=new SoftAssert();
    }	

	@Given("Navigate to {string} Signup Screen")
	public void navigateSignup(String string) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js = (JavascriptExecutor)driver;
		driver.get(URL+"/register");
	}
	
	@Then("I should see Sign Up Page")
	public void validateSign_Up_Page() {
		softAssertion.assertTrue(driver.getCurrentUrl().equals(URL+"/register"));
		sgn=new Signup(driver);
	}

	@Given("I fill in First Name with {string}")
	public void setFirst_Name(String firstName) {
		Fname=firstName;
		sgn.setFirstName(Fname);
		
	}

	@And("I fill in Last Name with {string}")
	public void setLast_Name(String lastName) {
		sgn.setLastName(lastName);
		
	}

	@And("I fill in Mobile Number with {string}")
	public void setMobile_Number(String mobNo) {
		sgn.setMobileNo(mobNo);
		
	}

	@And("I fill in Email with {string}")
	public void setEmail(String email) {
		emailId=email;
		sgn.setEmail(emailId);
		
	}

	@And("I fill in Password with {string}")
	public void setPassword(String pwd) {
		sgn.setpwd(pwd);
		
	}

	@And("I fill in Confirm Password with {string}")
	public void setConfirm_Password(String cpwd) {
		sgn.setCPwd(cpwd);
	}

	@When("I click on the Sign Up button")
	public void clickSign_Up_button() {
	   sgn.ClickSignup();
	   js.executeScript("return document.readyState").toString().equals("complete");
	}

	@Then("user should be created and should be on the {string} page on URL {string}")
	public void My_Account_Register(String title, String expectedURL) {
		softAssertion.assertTrue(driver.getTitle().equals(title));
		softAssertion.assertTrue(driver.getCurrentUrl().equals(expectedURL));
		softAssertion.assertAll();
		System.out.println("User "+emailId+ " Signed In Successfully");
	}

	
}
