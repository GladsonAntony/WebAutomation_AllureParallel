/**
 * 
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.qameta.allure.Step;
import pageObjects.initializePageObjects.PageFactoryInitializer;

/**
 * @author Gladson Antony
 * @date Sep 17, 2016
 * 
 */
public class GMailPageObjects extends PageFactoryInitializer
{
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailIDTextBox;
	
	@FindBy(xpath="//input[@id='next']")
	private WebElement nextButton;

	@Step("To Enter Email ID and Click Next Button")
	public GMailPageObjects enterEmailID(String emailID) 
	{
		emailIDTextBox.sendKeys(emailID);	
		nextButton.click();
		return this;
	}

	@Step("Verify the Page Title of the GMail Page")
	public GMailPageObjects verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "gagagasgasg");
		return this;
	}
	
	
	
}
