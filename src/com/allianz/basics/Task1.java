package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		Select selectObject = new Select(driver.findElement(By.name("UserTitle")));
		selectObject.selectByVisibleText("IT Manager");
		//driver.findElement(By.xpath("//options[text()='IT Manager']")).click();
		Select selectObject1 = new Select(driver.findElement(By.name("CompanyEmployees")));
		selectObject1.selectByVisibleText("101 - 200 employees");
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		//driver.findElement(By.xpath("//options[text()='101 - 200 employees']")).click();
		Select selectObject2 = new Select(driver.findElement(By.name("CompanyCountry")));
		selectObject2.selectByVisibleText("United Kingdom");
	//	driver.findElement(By.xpath("//options[text()='United Kingdom']")).click();
		driver.findElement(By.name("start my free trial")).click();
		String actualText=driver.findElement(By.xpath("//span[text()='Enter a valid phone number']")).getText();
		System.out.println("Text= "+actualText);

	}
}
