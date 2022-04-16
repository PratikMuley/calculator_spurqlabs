package MethodLibrary;

import java.io.File;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



import Base.base;
import PageObject.Homepage;
import PageObject.mobile;
import PageObject.outplay;
import junit.framework.Assert;




public class outplay_library extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	WebDriver driver = null;
	WebDriverWait wait = null;

	outplay op = null;


	public outplay_library(WebDriver driver) throws IOException {

		this.driver = driver;

				//wait = new WebDriverWait(driver, 10);
				op = new outplay(driver);
	}

	public void browse() throws IOException {
		proper();
		log.info("Trying to launch the website");
		try {
			driver.get(prop.getProperty("url"));
			//driver.get("https://www.calculator.net/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			

			getScreenshot("Homepage","Browse");
			

			log.info("Successfully launched the website");
		} catch (Exception e) {

			e.printStackTrace();
			log.fatal("Site not launched");

		}
	}
	public void login() throws IOException
	{proper();
		WebElement e = op.Username();
		e.sendKeys(prop.getProperty("username"));
		e.sendKeys(Keys.ENTER);
		op.Password().sendKeys(prop.getProperty("pwd"));
		
		op.Loginbtn().click();
		
	}
	public void  prospects()
	{
		op.Prospects().click();
		op.Checkboxselection().click();
		op.dropdown().click();
		op.Delete().click();
	
		driver.switchTo().alert().accept();
	}

	}
