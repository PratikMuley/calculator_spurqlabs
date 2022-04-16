
package Runner_main;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.base;

import MethodLibrary.Login_Library;
import MethodLibrary.Search_library;
import MethodLibrary.outplay_library;

public class MainScript extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());
outplay_library op =null;
	Login_Library ll = null;
	Search_library sl =null;
	
	@BeforeTest(groups= {"smoke","regression"})
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.manage().window().maximize();
op = new outplay_library(driver);
		ll = new Login_Library(driver);
		sl= new Search_library(driver);	
	}

	@Test(priority = 1,groups= {"smoke","regression"})
	public void browse() throws InterruptedException, IOException {

		ll.browse();

	}
	@Test(priority = 2,enabled=true)
	public void login_fun() throws InterruptedException, IOException {
		ll.login();
	}
	@Test(priority = 3,enabled=true)
	public void search_fun() throws InterruptedException, IOException {
		sl.search();
		sl.select_mobiles();
	//sl.Validation_mobile();
	}
	


	
	  @AfterTest() public void quit() throws IOException  {
	  
	  driver.close();
	  Runtime.getRuntime().exec("taskkill /F /IM Chromedriver.exe");
	  }
	 



}
