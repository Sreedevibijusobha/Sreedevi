package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://nasscom.in/");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//li[@data_get='register-app']")).click();
		driver.findElement(By.name("field_fname_reg[0][value]")).sendKeys("admin");
		driver.findElement(By.name("field_lname[0][value]")).sendKeys("pass");
		driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("field_company_name_registration[0][value]")).sendKeys("Google");
		Select selectObject = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		selectObject.selectByVisibleText("IT Consulting");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String actualText=driver.findElement(By.xpath("//ul[@class='messages__list']")).getText();
		System.out.println("Text= "+actualText);
		
		driver.quit();
	}
}
