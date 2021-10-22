package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.BaseClass;
import Pages.TC00_HomeUiElementsPage;
import Pages.TC02_InputPage;
import Pages.TC03_ButtonPage;

public class TC03_ButtonPageTest extends BaseClass{
	
//	TC03_ButtonPage letCodeHomePage1;
	public TC03_ButtonPageTest() {
		super();
	}
		
	@Test
	public void buttonCardValidation() throws InterruptedException {
	TC03_ButtonPage buttoncard = new TC03_ButtonPage();
	boolean result = buttoncard.button();
	Assert.assertEquals(result, true);

}
}