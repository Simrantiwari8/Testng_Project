package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void selectDropdown(WebElement dropdown, int index) { //how will you decide which parameter will give: always take those parameter which is going to be change in our field
		
		Select s=new Select(dropdown); //take those webelement which are often changed everytime 
		s.selectByIndex(index); //Select company employee
		
		//Instead of declaring everytime select class we took it in our commonMethods and declared webelement and index so that
		//it will everytime call this method and stored different differsnt webelement and index through it
	}
	
       public static void selectDropdown1(WebElement dropdown, String str) { 
		Select s1=new Select(dropdown); //take those webelement which are often changed everytime 
		s1.selectByVisibleText(str); //select country name
		
		
	}

	public static void handleAssertion(String actualString, String expectedString) {
		
        SoftAssert assertion = new SoftAssert();
		
	
		String actual=actualString;
		String expected=expectedString;
		
		assertion.assertEquals(actual,expected);
		assertion.assertAll();
	}
}
