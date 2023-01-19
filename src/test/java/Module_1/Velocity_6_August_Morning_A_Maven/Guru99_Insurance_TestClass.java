package Module_1.Velocity_6_August_Morning_A_Maven;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import library_files.Guru99_Insurance_BaseClass;
import library_files.Guru99_Insurance_UtilityClass;

import java.io.IOException;



public class Guru99_Insurance_TestClass extends Guru99_Insurance_BaseClass
{

	short TestCaseID;
	
	Guru99_Insurance_Login Login;
	Guru99_Insurance_BrokerInsuranceWebpage Login1;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException 
	{
		
		InitializeBrowser();
		
		Login=new Guru99_Insurance_Login(driver);
		
		Login1=new Guru99_Insurance_BrokerInsuranceWebpage(driver);
		
	}
	
	@BeforeMethod
	public void Login() throws IOException, InterruptedException 
	{
		
		Login.enterEmail(Guru99_Insurance_UtilityClass.GetDataFromPF("EM"));
		
		Thread.sleep(2000);
		
		Login.enterPassword(Guru99_Insurance_UtilityClass.GetDataFromPF("PSW"));
		
		Thread.sleep(2000);
		
		Login.clickLoginBtn();
		
		Thread.sleep(2000);
		
		
	}
	
	
	@Test
	public void TC1() throws EncryptedDocumentException, IOException 
	{
		TestCaseID=001;
		
		String ActualEmailAddress=Login1.VerifyEmail();	//sourabhdeshpande08@gmail.com
		
		String ExpectedEmailAddress=Guru99_Insurance_UtilityClass.GetDataFromExcelsheet(1, 0);	//sourabhdeshpande08@rediffmail.com
		
		Assert.assertEquals(ActualEmailAddress, ExpectedEmailAddress);
		
		
	}
	
	@AfterMethod
	public void Logout(ITestResult Result) throws InterruptedException, IOException 
	{
		
		if(Result.getStatus()==ITestResult.FAILURE) 
		{
			
			Guru99_Insurance_UtilityClass.CaptureScreenshot(driver,TestCaseID);
			
		}
		
		Login1.LogoutBtn();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		
		driver.close();
		
		
	}
	
	
}
