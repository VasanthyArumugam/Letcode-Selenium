package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.BaseClass;
import Pages.TC00_HomeUiElementsPage;
import Pages.TC01_WorkSpacePage;
import Pages.TC02_InputPage;
import net.bytebuddy.implementation.bind.annotation.Super;

public class TC02_InputPageTest extends TC02_InputPage{
	
 	//Constructor method
	public TC02_InputPageTest() {
		super();
	}
	@Test
	public void inputFileds() throws InterruptedException {
		TC02_InputPage interactWithInputFields = new TC02_InputPage();
		boolean [] result = interactWithInputFields.Input();
		Assert.assertEquals(result[0], false);
		Assert.assertEquals(result[1], true);
	}

}
