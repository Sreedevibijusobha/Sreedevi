package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args){
		
	
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
    driver.get("https://db4free.net");
        
        //click on phpMyAdmin »
    
    driver.findElement(By.partialLinkText("phpMyAdmin")).click();
    ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
    
    for(String win : windows)
    {
    	System.out.println(win);
    	driver.switchTo().window(win);
    	System.out.println(driver.getTitle());
    	if(driver.getTitle().equals("phMyAdmin"))
    	{
    		break;
    	}
    	System.out.println("------------");
    }
    System.out.println(driver.getCurrentUrl());
	}
}
