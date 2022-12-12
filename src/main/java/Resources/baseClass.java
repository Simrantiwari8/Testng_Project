package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class baseClass {

	public WebDriver driver; //Globally declare Webdriver driver to use this driver in another package and class
	                         //Before this declaretion our driver is local accessible but cant use this driver in our LoginTest test case
	                         //So we declare this as public and remove WebDriver in the if condition 
	                         //Now our driver can accessible anywhere.
	
	public void browserLaunch() throws IOException {
		// To read the properties file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		// To access the Properties file we used java Properties class and create the
		// object of properties class object here to access
		Properties prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser"); // To access the value of key

		if (browserName.equalsIgnoreCase("chrome")) {
		     driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//firefox
		}
		
		else {
			System.out.println("Please Enter the valid browser name");
		}
	}
		
		
		
			
		@BeforeMethod
		public void launch() throws IOException {
			browserLaunch();
			driver.get("https://login.salesforce.com/");
	

	}

	
}
