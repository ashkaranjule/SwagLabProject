package classes;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase {
	
	public static WebDriver driver;
	public static String browsername,applink;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static String timestamp= new SimpleDateFormat("dd_MM_yyyy hh_mm_ss").format(new Date());
	
	public void driversetting()
	{
		String a="data";
		try {
			FileInputStream f=new FileInputStream("C:\\selenium\\workspace\\Sheets\\SwaglabforSingle.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet sh=wb.getSheet(a);
			XSSFRow row = sh.getRow(1);
			browsername=row.getCell(0).getStringCellValue();
			applink=row.getCell(1).getStringCellValue();
		wb.close();
		f.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		starttestcase("open browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			markstatus("info","browser is open");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(applink);
		markstatus("info","link is open");
	}
	
	@BeforeSuite
	public void startreport()
	{
		htmlreporter= new ExtentHtmlReporter("C:\\selenium\\workspace\\ExtentReport\\report_"+ timestamp +".html");
		reports= new ExtentReports();
		reports.attachReporter(htmlreporter);
		
	}
	
	@AfterSuite
	public void endreport() {
		reports.flush();
	}
	
	public void starttestcase(String testname)
	{
		logger=reports.createTest(testname);
	}
	
	public void markstatus(String statusname, String description)
	{
		if(statusname.equalsIgnoreCase("pass"))
		{
			logger.log(Status.PASS, description);
			
		}
		else if(statusname.equalsIgnoreCase("fail"))
		{
			logger.log(Status.FAIL, description);
			
		}
		else if(statusname.equalsIgnoreCase("info"))
		{
			logger.log(Status.INFO, description);
			
		}
	}
	public ArrayList<String> dataread(String filepath, String sheetname, int cellnum)
	{
		ArrayList<String> al= new ArrayList<String>();
		
		try {
			FileInputStream fs=new FileInputStream(filepath);
			XSSFWorkbook wb=new XSSFWorkbook(fs);
			XSSFSheet sh= wb.getSheet(sheetname);
			int rowcount=sh.getLastRowNum();
			for(int i=1;i<=rowcount;i++)
			{
			XSSFRow row= sh.getRow(i);
			String temp= row.getCell(cellnum).getStringCellValue();
			al.add(temp);
			}
			
			wb.close();
			fs.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
		
	}
	
	

}
