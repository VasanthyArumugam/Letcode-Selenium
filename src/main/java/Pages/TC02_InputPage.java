package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.BaseClass;

public class TC02_InputPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id='testing']")
	WebElement workspaceButton;
	
	@FindBy(xpath = "//*[@aria-hidden='false']//app-test-site/section[2]/div/div/div/div[1]//div//footer/a")
	WebElement input;
    
	@FindBy(id ="fullName")
	WebElement fullname;
	
	@FindBy(id ="join")
	WebElement appendatext;
	
	@FindBy(id ="getMe")
	WebElement getMe;
	
	@FindBy(id ="clearMe")
	WebElement clearMe;
	
	@FindBy (id ="noEdit")
	WebElement editfieldisdisabled;
	
	@FindBy (id ="dontwrite")
	WebElement elementisreadonly;
	
	
	public TC02_InputPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean[] Input() throws InterruptedException {
		workspaceButton.click();
		input.click();
		Thread.sleep(1000);
		//Enter your full Name
		fullname.sendKeys(prop.getProperty("fullname"));
		Thread.sleep(1000);
    	//Append a text and press keyboard tab
		System.out.println(appendatext.getAttribute("value")+ prop.getProperty("appendatext"));
		appendatext.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//What is inside the text box
		System.out.println(getMe.getAttribute("value"));
		Thread.sleep(1000);
		//Clear the text
		clearMe.clear();
		Thread.sleep(1000);
		//Confirm edit field is disabled
		  boolean [] editCheck = new boolean[2]; 
		  editCheck[0] = editfieldisdisabled.isEnabled();
		if(!editCheck[0])//false
		{
			System.out.println("1 st edit field is disabled and the test passed");
		}
		  editCheck[1] = elementisreadonly.isEnabled();
			if(editCheck[1])//true
			{
				System.out.println("2 nd edit field is disabled and the test passed");
			}
		driver.navigate().back();// click on back button
		return editCheck;
	  
		

}
}
 