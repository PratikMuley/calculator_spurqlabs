package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.css.sac.Locator;



public class base {

	public static WebDriver driver;
	public Properties prop;

	public void proper() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"//proprtiesfile//data.properties");
		  
		prop.load(fis);
	}
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public  String excel(int s , int row , int col) throws Exception {
		// TODO Auto-generated method stub

		File src = new File(System.getProperty("user.dir")+"//Excel//testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
		sheet =wb.getSheetAt(s);
		int rowcount = sheet.getLastRowNum();
		String data =sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	
	}
	
	public WebDriver initializeDriver() throws IOException {

	proper();
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			// execute in chrome driver

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
//	IE code
		}
		PrintStream out = new PrintStream(new FileOutputStream(System.getProperty("user.dir")+"//console//output.txt"));
		System.setOut(out);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public void getScreenshot(String folder,String i) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"./Screenshots/"  +folder +"/" + i + ".png"));

	}
	

}

