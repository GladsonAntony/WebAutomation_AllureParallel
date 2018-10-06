/**
 * 
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.RandomGenerator;

/**
 * @author ${Gladson Antony}
 * @date Sep 17, 2016
 * 
 */
public class GoogleHomePageObjects extends PageFactoryInitializer
{
	@FindBy(xpath="//a[text()='Gmail']")
	private WebElement GmailLink;

	@FindBy(id="lst-ib")
	private WebElement SearchBox;

	@Step("Click On Gmail Link in the Google Home Page")
	public GoogleHomePageObjects clickonGmailLink() throws Exception
	{
		click(GmailLink);
		return this;		
	}

	@Step("Enter text into the Search Box")
	public GoogleHomePageObjects enterTextToSearchBox() 
	{
		SearchBox.sendKeys(RandomGenerator.GenerateRandomEMAILIDs("google.com"));
		return this;	
	}

	@Step("Verify the Page Title of the Google Home Page")
	public GoogleHomePageObjects verifyPageTitle() throws Exception 
	{
		return this;
	}

}
