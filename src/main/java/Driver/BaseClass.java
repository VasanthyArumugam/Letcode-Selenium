package Driver;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utills.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop ;
	
    @BeforeTest
	public void startBrowser() throws InterruptedException, IOException {
    	prop = PropertyReader.readPropertiesFile();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.get("https://www.letcode.in");
		driver.get(prop.getProperty("url"));
		Thread.sleep(1000);

	}
   /* @AfterTest
    public void closeBrowser() {
    	driver.close();*/
    }


