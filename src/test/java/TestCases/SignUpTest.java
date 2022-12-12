package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.signUpPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class SignUpTest extends baseClass {

	@Test
	public void verify() throws IOException, InterruptedException {
        
		LoginPageObject LPO =new LoginPageObject(driver);
		LPO.clickOntryForFree().click();
		
		//Now we have another signUpPageObject class to stored our sign up webelements and used here
		
		
		signUpPageObject SPO = new signUpPageObject(driver);
		
		Thread.sleep(5000);
		SPO.EnterFirstName().sendKeys(constant.firstName);
		SPO.EnterLastName().sendKeys(constant.lastName);
		SPO.EnterJobTitle().sendKeys(constant.jobTitle);
		SPO.EnterEmailid().sendKeys(constant.emailId);
		SPO.EnterPhone().sendKeys(constant.phone);
		
		
		commonMethods.selectDropdown(SPO.SelectCompEmployee(),1);
		
		commonMethods.selectDropdown1(SPO.SelectCountry(), "India");
		
		//SPO.EnterCompName().sendKeys("xyz company");
		
		//Select s1=new Select();
		//s1.selectByVisibleText("India");
		
		//Select s2=new Select(SPO.SelectCompLang());
		//s2.selectByIndex(1);
		
		SPO.clickonCheckbox().click();
		
		
	}
}
