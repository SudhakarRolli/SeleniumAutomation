package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
//import org.apache.commons.*;

public class Rediff_Login {
	public static WebDriver w;
	@Test
	public void login() throws Exception
	{
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\MavenTestNGSahil\\src\\main\\resources\\DataMap\\data.property");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Java_Project\\ExecutableFiles\\chromedriver.exe");
		 w = new ChromeDriver();
		w.get(prop.getProperty("url"));
		Thread.sleep(200);
		Screencapture("URL launched successfully");
		//customized CSS
		w.findElement(By.cssSelector("#login1")).sendKeys("Xyz");
		//w.findElement(By.xpath("//*[@id='login1']")).sendKeys("abc");
		w.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("xyz");
		Thread.sleep(200);
		Screencapture("Credentials entered successfully");
		//w.findElement(By.name("proceed")).click();
		//customized CSS
		w.findElement(By.cssSelector("[name='proceed']")).click();
		//w.navigate().back();
		w.findElement(By.partialLinkText("Forgot")).click();
		
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		w.quit();
	}
	
	public static void Screencapture(String StrName) throws Exception
	  {
		//How to take screenshot
		TakesScreenshot ts = (TakesScreenshot)w;//It is an interface
				
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\HP\\eclipse-workspace\\MavenTestNGSahil\\src\\main\\resources\\Screenshots\\"+StrName+".png"));
		  
	  }
	
}
