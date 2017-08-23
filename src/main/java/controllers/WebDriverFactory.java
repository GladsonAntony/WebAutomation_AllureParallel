/**
 * 
 */
package controllers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * @Author Gladson Antony
 * @Date 08-Feb-2017
 */
public class WebDriverFactory extends BrowserFactory
{
	public static ThreadLocal<WebDriver> wd = new ThreadLocal<WebDriver>();

	@Parameters({ "browser" , "url" })
	@BeforeMethod
	public void beforeMethod(String browser, String url) throws Exception
	{		
		InitMethod.Browser=browser;
		InitMethod.WebsiteURL=url;
		System.out.println("Browser: "+browser);
		System.out.println("WebsiteURL: "+url);
		new WebDriverFactory();
		WebDriver driver = WebDriverFactory.createDriver(browser,url);
		setWebDriver(driver);
	}

	public void setWebDriver(WebDriver driver) 
	{
		wd.set(driver);
	}

	public static WebDriver getWebDriver() 
	{
		return wd.get();
	}

	@AfterMethod
	public void afterMethod() throws Exception
	{
		Thread.sleep(2000);
		getWebDriver().quit();	
	}


}
