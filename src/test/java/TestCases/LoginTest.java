package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class LoginTest extends baseClass {
	
	@Test
	public void browserTest() throws IOException {
		
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Hello");
		
		//We are stored locators separately in our LoginPageObject class 
		//now we can use there methods by creating object of that class
		//where the methods are declared for username,password and login...
		
		//so we create the object of LoginPageObject class and on that we apply click or sendkeys operation
		//so we pass the driver in our object to give scope
		//After passing the arg as driver in LoginPageObject object error occur and hover it to create a constructor
		LoginPageObject LPO =new LoginPageObject(driver); //Here we pass driver it gives an error and creat constructor in our LoginPageObject class
		LPO.enterUsername().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		LPO.clickOnLogin().click();  
		//So here we used locators by using the object and apply click opration
		
		
		//Assertions
		
		commonMethods.handleAssertion(LPO.errorMessage().getText(), constant.errorMsg);
		
		
	}

}
