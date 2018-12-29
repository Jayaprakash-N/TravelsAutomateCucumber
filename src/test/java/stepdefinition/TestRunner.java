package stepdefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src\\test\\resources\\Feature",
        plugin = { "pretty", "html:target/site/cucumber-pretty", "json:src/test/resources/json/cucumber.json" }
        )
public class TestRunner extends AbstractTestNGCucumberTests
{
	/*
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
	    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber scenarios", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper 
	cucumberFeature) throws Throwable{
	testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
	}
	@DataProvider
	public Object[][] scenarios() {
	    return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
	    testNGCucumberRunner.finish();
	}
	*/
}
