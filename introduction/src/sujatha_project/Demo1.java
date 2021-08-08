package sujatha_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:\\google.com");
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("this is facebook");
		driver.findElement(By.name("pass")).sendKeys("this one");
		driver.findElement(By.name("login")).click();
		
	

		

	}

}