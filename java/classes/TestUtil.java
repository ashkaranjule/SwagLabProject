package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestUtil extends TestBase{
	
	public WebElement elementfinder(By orjby)
	{
		WebElement temp=driver.findElement(orjby);
		
		return temp;
		
	}


}
