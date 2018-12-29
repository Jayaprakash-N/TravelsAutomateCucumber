$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "Description: Login to the PHPTravels web site",
  "keyword": "Feature"
});
formatter.background({
  "name": "Navigate to Login Screen",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to \"https://www.phptravels.net/login\" Login Screen",
  "keyword": "Given "
});
formatter.match({
  "location": "TestLogin.navigateLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestLogin.validateLogin_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I fill in Email with \"retest@gmail.com\" and Password with \"test123\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestLogin.fillLoginDetails(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Log In button",
  "keyword": "And "
});
formatter.match({
  "location": "TestLogin.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the \"My Account\" page on URL \"https://www.phptravels.net/account/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestLogin.My_Account_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature/Register.feature");
formatter.feature({
  "name": "Register User",
  "description": "Description: Register user to the travels web site",
  "keyword": "Feature"
});
formatter.background({
  "name": "Navigate to Register Screen",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to \"https://www.phptravels.net/register\" Signup Screen",
  "keyword": "Given "
});
formatter.match({
  "location": "TestRegister.navigateSignup(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Sign Up Page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestRegister.validateSign_Up_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register with User details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I fill in First Name with \"Test_First\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestRegister.setFirst_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in Last Name with \"Test_Last\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestRegister.setLast_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in Mobile Number with \"789\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestRegister.setMobile_Number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in Email with \"test@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestRegister.setEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in Password with \"test123\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestRegister.setPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in Confirm Password with \"test123\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestRegister.setConfirm_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Sign Up button",
  "keyword": "When "
});
formatter.match({
  "location": "TestRegister.clickSign_Up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be created and should be on the \"My Account\" page on URL \"https://www.phptravels.net/account/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestRegister.My_Account_Register(String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\texpected [true] but found [false],\n\texpected [true] but found [false]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat stepdefinition.TestRegister.My_Account_Register(TestRegister.java:102)\r\n\tat ✽.user should be created and should be on the \"My Account\" page on URL \"https://www.phptravels.net/account/\"(src/test/resources/Feature/Register.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});