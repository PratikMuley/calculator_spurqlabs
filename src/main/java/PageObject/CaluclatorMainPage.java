package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaluclatorMainPage {

public WebDriver driver;
	
	
	public CaluclatorMainPage(WebDriver driver) {

		this.driver = driver;

	}
	

	By Multi_N0=By.xpath("//*[text()='0']");
	By Multi_N1=By.xpath("//*[text()='1']");
	By Multi_N2=By.xpath("(//*[text()='2'])[2]");
	By Multi_N3=By.xpath("(//*[text()='3'])[3]");
	By Multi_N4=By.xpath("//*[text()='4']");
	By Multi_N5=By.xpath("//*[text()='5']");
	By Multi_N6=By.xpath("//*[text()='6']");
	By Multi_N7=By.xpath("//*[text()='7']");
	By Multi_N8=By.xpath("//*[text()='8']");
	By Multi_N9=By.xpath("//*[text()='9']");
	
	By Multi_sign = By.xpath("//*[text()='×']");
	By Equal_sign = By.xpath("//*[text()='=']");
	By Add_sign = By.xpath("//*[text()='+']");
	By Div_sign = By.xpath("//*[text()='/']");
	By Sub_sign = By.xpath("//*[text()='–']");
	By allClr_sign = By.xpath("//*[text()='AC']");
	
By input = By.xpath("//*[@id='sciInPut']");
	By result = By.xpath("//*[@id='sciOutPut']");

	public WebElement Div_sign() {
		return driver.findElement(Div_sign);
	}

	public WebElement AllClr_sign() {
		return driver.findElement(allClr_sign);
	}

	public WebElement Input() {
		return driver.findElement(input);
	}
	
	public WebElement result() {
		return driver.findElement(result);
	}
	
	public WebElement Addsign() {
		return driver.findElement(Add_sign);
	}
	
	public WebElement Subsign() {
		return driver.findElement(Sub_sign);
	}
	
	public WebElement Multi_sign() {
		return driver.findElement(Multi_sign);
	}
	public WebElement Equal_sign() {
		return driver.findElement(Equal_sign);
	}
	
	
	public WebElement Multi_N0() {
		return driver.findElement(Multi_N0);
	}
	public WebElement Multi_N1() {
		return driver.findElement(Multi_N1);
	}
	public WebElement Multi_N2() {
		return driver.findElement(Multi_N2);
	}
	public WebElement Multi_N3() {
		return driver.findElement(Multi_N3);
	}
	public WebElement Multi_N4() {
		return driver.findElement(Multi_N4);
	}
	public WebElement Multi_N5() {
		return driver.findElement(Multi_N5);
	}
	public WebElement Multi_N6() {
		return driver.findElement(Multi_N6);
	}
	public WebElement Multi_N7() {
		return driver.findElement(Multi_N7);
	}
	public WebElement Multi_N8() {
		return driver.findElement(Multi_N8);
	}
		
	public WebElement Multi_N9() {
		return driver.findElement(Multi_N9);
	}
}

