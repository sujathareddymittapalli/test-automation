package sujatha_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");//get stands hitting url
		System.out.println(driver.getCurrentUrl()); //validate if you are landed correct page
		System.out.println(driver.getTitle()); //validate if your title page is correct
		//System.out.println(driver.getPageSource());
		driver.get("https://stagingapp.menew.in");
		//driver.navigate().back();not working
		driver.close(); //It will close current browser
		driver.quit(); //it will close all the browser opened through selenium
				

	}

}
