package sujatha_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.id("ct100_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("div.maincontainer:nth-child(13) div.home:nth-child(2) div.staticHomeContentFullpage.position-relative:nth-child(18) div.home_flight_search:nth-child(2) div.book div.row1 div.right1 div.search_options_menucontentbg:nth-child(5) td.mapbg div.search_options_menucontent div:nth-child(1) div.dropdownDiv ul:nth-child(1) li.city_selected:nth-child(4) > a:nth-child(1)[2]")).click();
		

	}

}
