package test_Class;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aPOM_Classes.CategoryPOM;
import aPOM_Classes.Decontamination;
import aPOM_Classes.HomePage;
import aPOM_Classes.Instrument;
import aPOM_Classes.Login_PagePOM1;
import base_clases.Base_class1;
import utility_package.Utility_class;

public class Kiwimed_Flow_Validation extends Base_class1 {
	Login_PagePOM1 Loginage;
	HomePage homepageobj;
	String TCID;
	CategoryPOM category;
	Instrument instrumentPOM;
	Decontamination Decon;
	JavascriptExecutor js;

	@BeforeClass

	public void LaunchBrowser() {

		launchingBrowser(); 
		
		// we can also dorecrly mention the method
//LoginValidation testobject =new  LoginValidation();//and also by using the inheritance principle
//testobject.LaunchBrowser();

		Loginage = new Login_PagePOM1(driver);
		homepageobj = new HomePage(driver);
		category = new CategoryPOM(driver);
		instrumentPOM = new Instrument(driver);
		Decon = new Decontamination(driver);
	    js = (JavascriptExecutor) driver;

	}

	@BeforeMethod
	public void LaunchingURL() throws IOException, InterruptedException {

		URL_Access();

		// entering the User name

		
		  
		  WebElement Usernames =Loginage.usernameElement();
		  js.executeScript("arguments[0].style.backgroundColor = 'yellow'", Usernames);
		  Thread.sleep(500); 
		  js.executeScript("arguments[0].style.backgroundColor = ''", Usernames);
		  
		 
		
		//Loginage.highlight();
		

		Loginage.SendUsername(Utility_class.GetPropertyFileData("Username"));
		Thread.sleep(500);

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

		// Entering the password
		Loginage.Passwords(Utility_class.GetPropertyFileData("Password"));
		Thread.sleep(500);

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

		// Loginage.ClickLoginButton();

		Actions act9 = new Actions(driver);
		WebElement Loggingbutton = Loginage.ClickLoginButtonByactionclass();
		System.out.println(Loggingbutton);
		act9.click(Loggingbutton).perform();

//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
//FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
//.withTimeout(Duration.ofSeconds(30))
//.pollingEvery(Duration.ofMillis(500))
//.ignoring(NoSuchElementException.class);
		
		 
		 
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(35000));
		Reporter.log("The user successfully logged in to the application");
	}

@Test
	public void Total_Flow_() throws IOException, InterruptedException {
		TCID = "KIWIMED02";

		// Access to category module//
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		category.AccessToCategoryModule(); // (//a[@class='active'])[3]
		Thread.sleep(2000);

		category.Cretae_New();
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		category.CategoryName();
		Thread.sleep(200);

//      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		category.Descriptions();
		Thread.sleep(200);
//     
//      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//     
		category.SubcategoryName();
		Thread.sleep(200);

//     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		category.AddsubcatBOX();
		Thread.sleep(200);
		Reporter.log("Adding subcategory");

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		category.SubcategoryName2();
		Thread.sleep(200);
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		category.SavecategoryClick();
		Thread.sleep(2000);
		Reporter.log("Click on save category button sucessfull");

// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//     
// try
//   
//.OKpopupClick();
// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
// }
// catch (Exception e)
// {
// System.out.println("category same name not allowed");
// }
//finally{
//    
		category.CancelPOPclick();
		Thread.sleep(2000);
		Reporter.log("Category pop up handled ");
//     
// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//         
//   
//category.CancelbuttonCategory();
//Thread.sleep(10000);
		
		
		

		// Access to instrument module//
		System.out.println("Accesssing to instrument master");
		System.out.println("==================================");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		instrumentPOM.AcccessToInstrumentModule();
		Thread.sleep(4000);
		Reporter.log("Acccess to Instrument Module successfully");

//   // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		instrumentPOM.ClickCreateNewInstrumentButton();
		Thread.sleep(2000);

//  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

//instrumentPOM.DropdownClick();

		instrumentPOM.dropdownInventoryType();
		Thread.sleep(300);

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));   
//    
		instrumentPOM.CategoryDropDown();
		Thread.sleep(300);
//    
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//    
		instrumentPOM.Subcategory();
		Thread.sleep(300);

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//    
		instrumentPOM.SendInstrumentName();
		Thread.sleep(300);

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		instrumentPOM.SterilizationID();
		Thread.sleep(300);

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		instrumentPOM.Expiry();
		Thread.sleep(300);

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		instrumentPOM.VendorNmae();
		Thread.sleep(500);

		instrumentPOM.SelectVendorNames();
		Thread.sleep(300);

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		instrumentPOM.ClickPurchaseBy();
		Thread.sleep(300);

//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		instrumentPOM.SelectPurchaseBy();
		Thread.sleep(300);

// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//    
//instrumentPOM.ClickOndatepicker();
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));    
// instrumentPOM.ClickOnDate();
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//    
		instrumentPOM.ClickONCancelButton();
		Thread.sleep(2000);

		Reporter.log("Exit from Instrument Module successfully");

		// Alert pop up handling//

		Alert alert = driver.switchTo().alert(); // switch to alert
		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(5000);

		// Decontamination flow//
		// Receiving Items//

		Decon.Click_On_Decontamination();
		Thread.sleep(1000);

		Decon.Click_On_Receive();
		Thread.sleep(1000);

		Decon.Scan_InstrumentID();
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);

		Decon.Enter_To_submit();
		Thread.sleep(3000);
		Reporter.log("Item received successfully");

		// Cleaning the items//

		// Disinfection loading//

		Decon.Click_On_Decontamination();
		Thread.sleep(2000);

		Decon.Disinfection_loading();
		Thread.sleep(2000);

		Decon.Scan_Machin_ID_To_Load();
		Actions act2 = new Actions(driver);
		act2.sendKeys(Keys.ENTER).perform(); // machine loaded
		Thread.sleep(2000);

		Decon.Scan_Machin_ID_to_submit(); // scanning machine ID to submit.to load the machine
		Actions act3 = new Actions(driver);
		act3.sendKeys(Keys.ENTER).perform();
		Decon.Confirmationpopup(); // Washer loading complete
		Thread.sleep(3000);

		Reporter.log(" washer machine loaded successfully");

		// Washer machine unloading//

		Decon.Click_On_Decontamination();
		Thread.sleep(2000);

		Decon.Disinfection_Unload();
		Thread.sleep(2000);

		Decon.Scan_Machin_ID_AT_UnLoadingScreen(); // scanning machine at unloading
		Thread.sleep(2000);

		Actions act4 = new Actions(driver);
		act4.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		Decon.ConfirmationPopUPAtUnloading();
		Thread.sleep(2000);

		Decon.UploadingFIleAtDisinfection(); // uploading the result file
		Thread.sleep(2000);

		Decon.ProceedToUnloadSCreen();
		Thread.sleep(2000);

		Decon.Scan_Machin_ID_To_Unoad_Washer(); // To unload the washer machine
		Thread.sleep(1000);

		Actions act5 = new Actions(driver);
		act5.sendKeys(Keys.ENTER).perform();
		Thread.sleep(40000);
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Reporter.log(" Washer machine Unloaded successfully");

		// Controll and packing
		// Sterilizer loading

		// Decon.ClickOnControlAndPacking();

		Actions act10 = new Actions(driver);
		WebElement ClickcontrolANdPAcking = Decon.ClickOnControlAndPackingByACtionClass();
		act10.click(ClickcontrolANdPAcking).perform(); // click on control and packing
		Thread.sleep(3000);

		Decon.ClickOnLoadSterilizer();
		Thread.sleep(3000);

		Decon.Scan_Machin_ID_At_SterilizerScreen();
		// Decon.ActionEnter();
		Actions Enter = new Actions(driver);
		Enter.sendKeys(Keys.ENTER).perform();

		Decon.Scan_Sterilizer_Machin_ID_TO_Submit();
		Actions Enter2 = new Actions(driver);
		Enter2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);

		WebElement ConFirmationPOP = Decon.ActionConfirmationPopUpSterilizer();
		act10.click(ConFirmationPOP).perform();
		Thread.sleep(8000);

		Reporter.log("Sterilizer machine loaded successfully");

		Decon.MovingToEquipmentLogging();
		Thread.sleep(2000);
		Reporter.log(" Directing to equipment logging screen successfully, test case passed ");

	}

@AfterMethod

	public void FailedTestCasescreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Utility_class.takescreenshot(driver, TCID);
		}

		if (result.getStatus() == ITestResult.SUCCESS) {
			Utility_class.takescreenshot2(driver, TCID);
		}

	}

}
