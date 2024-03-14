package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.medibuddy.in/");
		
		driver.switchTo().frame(1);
		driver.findElement(By.className("wzrkClose")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='I have a Corporate Account']")).click();
		driver.findElement(By.xpath("//a[text()='Learn More']")).click();
		driver.findElement(By.xpath("//a[text()='skip']")).click();
		driver.findElement(By.xpath("//a[text()='Login using Username & Password']")).click();
		driver.findElement(By.id("username")).sendKeys("john");
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.id("password")).sendKeys("john123");
		driver.findElement(By.xpath("//img[@ng-if='!showPassword']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualTitle=driver.findElement(By.className("alert")).getText();
		System.out.println("Title= "+actualTitle);
		
		driver.quit();
	}
}
