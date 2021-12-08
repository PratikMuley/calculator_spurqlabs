package MethodLibrary;

import java.io.File;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.base;
import PageObject.CaluclatorMainPage;




public class FunctionLibrary extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	WebDriver driver = null;
	WebDriverWait wait = null;

	CaluclatorMainPage lp = null;



	public FunctionLibrary(WebDriver driver) throws IOException {

		this.driver = driver;

		lp = new CaluclatorMainPage(driver);

		wait = new WebDriverWait(driver, 30);
	}

	public void browse() throws IOException {
		proper();
		log.info("Trying to launch the website");
		try {
			driver.get(prop.getProperty("url"));
			//driver.get("https://www.calculator.net/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Thread.sleep(2000);

			getScreenshot("Browse");

			log.info("Successfully launched the website");
		} catch (Exception e) {

			e.printStackTrace();
			log.fatal("Site not launched");

		}
	}



	public void Mul() {
		// TODO Auto-generated method stub

		try {
			lp.Multi_N4().click();

			lp.Multi_N2().click();
			//	log.info("Entered first number for multiplication");
			lp.Multi_N3().click();

			lp.Multi_sign().click();

			lp.Multi_N5().click();

			lp.Multi_N2().click();

			lp.Multi_N5().click();

			lp.Equal_sign().click();
			log.info("multiply");
			getScreenshot("Multiplication");
			String res= lp.result().getText();
			System.out.println("REsult of multiplication :  " + res);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			log.fatal("Not Entered first number for multiplication");

		}

	}



	public void Add() {
		// TODO Auto-generated method stub   234234   345345

		try {

			lp.AllClr_sign().click();

			lp.Subsign().click();

			lp.Multi_N2().click();	

			lp.Multi_N3().click();

			lp.Multi_N4().click();

			lp.Multi_N2().click();

			lp.Multi_N3().click();

			lp.Multi_N4().click();

			lp.Addsign().click();

			lp.Multi_N3().click();

			lp.Multi_N4().click();

			lp.Multi_N5().click();

			lp.Multi_N3().click();

			lp.Multi_N4().click();

			lp.Multi_N5().click();

			lp.Equal_sign().click();
			getScreenshot("Addition");
			String res= lp.result().getText();
			System.out.println("Result of Addition :  " + res);
			

		} 
		catch (Exception e) {
			e.printStackTrace();
			log.fatal("Not Entered first number for multiplication");

		}
	}




	public void Div() {
		// TODO Auto-generated method stub   4000   200

		try {

			lp.AllClr_sign().click();



			lp.Multi_N4().click();
			lp.Multi_N0().click();
			lp.Multi_N0().click();
			lp.Multi_N0().click();

			lp.Div_sign().click();

			lp.Multi_N2().click();
			lp.Multi_N0().click();
			lp.Multi_N0().click();


			lp.Equal_sign().click();
			getScreenshot("Division");
			String res= lp.result().getText();
			System.out.println("Result of Division :  " + res);

		} 
		catch (Exception e) {
			e.printStackTrace();
			log.fatal("Not Entered first number for multiplication");

		}
	}

	public void Sub() {
		// TODO Auto-generated method stub   234823 -23094823



		try {

			lp.AllClr_sign().click();

			lp.Multi_N2().click();
			lp.Multi_N3().click();
			lp.Multi_N4().click();
			lp.Multi_N8().click();
			lp.Multi_N2().click();
			lp.Multi_N3().click();
			lp.Subsign().click();

			lp.Subsign().click();
			lp.Multi_N2().click();
			lp.Multi_N3().click();
			lp.Multi_N0().click();
			lp.Multi_N9().click();
			lp.Multi_N4().click();
			lp.Multi_N8().click();
			lp.Multi_N2().click();
			lp.Multi_N3().click();



			lp.Equal_sign().click();
			getScreenshot("substraction");
			String res= lp.result().getText();
			System.out.println("Result of Substraction :  " + res);
			log.info("Substract");
		} 
		catch (Exception e) {
			e.printStackTrace();
			log.fatal("Not Entered first number for multiplication");

		}
	}



}
