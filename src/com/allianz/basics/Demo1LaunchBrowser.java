package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
//		ChromeDriver driver=new ChromeDriver();
		
		//launch browser via polymorphism
		
		
		WebDriver driver=null;
		String browser="ch";
		
		 if(browser.equalsIgnoreCase("ch"))
		 {
	
		driver =new ChromeDriver();
		 }
		 else
		 {
		driver= new EdgeDriver();
		 }
		 
		 WebDriver driver1=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver1.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String actualtitle=driver1.getTitle();
		System.out.println(actualtitle);
		
		driver.quit();
	driver1.quit();
	}

}
