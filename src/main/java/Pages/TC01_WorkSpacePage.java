package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver.BaseClass;

public class TC01_WorkSpacePage extends BaseClass{
	
	@FindBy(xpath = "//*[@id='testing']")
	WebElement workspaceButton;
	
	@FindBy(xpath ="//body/app-root/app-test-site/section[2]//header/p")
	List <WebElement> cardsizegrid1;
	
	@FindBy(xpath = "//body/app-root/app-test-site/section[2]/div/div/div/div")
	List <WebElement> inputcard;
	
	@FindBy(xpath = "//body/app-root/app-test-site/section[3]/div/div/div/div//footer/a")
	List <WebElement> cardsizegrid2;
	
	@FindBy(xpath ="//body/app-root/app-test-site/section[3]//header/p")
	List <WebElement> framecard;
	
	@FindBy(xpath = "//body/app-root/app-test-site/section[4]/div/div/div/div//footer/a")
	List <WebElement> cardsizegrid3;
	
	@FindBy(xpath ="//body/app-root/app-test-site/section[4]//header/p")
	List <WebElement> dragcard;
	
	@FindBy(xpath = "//body/app-root/app-test-site/section[5]/div/div/div/div//footer/a")
	List <WebElement> cardsizegrid4;
	
	@FindBy(xpath ="//body/app-root/app-test-site/section[5]//header/p")
	List <WebElement> slidercard;
	
	@FindBy(xpath = "//body/app-root/app-test-site/section[6]/div/div/div/div//footer/a")
	List <WebElement> cardsizegrid5;
	
	@FindBy(xpath ="//body/app-root/app-test-site/section[6]//header/p")
	List <WebElement> waitscard;
	
	//Courses Menu
	@FindBy(xpath = "//*[text()='Courses']")
	 WebElement clickoncoursemenu; 
	
	@FindBy(xpath = "//*[@class='hero is-medium']//h1")
	WebElement freecoursetextmessage;
	
	@FindBy(xpath = "//*[@class='hero is-small has-background-white-ter']//p")
	List <WebElement>  numberofcourses;
	
	//Products Menu
	
	@FindBy(xpath = "//*[text()='Product']")
	WebElement clickonproductsmenu;
	
	@FindBy (xpath = "//*[@class='title has-text-primary']")
	WebElement producttextmessage;
	
	@FindBy (xpath = "//*[@class='tile is-ancestor']//p[1]")
	List <WebElement> producttopics;
	
	public TC01_WorkSpacePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void cardsInFirstGrid() {
		workspaceButton.click();
		
		System.out.println("The count of cards in 1st grid is =" + inputcard.size());
		
		for(int a = 2; a<cardsizegrid1.size()+2; a++ )   
		{
			System.out.println(driver.findElement(By.xpath("//body/app-root/app-test-site/section["+a+"]//header/p")).getText());
		}
	}
		
//	public void cardsInSecondGrid() {
//		
//		System.out.println("The count of cards in 2nd grid is = " + framecard.size());
//		for (int b = 0; b < cardsizegrid2.size(); b++)
//		{
//		System.out.println(framecard.get(b).getText());
//		}
//	}	
//     public void cardsInThirdGrid() {
//		
//		System.out.println("The count of cards in 3rd grid is = " + dragcard.size());
//		for (int b = 0; b < cardsizegrid3.size(); b++)
//		{
//		System.out.println(dragcard.get(b).getText());
//		}
//     }	
//		public void cardsInFourthGrid() {
//			
//		System.out.println("The count of cards in 4th grid is = " + slidercard.size());
//		for (int b = 0; b < cardsizegrid4.size(); b++)
//		{
//		System.out.println(slidercard.get(b).getText());
//		}	
//     }
//		public void cardsInFifthGrid() {
//			
//			System.out.println("The count of cards in 5th grid is = " + waitscard.size());
//			for (int b = 0; b < cardsizegrid5.size(); b++)
//			{
//			System.out.println(waitscard.get(b).getText());
//			}	
//     }
//        
//		public void coursemenu() {
//			clickoncoursemenu.click();
//			System.out.println("This is the text message for the course menu = " +  freecoursetextmessage.getText());
//			System.out.println("The number of courses under coursemenu are = " + numberofcourses.size());
//			
//			for(int a = 0; a <numberofcourses.size(); a++ )
//			{
//				System.out.println(numberofcourses.get(a).getText());
//			}
//		}
//		
//		public void productsmenu() {
//			clickonproductsmenu.click();
//			System.out.println("The text message in the page = " + producttextmessage.getText());
//			System.out.println("The list of topics in product menu are = " + producttopics.size());
//			
//			for(int a = 0; a<producttopics.size(); a++) {
//				System.out.println(producttopics.get(a).getText());
//			}
//	}
}