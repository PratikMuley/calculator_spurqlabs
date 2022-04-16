package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;


	public Homepage(WebDriver driver) {

		this.driver = driver;

	}
	
	By accountlist= By.xpath("//*[text()='Account & Lists']");
	By loginusername =By.name("email");
	By countinue = By.id("continue");
	By pwd= By.name("password");
	By signinbtn= By.id("signInSubmit");
	
	////////////////////////////////////////Search///////////////////////////
	
	By searchbox = By.id("twotabsearchtextbox");
	
	
	
	
	By sortby= By.xpath("(//*[@class='a-button-inner'])[1]");
	
	
	
	public WebElement Sortby()
	{
		return driver.findElement(sortby);
	}
	
	
	
	public WebElement Text(String  s)
	{
		
		return driver.findElement(By.xpath("//*[text()='"+s+"']"));
	}
	
	public WebElement selection(int   index)
	{
		
		return driver.findElement(By.xpath("(//*[contains(@class,'a-link-normal')])["+index+"]"));
	}
	
	
	
	
	
	
	public WebElement searchbox()
	{
		return driver.findElement(searchbox);
	}
	
	public WebElement Password()
	{
		return driver.findElement(pwd);
	}
	
	
	public WebElement continuebtn()
	{
		return driver.findElement(countinue);
	}
	
	public WebElement Accountlist()
	{
		return driver.findElement(accountlist);
	}	
	
	
		public WebElement signinbtn()
	{
		return driver.findElement(signinbtn);
	}
	public WebElement Login_username()
	{
		return driver.findElement(loginusername);
	}
}