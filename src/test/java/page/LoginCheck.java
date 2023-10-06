package page;

import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import classes.TestUtil;

public class LoginCheck extends TestUtil{

	public classes.repository rep= new classes.repository();
	
	public ArrayList<String> username=dataread("C:\\selenium\\workspace\\Sheets\\SwaglabforSingle.xlsx","up",0);
	public ArrayList<String> password=dataread("C:\\selenium\\workspace\\Sheets\\SwaglabforSingle.xlsx","up",1);
	
	
	public String expurl="https://www.saucedemo.com/v1/inventory.html";
	
	@BeforeTest
	public void openbrowser() throws Exception
	{
	driversetting();
	}
	
	

	@Test(priority=1)
	public void login_check()
	{
		starttestcase("swag login check for users");
		
		markstatus("info","swag lab is opened");
		
		for(int i=0;i<username.size();i++)
		{
		    elementfinder(rep.swagUN).sendKeys(username.get(i));
			elementfinder(rep.swagPW).sendKeys(password.get(i));
			elementfinder(rep.swaglogin).click();
			
			String acturl=driver.getCurrentUrl();
			//System.out.println(expurl);
			//System.out.println(acturl);
			
			
			if (acturl.equals(expurl))
			{
				markstatus("pass","login successful with "+username.get(i));
				elementfinder(rep.menu).click();
				elementfinder(rep.logoutbtn).click();
			}
			
			else
			{
				markstatus("fail","login unsuccessful with "+username.get(i));
				driver.navigate().refresh();
			}
		}
		markstatus("pass","login process checked successful");
	}
	

	@AfterTest
	public void close_browser()
	{
		starttestcase("Browser close");
		driver.close();
		markstatus("info","browser is closed");
	}


}
