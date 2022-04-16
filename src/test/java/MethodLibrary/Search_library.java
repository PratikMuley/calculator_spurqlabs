package MethodLibrary;

import java.io.File;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



import Base.base;
import PageObject.Homepage;
import PageObject.mobile;
import junit.framework.Assert;




public class Search_library extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	WebDriver driver = null;
	//WebDriverWait wait = wait = new WebDriverWait(driver, 30);

	Homepage lp = null;
	mobile m = null;



	public Search_library(WebDriver driver) throws IOException {

		this.driver = driver;

		lp = new Homepage(driver);

		m = new mobile(driver);
		
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

	public void search() throws IOException 
	{
		proper();
		try {
			WebElement s =lp.searchbox();
			s.sendKeys(prop.getProperty("searchvalue"));
			getScreenshot("search","search-mobiles");
			log.info("Entering data for searching");
			s.sendKeys(Keys.ENTER);
			getScreenshot("search","mobiles_page");

		}
		catch(Exception e ) {
			e.printStackTrace();
			log.error("Not Entering data for searching");
		}
	}
	WebElement actual;
	String a;
	public void select_mobiles() throws IOException 
	{
		proper();
		try {

			lp.Text("Eligible for Pay On Delivery").click();;
			log.info("Eligible for Pay On Delivery");
			lp.Text("Smartphones").click();
			log.info("smartphones");
			lp.Text("Redmi").click();
			log.info("redmi select");
			lp.Text("32 GB").click();
			log.info("32 gb select");
			//lp.Sortby().click();
			Thread.sleep(1000);
			//	  lp.Text("Price: High to Low").click(); 
			actual=  m.selectmobile();//lp.Text("Redmi K20 Pro (Carbon Black, 8GB RAM, 256GB Storage)");

			a= actual.getText(); 
			System.out.println(a);
			//actual.click();

		}
		catch(Exception e ) {
			e.printStackTrace();
			log.error("Not Entering data for searching");
		}
	}
	WebElement expected;
	public void Validation_mobile() throws IOException 
	{
		proper();
		try {

			
			String w = driver.getWindowHandle(); 
			driver.switchTo().window(w);
			
			expected = m.productname();

			String e=expected.getText();
			System.out.println(e);
			Assert.assertEquals(a, e );
			log.info("validation of mobile");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");


			m.addtocartBtn().click();			
			log.info("addtocart");
			getScreenshot("mobile","addtocart");
		}
		catch(Exception e ) {
			e.printStackTrace();
			log.error("Not validated");
		}
	}


}
