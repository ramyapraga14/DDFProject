package readDataFiles;

import java.io.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriverV76\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
		File f = new File("E:\\Datafile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		int rowcount = s.getLastRowNum()-s.getFirstRowNum();
		for (int i=0;i<rowcount+1;i++) {
			Row row = s.getRow(i);
			for (int j=0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		System.out.println("Finish");
	}
}
