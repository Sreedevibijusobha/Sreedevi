package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4FBLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//enter username,password and login
		
		driver.findElement(By.id("email")).sendKeys("hello1234@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jacl123");
		driver.findElement(By.name("login")).click();
	}

}
