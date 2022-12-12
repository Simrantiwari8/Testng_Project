package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	//Locators will divide by login page so here we stored our locators which is used in login page so we created Loginpageobject
	
	public WebDriver driver; //This driver dont have scope that is why error occur ..cannot invoke driver
	                         //To give scpe we want constructor and we will invoke it in our LoginTest
	
	//So we declare our locators as private and we used this locators in public method this concept know as Encapsulation 
	private By username= By.xpath("//input[@id='username']"); 
	private By password= By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	private By tryforFree = By.xpath("//a[@id='signup_link']");
	private By errorMessage = By.xpath("//div[@id='error']");
	
	
	
	//As soon as we click on create constructor in our LoginTest LoginPageObject object this constructor invoke here
	//And the name is driver2..This is parameterized constructor
	//So this driver2 has given scope from LoginTest now we re giving this driver2 scope to our this driver
	//By using this pointer which points current class driver
	public LoginPageObject(WebDriver driver2) {
		this.driver = driver2; //will give the scope of driver2 to driver...
	}

	//return will return the WebElement so we use WebElement at public void
	public WebElement enterUsername() {
		
		return driver.findElement(username); 
		//This line include our webelement which is:
		//driver.findElement(By.xpath("//input[@id='username']")); so this whole line cover in line no.19 code
	}
	//So same as we create another methods to access our locators
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	
	public WebElement clickOntryForFree() {
		return driver.findElement(tryforFree);
	}
	
	public WebElement errorMessage() {
		return driver.findElement(errorMessage);
	}
}
