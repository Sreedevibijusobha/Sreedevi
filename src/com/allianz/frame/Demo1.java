package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("https://netbanking.hdfcbank.com/netbanking/");
	        
	        //switch to frame xpath
	        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
	        //enter userid as jack123
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jack123");
	        driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	        
	        //switch to main html
	        driver.switchTo().defaultContent();
	        

	}

}
