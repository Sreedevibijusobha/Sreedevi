package com.allianz.basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		
//		JavascriptExecutor driver1=new ChromeDriver();
//		ChromeDriver driver2=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			//get page title
			String actualTitle=driver.getTitle();
			System.out.println("Title="+actualTitle);
			
			//get current url
			
			String actualUrl=driver.getCurrentUrl();
			System.out.println("Url="+actualUrl);
			
			//get page source
			
			String actualPage=driver.getPageSource();
			System.out.println("PageSource="+actualPage);
			
		
		driver.quit();
	
		
	}

}
