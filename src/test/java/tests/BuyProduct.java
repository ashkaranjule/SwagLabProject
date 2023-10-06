package tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class BuyProduct extends ProductCheck{

ArrayList<String> product=dataread("C:\\selenium\\workspace\\Sheets\\SwaglabforSingle.xlsx","buydata",0);
	
	@Test(priority=4)
	public void buyitems()
	{
		starttestcase("Add product in cart");
		for (int i=0;i<product.size();i++)
		{
			driver.get(expurl);
			if(product.get(i).equalsIgnoreCase("backpack"))
			{
				elementfinder(rep.backpack).click();
				markstatus("info",product.get(i)+" added to cart");
				//elementfinder(rep.back).click();
			}
			
			else if(product.get(i).equalsIgnoreCase("bikelight"))
			{
				elementfinder(rep.bikelight).click();
				markstatus("info",product.get(i)+" added to cart");
				//elementfinder(rep.back).click();
			}
			
			else if(product.get(i).equalsIgnoreCase("tshirt"))
			{
				elementfinder(rep.tshirt).click();
				markstatus("info",product.get(i)+" added to cart");
				//elementfinder(rep.back).click();
			}
			
			else if(product.get(i).equalsIgnoreCase("jacket"))
			{
				elementfinder(rep.jacket).click();
				markstatus("info",product.get(i)+" added to cart");
				//elementfinder(rep.back).click();
			}
			
			else if(product.get(i).equalsIgnoreCase("onesie"))
			{
				elementfinder(rep.onesie).click();
				markstatus("info",product.get(i)+" added to cart");
				//elementfinder(rep.back).click();
			}
			
			else if(product.get(i).equalsIgnoreCase("redtshirt"))
			{
				elementfinder(rep.redtshirt).click();
				markstatus("info",product.get(i)+" added to cart");
				//elementfinder(rep.back).click();
			}
			elementfinder(rep.addprodcut).click();
			
		}
	}

}
