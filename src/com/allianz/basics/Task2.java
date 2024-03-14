package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		driver.findElement(By.xpath("(//a[text()='select your product type'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		driver.findElement(By.id("cvvnumber")).sendKeys("554");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.className("ui-datepicker-year")).click();
		driver.findElement(By.xpath("//option[text()='2022']")).click();
		driver.findElement(By.className("ui-datepicker-month")).click();
		driver.findElement(By.xpath("//option[text()='Apr']")).click();
		driver.findElement(By.xpath("//a[text()='14']")).click();
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		String actualText=driver.findElement(By.xpath("//p[@class='err-cont']")).getText();
		System.out.println("Text= "+actualText);
		
		driver.quit();
		
	}
}
