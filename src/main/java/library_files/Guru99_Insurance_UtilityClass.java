package library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Guru99_Insurance_UtilityClass 
{

	
	
	@Test
	public static String GetDataFromPF(String Key) throws IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Saisou1617\\eclipse-workspace\\6_Aug_A_Morning_Selenium\\PropertyFile.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String Value=prop.getProperty(Key);
		
		
		return Value;
		
	}
	
	@Test
	public static String GetDataFromExcelsheet(int Row,int Cell) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("G:\\Velocity Institute Documents\\Java\\Demo_Sheet.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet4");
				
		String Value1=Sh.getRow(Row).getCell(Cell).getStringCellValue();
		
		return Value1;
				
		
	}
	
	@Test
	public static void CaptureScreenshot(WebDriver driver,int TestCaseID) throws IOException 
	{
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("G:\\Velocity Institute Documents\\Java\\"+TestCaseID+".jpg");
		
		FileHandler.copy(Source, Destination);

		
	}
	
	
	
	
}
