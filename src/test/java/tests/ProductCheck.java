package tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ProductCheck extends page.LoginCheck{

	ArrayList<String> actdetails= new ArrayList<String>();
	ArrayList<String> expdetails=dataread("C:\\selenium\\workspace\\Sheets\\SwaglabforSingle.xlsx","product",0);

	
	@Test(priority=2)
	public void loginuser()
	{
		elementfinder(rep.swagUN).sendKeys(username.get(0));
		elementfinder(rep.swagPW).sendKeys(password.get(0));
		elementfinder(rep.swaglogin).click();
	}
	
	@Test(priority=3)
	public void productcheck()
	{
		starttestcase("product check");
		
		
		elementfinder(rep.backpack).click();

		String a= elementfinder(rep.backpackname).getText();
		String b= elementfinder(rep.backpackdesc).getText();
		String c= elementfinder(rep.backpackcost).getText();
		
		actdetails.add(a);
		actdetails.add(b);
		actdetails.add(c);
		System.out.println(expdetails);
		System.out.println(actdetails);
		
		starttestcase("product details");
		for (int j=0;j<expdetails.size();j++)
		{
			if(actdetails.get(j).equals(expdetails.get(j)))
			{
				markstatus("pass","product detail"+expdetails.get(j));
				System.out.println("pass"+expdetails.get(j));
			}
			else
			{
				markstatus("fail","product detail"+expdetails.get(j));
				System.out.println("fail"+expdetails.get(j));
			}
		}
	}

}
