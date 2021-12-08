
package MainScript_calculator;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.base;
import MethodLibrary.FunctionLibrary;

public class Calculator extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	FunctionLibrary fl = null;

	@BeforeTest(groups= {"smoke","regression"})
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.manage().window().maximize();

		fl = new FunctionLibrary(driver);

	}

	@Test(priority = 1,groups= {"smoke","regression"})
	public void browse() throws InterruptedException, IOException {

		fl.browse();

	}
	

	

	@Test(priority = 2,groups= {"smoke","regression"})
	public void Mul() throws InterruptedException, IOException {
		fl.Mul();
	}

	@Test(priority =3,groups= {"smoke","regression"})
	public void Div() throws InterruptedException, IOException {

		fl.Div();

	}
	
	
	@Test(priority =4,groups= {"smoke","regression"})
	public void Add() throws InterruptedException, IOException {

		fl.Add();

	}
	@Test(priority =5,groups= {"smoke","regression"})
	public void Sub() throws InterruptedException, IOException {

		fl.Sub();
		
		

	}
	@AfterTest()
	public void quit() throws InterruptedException {
		
		driver.close();
	}
	
	
	   
	 

}
