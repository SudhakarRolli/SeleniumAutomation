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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Screencapture;
//import org.apache.commons.*;

public class Rediff_PreRequisite{
	public static WebDriver w;
	@BeforeTest
	public void Setup() throws Exception
	{
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\MavenTestNGSahil\\src\\main\\resources\\DataMap\\data.property");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Java_Project\\ExecutableFiles\\chromedriver.exe");
		 w = new ChromeDriver();
		 w.manage().window().maximize();
		w.get(prop.getProperty("url"));
		Thread.sleep(200);
		Screencapture("URL launched successfully");
	}
	

	public void Screencapture(String StrName) throws Exception
	  {
		//How to take screenshot
		TakesScreenshot ts = (TakesScreenshot)w;//It is an interface
				
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\HP\\eclipse-workspace\\MavenTestNGSahil\\src\\main\\resources\\Screenshots\\"+StrName+".png"));
		  
	  }
	
}
