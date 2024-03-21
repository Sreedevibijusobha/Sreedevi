package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		driver.findElement(By.xpath("(//img[@title='LOGIN NOW'])[1]")).click();
		
		ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(windows.get(1));
	    
	    driver.findElement(By.xpath("//div[contains(@onclick,'ForgotUserID')]")).click();
		
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
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		String actualText=driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[1]")).getText();
		System.out.println("Text= "+actualText);
		
		driver.quit();
		
	}
}
