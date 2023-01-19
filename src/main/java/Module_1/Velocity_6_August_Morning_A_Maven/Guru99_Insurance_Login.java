package Module_1.Velocity_6_August_Morning_A_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_Insurance_Login 
{

	//POM-I
	
	@FindBy(xpath="//input[@id='email']") private WebElement Email;		//private WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	
	@FindBy(xpath="//input[@id='password']") private WebElement Password;		//private WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	
	@FindBy(xpath="//input[@type='submit']") private WebElement LoginBtn;		//private WebElement LoginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
	
	
	public Guru99_Insurance_Login(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterEmail(String EMailID) 
	{
		
		Email.sendKeys(EMailID);
		
	}
	
	public void enterPassword(String Pass) 
	{
		
		Password.sendKeys(Pass);
		
	}
	
	public void clickLoginBtn() 
	{
		
		LoginBtn.click();
		
	}
	
}
