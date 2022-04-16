package MethodLibrary;

import java.io.File;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import Base.base;
import PageObject.Homepage;




public class Login_Library extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	WebDriver driver = null;
	WebDriverWait wait = null;

	Homepage lp = null;

	

	public Login_Library(WebDriver driver) throws IOException {

		this.driver = driver;

		lp = new Homepage(driver);
		

		//wait = new WebDriverWait(driver, 30);
	}

	public void browse() throws IOException {
		proper();
		log.info("Trying to launch the website");
		try { 
			
			driver.get(excel(0, 1, 0));
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
{
	proper();
	try {
		lp.Accountlist().click();
		getScreenshot("Login","login-click");
		log.info("clicked on accountlist btn");
		
		lp.Login_username().sendKeys(excel(0,1,1));
		log.info("entered the username");
		lp.continuebtn().click();
		lp.Password().sendKeys(excel(0,1,2));
		log.info("entered the PWD"); 
		lp.signinbtn().click();
		getScreenshot("Login","HOMEPAGE");
		log.info("Home of application");
	}
	catch(Exception e ) {
		e.printStackTrace();
		log.error("Not clicked on login btn");
	}
}
	}
