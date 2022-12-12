package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObject {
	
	public WebDriver driver;
	
	private By firstname= By.xpath("//input[@name='UserFirstName']");
	private By lastName= By.xpath("//input[@name='UserLastName']");
	private By jobTitle = By.xpath("//input[@name='UserTitle']");
	private By emailId = By.xpath("//input[@name='UserEmail']");
	private By phoneNumber =By.xpath("//input[@name='UserPhone']");
	//private By companyName = By.xpath("//input[@name='CompanyName']");
	private By employee =By.xpath("//select[@name='CompanyEmployees']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	//private By companyLang =By.xpath("//select[@name='CompanyLanguage']");
	private By serviceAgreement =By.xpath("//div[@class='checkbox-ui'][1]");
	 
	public signUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterFirstName() {
		return driver.findElement(firstname);
	}
	
	public WebElement EnterLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement EnterJobTitle() {
		return driver.findElement(jobTitle);
	}

	
	public WebElement EnterEmailid() {
		return driver.findElement(emailId);
	}
	
	public WebElement EnterPhone() {
		return driver.findElement(phoneNumber);
	}
	
	/*public WebElement EnterCompName() {
		return driver.findElement(companyName);
	}*/
	
	public WebElement SelectCompEmployee() {
		return driver.findElement(employee);
	}
	
	public WebElement SelectCountry() {
		return driver.findElement(country);
	}
	
	/*public WebElement SelectCompLang() {
		return driver.findElement(companyLang);
	}*/
	
	public WebElement clickonCheckbox() {
		return driver.findElement(serviceAgreement);
	}
	
	
}
