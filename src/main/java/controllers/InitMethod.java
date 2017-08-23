/**
 * 
 */
package controllers;

import java.awt.Robot;
import java.io.File;
import java.net.URI;

import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

/**
 * @Author Gladson Antony
 * @Date 28-Jan-2017
 */
public class InitMethod 
{
	public static String WebsiteURL;
	public static String Browser;
	
	public static String FS = File.separator;

	public static String OSName = System.getProperty("os.name");
	public static String OSArchitecture = System.getProperty("os.arch");
	public static String OSVersion = System.getProperty("os.version");
	public static String OSBit = System.getProperty("sun.arch.data.model");

	public static String ProjectWorkingDirectory = System.getProperty("user.dir");
	
	public static String Drivers = "./src/main/resources/Drivers";
	
	public static String ExcelFiles = "./src/test/resources/Excel Files/";
	public static String TestData = "./src/test/resources/TestData/";
	public static String PropertiesFiles = "./src/test/resources/Properties Files";
	public static String Reports = "./src/test/resources/Reports";
	
	public static Robot re;
	public static Alert al;
	public static String robotImageName;
	public static Select se;
	public static String FileToUpload;
	public static Actions ac;
	public static String VideoName;
	public static ScreenRecorder ScreenRec;
	public static ITestResult testResult;
	public static SoftAssert softAssert;
	public static WebDriver augmentedDriver;
	public static ITestResult result;
	public static URI uri;
	public static ScreenRecorder screenRecorder;
	
}
