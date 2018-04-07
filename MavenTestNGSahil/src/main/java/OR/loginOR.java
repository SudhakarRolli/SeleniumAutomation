package OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScripts.Rediff_PreRequisite;

public class loginOR extends Rediff_PreRequisite{
	
	By username = By.id("login1");
	By password = By.id("password");
	
	public WebElement userid()
	{
		return w.findElement(username);
	}
	
	public WebElement pass()
	{
		return w.findElement(password);
	}
	
	public void submit()
	{
		w.findElement(By.name("proceed")).click();
	}

}
