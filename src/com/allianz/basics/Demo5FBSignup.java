package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5FBSignup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
	//  click create account and give firstname john
		driver.findElement(By.linkText("Create new account")).click();
		
	//	driver.findElement(By.xpath("//a[@role='button'][@data-testid='open-registration-form-button']")).click();
	//	Thread.sleep(8000);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("wick");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test123");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
	}
	

}
