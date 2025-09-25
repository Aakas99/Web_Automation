package Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinitions.Hooks;
import Launchcode.Driversetup;

@CucumberOptions(
    features = "src/test/resources/Featurefiles",  // path to your .feature files
    glue = {"stepDefinitions"},                    // package of your step defs
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber-report.json"
    },
    monochrome = true
)
public class RunCucumberTestNG extends AbstractTestNGCucumberTests {
    
    //private static Driversetup driverSetup = new Driversetup();

    // This lets TestNG run scenarios in parallel if needed
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    
    @BeforeTest
    @Parameters({"url", "browser"})
    public void setupDriver(String url, String browser) throws Exception {
        System.setProperty("test.url", url);
        System.setProperty("test.browser", browser);
        
    }

}


