package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mobile {

	public WebDriver driver;


	public mobile(WebDriver driver) {

		this.driver = driver;

	}
	
	By productname = By.xpath("//*[@id='productTitle']");
	By selectmobile= By.xpath("(//*[contains(@class,'a-link-normal')])[4]");
	By addtocartBtn = By.id("add-to-cart-button");
	public WebElement addtocartBtn()
	{
		return driver.findElement(addtocartBtn);
	}
	public WebElement productname()
	{
		return driver.findElement(productname);
	}
	public WebElement selectmobile()
	{
		return driver.findElement(selectmobile);
	}
}