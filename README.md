# WebApp Automation Framework with Parallel Execution using TestNG

[![N|Solid](http://www.seleniumhq.org/images/selenium-logo.png)](http://www.seleniumhq.org/) 

This is a Selenium Hybrid Framework.
 - Written in **JAVA**
 - Implemented using **TestNG**
 - Build Toold - Maven
 - Implemented Page Object Model Design Pattern
 - Excel TestNG @DataProvider
 - WebDriver Manager - Auto Download of required drivers. 
 - AShot - Captures Entire Webpage Screenshot

### Browsers Supported
 - Mozilla Firefox
 - Google Chrome
 - Internet Explorer
 - Opera
 - Microsoft Edge

### Headerless Support
 - HTMLUnit
 - Chrome Headless
 - Phantom JS

### Platform Support
 - Windows

---
### Reporting
 - [Allure Reporting](http://allure.qatools.ru/)
 
---
### Usage
```sh
$ git clone https://github.com/GladsonAntony/WebAutomation_AllureWDM.git
$ mvn clean test
```
---
### Browser Setup
 - Navigate to *testng.xml* change *value* for the parameter type *browser*

---
### URL Setup
- Navigate to *testng.xml* change *value* for the parameter type *url*

---
### Parallel Execution
- Navigate to *testng.xml* change *thread-count* and *data-provider-thread-count* values.

---
### Report Generation
```sh
$ mvn site
```
Navigate to /target/site/allure-maven-plugin.html
 - Supported Only on Mozilla Firefox
 
To Open Results in other Browsers do
```sh
$ mvn jetty:run -Djetty.http.port=9988
```
---

### @DataProviders

**__Method 1:__** 
 - Use **TestData.xlsx** file as your dataproviders. The Sheet Name should be the name of your Method Name.
 - To use different xlsx file, Create a new `@DataProvider` method and change the workbook name.
```java
@DataProvider(name="multiSheetExcelRead", parallel=true)
public static Object[][] multiSheetExcelRead(Method method) throws Exception
{
	File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
	String SheetName = method.getName();
	System.out.println(SheetName);
	Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
	return testObjArray;
}
```

**__Method 2:__**
 - Create Excel Workbook with the same name as your method Name.
```java
@DataProvider(name="excelSheetNameAsMethodName",parallel=true)
public static Object[][] excelSheetNameAsMethodName(Method method) throws Exception
{
	File file = new File("./src/test/resources/Excel Files/"+method.getName()+".xlsx");
	Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath());
	return testObjArray;
}
 ```
 ---
 
 ### @DataProvider Usuage
 
__To Use Method Name as Excel Workbook Name, Use the following:__
```java
@Test(dataProvider="excelSheetNameAsMethodName", dataProviderClass=ExcelDataProvider.class)
```

__To use a Single Workbook with multiple `@DataProvider`sheets, Use:__

~~NOTE~~:SheetName should be same name as Method Name
```java
@Test(dataProvider="multiSheetExcelRead", dataProviderClass=ExcelDataProvider.class)
```
