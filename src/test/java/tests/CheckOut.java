package tests;

import org.testng.annotations.Test;

public class CheckOut extends RemoveProduct{
	
	@Test(priority=6)
	public void payment()
	{
		starttestcase("check out");
		
		elementfinder(rep.cartbtn).click();
		markstatus("info","switch to cart");
		 
		elementfinder(rep.checkout).click();
		markstatus("info","click on checkout button");
		
		elementfinder(rep.fname).sendKeys("ashwaraj");
		markstatus("info","first name is entered");
		elementfinder(rep.lname).sendKeys("karanjule");
		markstatus("info","last name is entered");
		elementfinder(rep.pincode).sendKeys("413702");
		markstatus("info","pin code is entered");
		elementfinder(rep.continuebtn).click();
		markstatus("info","delivery details are entered");
		elementfinder(rep.finishbtn).click();
		markstatus("info","products ordered successfully");
	}

}

