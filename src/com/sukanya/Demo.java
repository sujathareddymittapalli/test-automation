package com.sukanya;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\Chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.youtube.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());	
driver.get("http://www.google.com");
//System.out.println(driver.getPageSource());//
driver.close();
	}

}
