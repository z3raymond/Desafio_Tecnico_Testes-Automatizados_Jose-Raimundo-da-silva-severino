package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "json:target/reports/cucumberReport.json","html:target/reports"},
        features="src/test/resources/features",
        tags={"~@ignore"},
        glue={"steps"}

)

public class RunCucumberTest {
    public static WebDriver driver;

    @BeforeClass
    public static void  start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //System.setProperty("webdriver.chrome.driver","C:\\Nova pasta\\DesafiojoseRaimundoQA - renner\\chromedriver.exe");


    }
    @AfterClass
   public static void  stop(){
       driver.quit();
    }


}
