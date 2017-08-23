/**
 * 
 */
package controllers;

import java.io.File;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import utils.ExcelUtils;

/**
 * @Author Gladson Antony
 * @Date 21-Feb-2017
 */
public class ExcelDataProvider extends InitMethod
{
	@DataProvider(name="multiSheetExcelRead", parallel=true)
	public static Object[][] multiSheetExcelRead(Method method) throws Exception
	{
		File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
		String SheetName = method.getName();
		System.out.println(SheetName);
		Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
		return testObjArray;
	}
	
	@DataProvider(name="excelSheetNameAsMethodName",parallel=true)
	public static Object[][] excelSheetNameAsMethodName(Method method) throws Exception
	{
		File file = new File("src/test/resources/Excel Files/"+method.getName()+".xls");
		System.out.println("Opening Excel File:" +file.getAbsolutePath());
		Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath());
		return testObjArray;
	}
}
