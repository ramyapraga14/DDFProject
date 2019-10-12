package readDataFiles;

import java.io.*;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyTestfile {
	public static void main(String []args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriverV76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//To read the property file
	File f = new File ("E:\\Selenium-workspace\\DataDrivenProject\\src\\readDataFiles\\env.properties");
	FileInputStream fis = new FileInputStream(f);
	Properties prop = new Properties();
	prop.load(fis);
 
	driver.get(prop.getProperty("url"));
	driver.findElement(By.name("q")).sendKeys(prop.getProperty("searchterm"));
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.quit();
	
}
}
