package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import OR.loginOR;
import Utils.Screencapture;

@Test
public class loginTC extends Rediff_PreRequisite{
	
	
	public void login() throws Exception {
		Super();
		Thread.sleep(200);
		
		loginOR obj = new loginOR();
		obj.userid().sendKeys("Username");
		obj.pass().sendKeys("password");
		Thread.sleep(200);
		Screencapture("Credentials entered successfully");
		obj.submit();
		
		
		/*
		w.findElement(By.cssSelector("#login1")).sendKeys("Xyz");
		//w.findElement(By.xpath("//*[@id='login1']")).sendKeys("abc");
		w.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("xyz");
		Thread.sleep(200);
		Screencapture("Credentials entered successfully");
		//w.findElement(By.name("proceed")).click();
		//customized CSS
		w.findElement(By.cssSelector("[name='proceed']")).click();*/
		
		//w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//w.quit();
	}
	private void Super() {
		// TODO Auto-generated method stub
		
	}
	
}
