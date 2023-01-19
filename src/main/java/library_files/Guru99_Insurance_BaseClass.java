package library_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Insurance_BaseClass 
{

	public WebDriver driver;
	
	public void InitializeBrowser() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","G:\\Velocity Institute Documents\\Java\\ChromeDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	
}
