package Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screencapture {
	static WebDriver w;

	public Screencapture(String StrName) throws Exception
	  {
		//How to take screenshot
		TakesScreenshot ts = (TakesScreenshot)w;//It is an interface
				
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\HP\\eclipse-workspace\\MavenTestNGSahil\\src\\main\\resources\\Screenshots\\"+StrName+".png"));
		  
	  }
}
