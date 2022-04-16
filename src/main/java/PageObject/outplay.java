package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class outplay {
WebDriver driver;

public outplay(WebDriver driver) {
	this.driver=driver;
}

By username = By.xpath("//*[@autocomplete='username']");
By loginbtn = By.xpath("//*[@type='submit']");
By pwd  = By.xpath("//*[@type='password']");
By prospects = By.xpath("(//a[contains(@class,'side-menu-icon')])[4]");
By checkbox = By.xpath("(//*[@class='CheckedMark'])[2]");
By drpdwn = By.xpath("(//*[@class='dropdown'])[2]");
By delete = By.xpath("//*[text()='Delete']");

public WebElement Username() {
	return driver.findElement(username);
}
public WebElement Delete() {
	return driver.findElement(delete);
}
public WebElement dropdown() {
	return driver.findElement(drpdwn);
}
public WebElement Checkboxselection() {
	return driver.findElement(checkbox);
}
public WebElement Prospects() {
	return driver.findElement(prospects);
}
public WebElement Loginbtn() {
	return driver.findElement(loginbtn);
}
public WebElement Password() {
	return driver.findElement(pwd);
}
}
