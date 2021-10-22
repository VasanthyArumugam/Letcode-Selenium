package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.BaseClass;

public class TC00_HomeUiElementsPage extends BaseClass{
	
	@FindBy(xpath = "//*[@aria-label='main navigation']//a")
	List <WebElement> homepageheadersize;
	
	@FindBy(xpath = "//*[text() =' LetCode with Koushik']")
    WebElement letcodewithkoushiktxtmsg; 
	
	@FindBy(xpath = "//*[@id='testing']")
	WebElement workspaceButton;
	
	@FindBy(xpath = "//*[text()='Courses']")
	WebElement courses;
	
	@FindBy(xpath = "//*[text()='Product']")
	WebElement Product;
	
	@FindBy(xpath = "//*[@class='icon has-text-primary']")
	WebElement homeicon;
	
	//@FindBy(xpath = "//*[@class='yt-uix-button-content']//span[1]")
     @FindBy(xpath = "//*[@id='yt-subscribe']/span/button")
	WebElement youtube;
	
	@FindBy(xpath ="//*[@class='button is-primary is-rounded is-small']")
	WebElement signup;
	
	@FindBy(xpath = "//*[text()='Log in']")
	WebElement login;
	
	@FindBy(xpath ="//*[@alt='letcode']")
	WebElement letgohomepageicon;
	//workspace
	@FindBy(xpath ="/html/body/app-root/app-main/section[2]/div/div[1]/div[1]/div/h1")
	WebElement gettextofworkspace;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[1]/div[1]/div/p")
	WebElement getTextOfWorkspaceSubMenu;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[1]/div[1]/div/div/a")
	WebElement exploreWorkspaceButton;
	
	//courses
	@FindBy(xpath ="//*[text()=' Courses ']")
	WebElement gettextofcourses;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[2]//div//p")
	WebElement getTextofcourseSubMenu;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[2]//div[2]//div//div/a")
	WebElement explorecoursesbutton;
	
	//grooming
	@FindBy(xpath ="//*[text()=' Grooming ']")
	WebElement gettextofgrooming;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[3]//p")
	WebElement getTextofgroomingsubMenu;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[3]//div/div//div/div//a")
	WebElement testpracticebutton;
	
	//product
	@FindBy(xpath ="//*[text()=' Product ']")
	WebElement gettextofproduct;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[4]//p")
	WebElement getTextofproductsubMenu;
	
	@FindBy(xpath = "/html/body/app-root/app-main/section[2]/div/div[3]//div/div//div/div//a")
	WebElement letxpathbutton;
	
	//footer
	@FindBy(xpath = "//*[@class='content has-text-centered']/p")
	WebElement footercopyright;
	
	@FindBy(xpath = "//*[@class='columns is-mobile has-text-centered']/div/span//a")
	List <WebElement> footerbuttons;
	
		
	public TC00_HomeUiElementsPage() {
		PageFactory.initElements(driver, this);
	}
	
   	public void homepageHeaderButtonValidation() throws InterruptedException {
   		
		/*workspaceButton.click();
		Thread.sleep(1000);
		courses.click();
		Thread.sleep(1000);
		Product.click();
		Thread.sleep(1000);
		homeicon.click();
	//	youtube.click();
	//	driver.navigate().back();
		Thread.sleep(1000);
		signup.click();
		Thread.sleep(1000);
		login.click();
		letgohomepageicon.click();*/
		
		System.out.println(homepageheadersize.size());
		
		for(int a = 0; a<homepageheadersize.size(); a++) {  //9 actual 8   0   2 3 4 5 6 7 8
			if(a!=1) { 
				homepageheadersize.get(a).click();
				if(a==6) {
					System.out.println(driver.getTitle());
					driver.navigate().back();
				}
				System.out.println(homepageheadersize.get(a).getText());// This is not printing
			}
			

		}
   	}
		
	public void homepageTitleAndSubTitleValidation() {
		homepageheadersize.get(0).click();// This is the letcode logo
		System.out.println("The title of the page = " + driver.getTitle());
		System.out.println("Text message in the homepage should read as = " + letcodewithkoushiktxtmsg.getText());
	}
		
	public boolean[] homepageSubMenuValidation() {
	
		boolean[] subMenuvalidation = new boolean [12]; //0-11 There are 4 grids and each grid has 3 values hence 4x3=12
		//WorkspaceMenu
		String workspaceText = gettextofworkspace.getText();
		if(workspaceText.equals("Workspace")) {
			subMenuvalidation[0]=true;
		}
		if(getTextOfWorkspaceSubMenu.isDisplayed()) {
			subMenuvalidation[1]=true;
		}
		if(exploreWorkspaceButton.isEnabled()) {
			subMenuvalidation[2]=true;
		}
		String coursesText = gettextofcourses.getText();
		if(coursesText.equals("Courses")) {
			subMenuvalidation[3]=true;
		}
		
		if(getTextofcourseSubMenu.isDisplayed()){
		subMenuvalidation[4]=true;
		}
		
		if(explorecoursesbutton.isEnabled()) {
		  subMenuvalidation[5]=true;	
		}
		
		String groomingText = gettextofgrooming.getText();
		if(groomingText.equals("Grooming")) {
			subMenuvalidation[6]=true;		
		}
		
		if(getTextofgroomingsubMenu.isDisplayed()){
			subMenuvalidation[7]=true;	
		}
		
		if(testpracticebutton.isEnabled()) {
			subMenuvalidation[8]=true;	
		}
		
		String productText = gettextofproduct.getText(); 
	     if(productText.equals("Product")){
	    	 subMenuvalidation[9]=true;	
	     }
		
	     if(getTextofproductsubMenu.isDisplayed()) {
	    	 subMenuvalidation[10]=true;	
	     }
	     
	     if(letxpathbutton.isEnabled()) {
	    	 subMenuvalidation[11]=true; 
	     }
		return subMenuvalidation;
	}
	
	 public boolean[] homePageFooterDetailsValidation() {
		 boolean[] footerResults = new boolean[5];
		 String expected = footercopyright.getText();
		 String actual = "LetCode © Copyright 2021 Koushik Chatterjee & Bollineni Lakshmi Yaswanth";// this is not typing
		 if(expected.equals(actual))   
		 {
			 footerResults[0]=true;
		 }
		 
		 
		     System.out.println(footerbuttons.size());
		     for(int a = 0; a<footerbuttons.size(); a++) {
		    	 footerbuttons.get(a).click();
		    	// Store the current window handle
		    	 String winHandleBefore = driver.getWindowHandle();

		    	 // Perform the click operation that opens new window

		    	 // Switch to new window opened
		    	 for(String winHandle : driver.getWindowHandles()){
		    	     driver.switchTo().window(winHandle);
		    	 }

		    	 // Perform the actions on new window
		    	 String windowTitle = driver.getTitle();
		    	 if(windowTitle.contains("Koushik")) {
		    		 footerResults[1]=true;
		    	 }
		    	 
		    	 // Close the new window, if that window no more required
		    	 driver.close();

		    	 // Switch back to original browser (first window)
		    	 driver.switchTo().window(winHandleBefore);
		        }
		     return footerResults;
		   //  driver.close();
	 }
	 
	
//	 public void homePageFooterDetailsValidation() {
//		 String expected = footercopyright.getText();
//		 String actual = "LetCode © Copyright 2021 Koushik Chatterjee & Bollineni Lakshmi Yaswanth";// this is not typing
//		 if(expected.equals(actual))   
//		 {
//			 Assert.assertEquals(expected, actual); // assertion should be present in main test file
//			 System.out.println(gettextofproduct);
//		 }
//		     System.out.println(footerbuttons.size());
//		     for(int a = 0; a<footerbuttons.size(); a++) {
//		    	 footerbuttons.get(a).click();
//		    	// Store the current window handle
//		    	 String winHandleBefore = driver.getWindowHandle();
//
//		    	 // Perform the click operation that opens new window
//
//		    	 // Switch to new window opened
//		    	 for(String winHandle : driver.getWindowHandles()){
//		    	     driver.switchTo().window(winHandle);
//		    	 }
//
//		    	 // Perform the actions on new window
//
//		    	 // Close the new window, if that window no more required
//		    	 driver.close();
//
//		    	 // Switch back to original browser (first window)
//		    	 driver.switchTo().window(winHandleBefore);
//		        }
//		        
//		   //  driver.close();
//	 }
	     
	}
