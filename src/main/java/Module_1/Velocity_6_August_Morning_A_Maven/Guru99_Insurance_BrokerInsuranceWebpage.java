package Module_1.Velocity_6_August_Morning_A_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_Insurance_BrokerInsuranceWebpage 
{

	
	@FindBy(xpath="//h4[text()='sourabhdeshpande08@gmail.com']") private WebElement SignedInAs;
	
	@FindBy(xpath="(//input[@type='submit'])[1]") private WebElement LogoutBtn;
	
	
	
	public Guru99_Insurance_BrokerInsuranceWebpage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String VerifyEmail() 
	{
		
		String ActualEmail=SignedInAs.getText();	//sourabhdeshpande08@gmail.com
		
		return ActualEmail;
		
	}
	
	public void LogoutBtn() 
	{
		
		LogoutBtn.click();
		
		
	}
	
	
}
