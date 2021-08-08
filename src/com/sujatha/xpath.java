package sujatha_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","F://selenium//chromedriver.exe");
		WebDriver sujatha = new ChromeDriver();
		sujatha.get("https:\\www.google.com");
		System.out.println("sujatha.getCurrentUrl()");
		sujatha.get("https:\\stagingapp.menew.in");
		sujatha.findElement(By.xpath("/html/body/app-root/main/app-log-in/section/article/div[1]/form/div[3]/div/input")).sendKeys("0444444444");
		sujatha.findElement(By.xpath("/html/body/app-root/main/app-log-in/section/article/div[1]/form/div[4]/app-passcode/div/div/input[2]")).sendKeys("1234");
		sujatha.findElement(By.cssSelector("body > app-root > main > app-log-in > section > article > div.mn-auth__body > form > app-button > button")).click();

	}

}
