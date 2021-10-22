package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Driver.BaseClass;

public class TC03_ButtonPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id='testing']")
	WebElement workspaceButton;

	@FindBy (xpath = "//*[@aria-hidden='false']//app-test-site/section[2]/div/div/div/div[2]//footer/a")
	WebElement clickonbutton;
	
	@FindBy (xpath = "//*[@id='home']")
	WebElement gotohome;
	
	@FindBy (xpath = "//*[@id='position']")
	WebElement findlocation;
	
	@FindBy (xpath = "//*[@id='color']")
	WebElement colourofthebutton;
	
	@FindBy (xpath = "//*[@id='property']")
	WebElement heightandwidthofthebutton;
	
	@FindBy (xpath = "//*[@title='Disabled button']")
	WebElement buttonisdisabled;
	
	@FindBy (xpath = "//*[@id='isDisabled']/div/h2")
	WebElement holdbutton;
	
	public TC03_ButtonPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean button() throws InterruptedException {
		workspaceButton.click();
		//Click on button link
		clickonbutton.click();
		//Goto Home and come back here using driver command
		gotohome.click();
		driver.navigate().back();
		//Get the X & Y co-ordinates
		findlocation.getLocation();
		//Find the color of the button
		colourofthebutton.getCssValue("background-color");
		//Find the height & width of the button
		heightandwidthofthebutton.getSize();
		//Confirm button is disabled
		boolean isButtondisabled = false;
		if(!buttonisdisabled.isEnabled()) //true or false
		{ //true
			isButtondisabled = true;
			System.out.println("Button is disabled");
		}
		 
		holdbutton.click();
		return isButtondisabled;
	}

}
