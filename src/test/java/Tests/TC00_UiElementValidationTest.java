package Tests;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.BaseClass;
import Pages.TC00_HomeUiElementsPage;
import Pages.TC01_WorkSpacePage;
import Pages.TC02_InputPage;
import net.bytebuddy.implementation.bind.annotation.Super;

public class TC00_UiElementValidationTest extends BaseClass{
	
	public static Properties prop ;
 	//Constructor method
	public TC00_UiElementValidationTest() {
		super();
	}
	
	@Test (priority = 1)//(groups = {"smoke","sanity"})
	public void uiHeadervalidation() throws InterruptedException {
		TC00_HomeUiElementsPage homePage = new TC00_HomeUiElementsPage();
		homePage.homepageHeaderButtonValidation();
		homePage.homepageTitleAndSubTitleValidation();
		boolean[] subMenus = homePage.homepageSubMenuValidation();
		Assert.assertEquals(subMenus[0], true);
		Assert.assertEquals(subMenus[1], true);
		Assert.assertEquals(subMenus[2], true);
		Assert.assertEquals(subMenus[3], true);
		Assert.assertEquals(subMenus[4], true);
		Assert.assertEquals(subMenus[5], true);
		Assert.assertEquals(subMenus[6], true);
		Assert.assertEquals(subMenus[7], true);
		Assert.assertEquals(subMenus[8], true);
		Assert.assertEquals(subMenus[9], true);
		Assert.assertEquals(subMenus[10], true);
		Assert.assertEquals(subMenus[11], true);
	}
	@Test(priority =2 )
	public void footerValidation() {
		
		TC00_HomeUiElementsPage footerval = new TC00_HomeUiElementsPage();
		
		boolean[] footer = footerval.homePageFooterDetailsValidation();
		Assert.assertEquals(footer[0],true);
		Assert.assertEquals(footer[1],true);
		
	}
 	/*@Test
	public void workspacemenuValidation() {
		TC01_WorkSpacePage workspace = new TC01_WorkSpacePage();
		workspace.cardsInFirstGrid();
		workspace.cardsInSecondGrid();
		workspace.cardsInThirdGrid();
		workspace.cardsInFourthGrid();
		workspace.cardsInFifthGrid();
	}
	@Test
    public void courseMenuValidation() {
    	
    	TC01_WorkSpacePage course = new TC01_WorkSpacePage();
    	//course.coursemenu();
    }	
   
	@Test
	public void productmenuValidation(){
		
		TC01_WorkSpacePage product = new TC01_WorkSpacePage();
    	product.productsmenu();*/
	
	}



