package tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class RemoveProduct extends BuyProduct{

ArrayList<String> rproduct=dataread("C:\\selenium\\workspace\\Sheets\\SwaglabforSingle.xlsx","removedata",0);
	
	@Test(priority=5)
	public void removeitems()
	{
		starttestcase("remove product form cart");
		for (int i=0;i<rproduct.size();i++)
		{
			driver.get(expurl);
			elementfinder(rep.cartbtn).click();
			if(rproduct.get(i).equalsIgnoreCase("backpack"))
			{
				elementfinder(rep.backpack).click();
				markstatus("info",rproduct.get(i)+" is removed from cart");
			}
			
			else if(rproduct.get(i).equalsIgnoreCase("bikelight"))
			{
				elementfinder(rep.bikelight).click();
				markstatus("info",rproduct.get(i)+" is removed from cart");
			}
			
			else if(rproduct.get(i).equalsIgnoreCase("tshirt"))
			{
				elementfinder(rep.tshirt).click();
				markstatus("info",rproduct.get(i)+" is removed from cart");
			}
			
			else if(rproduct.get(i).equalsIgnoreCase("jacket"))
			{
				elementfinder(rep.jacket).click();
				markstatus("info",rproduct.get(i)+" is removed from cart");
			}
			
			else if(rproduct.get(i).equalsIgnoreCase("onesie"))
			{
				elementfinder(rep.onesie).click();
				markstatus("info",rproduct.get(i)+" is removed from cart");
			}
			
			else if(rproduct.get(i).equalsIgnoreCase("redtshirt"))
			{
				elementfinder(rep.redtshirt).click();
				markstatus("info",rproduct.get(i)+" is removed from cart");
			}
			elementfinder(rep.removeproduct).click();
			
		}
	}

}
