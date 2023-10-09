package classes;

import org.openqa.selenium.By;

public class repository {

		public By swagUN=By.id("user-name");
		public By swagPW=By.id("password");
		public By swaglogin=By.id("login-button");
		public By errorcont= By.xpath("//div[@class='error-message-container error']");
		
		
		public By menu=By.xpath("//button[@style='position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none; opacity: 0; font-size: 8px; cursor: pointer;']");
		public By logoutbtn =By.id("logout_sidebar_link");
		public By backpack = By.linkText("Sauce Labs Backpack");
		public By bikelight = By.linkText("Sauce Labs Bike Light");
		public By tshirt = By.linkText("Sauce Labs Bolt T-Shirt");
		public By jacket = By.linkText("Sauce Labs Fleece Jacket");
		public By onesie = By.linkText( "Sauce Labs Onesie");
		public By redtshirt = By.linkText("Test.allTheThings() T-Shirt (Red)");
		public By addprodcut = By.xpath("//button[@class='btn_primary btn_inventory']");
		//By back = By.xpath("//button[@class='inventory_details_back_button']");
		public By removeproduct= By.xpath("//button[@class='btn_secondary btn_inventory']");
		public By cartbtn= By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");
		public By checkout = By.linkText("CHECKOUT");
		
		public By fname=By.id("first-name");
		public By lname=By.id("last-name");
		public By pincode= By.id("postal-code");
		public By continuebtn = By.xpath("//input[@class='btn_primary cart_button']");
		public By finishbtn = By.xpath("//a[@class='btn_action cart_button']");
		
		public By backpackname= By.xpath("//div[@class='inventory_details_name']");
		public By backpackdesc= By.xpath("//div[@class='inventory_details_desc']");
		public By backpackcost= By.xpath("//div[@class='inventory_details_price']");

		public By bikelightname= By.xpath("//div[@class='inventory_details_name']");
		public By bikelightdesc= By.xpath("//div[@class='inventory_details_desc']");
		public By bikelightcost= By.xpath("//div[@class='inventory_details_price']");
		
		public By tshirtname= By.xpath("//div[@class='inventory_details_name']");
		public By tshirtdesc= By.xpath("//div[@class='inventory_details_desc']");
		public By tshirtcost= By.xpath("//div[@class='inventory_details_price']");
		
		public By jacketname= By.xpath("//div[@class='inventory_details_name']");
		public By jacketdesc= By.xpath("//div[@class='inventory_details_desc']");
		public By jacketcost= By.xpath("//div[@class='inventory_details_price']");
		
		public By onesiename= By.xpath("//div[@class='inventory_details_name']");
		public By onesiedesc= By.xpath("//div[@class='inventory_details_desc']");
		public By onesiecost= By.xpath("//div[@class='inventory_details_price']");
		
		public By redtshirtname= By.xpath("//div[@class='inventory_details_name']");
		public By redtshirtdesc= By.xpath("//div[@class='inventory_details_desc']");
		public By redtshirtcost= By.xpath("//div[@class='inventory_details_price']");


}
