package com.allianz.frame;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Task1 {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("http://demo.openemr.io/b/openemr/index.php");
	       
	        driver.findElement(By.name("authUser")).sendKeys("admin");
	        driver.findElement(By.name("clearPass")).sendKeys("pass");
	        Select selectObject = new Select(driver.findElement(By.xpath("//select[@name='languageChoice']")));
			selectObject.selectByVisibleText("English (Indian)");
			
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.xpath("//div[text()='Patient']")).click();
			driver.findElement(By.xpath("//div[text()='New/Search']")).click();
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
			driver.findElement(By.name("form_fname")).sendKeys("admin");
	        driver.findElement(By.name("form_lname")).sendKeys("pass");
	        

	        LocalDate today = LocalDate.now();
	        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        String formattedDate = today.format(formatter);
	        driver.findElement(By.id("form_DOB")).sendKeys(formattedDate);
	        
	        Select selectGender = new Select(driver.findElement(By.xpath("//select[@id='form_sex']")));
	        
	        selectGender.selectByVisibleText("Male");
	        
	        driver.findElement(By.id("create")).click();
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'modalIframe')]")));
	        driver.findElement(By.xpath("//button[text()='Confirm Create New Patient']")).click();
	        driver.switchTo().defaultContent();
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	        wait.until(ExpectedConditions.alertIsPresent());
	        
	        Alert alert= driver.switchTo().alert();
	        String actualAlertText=alert.getText();
	        System.out.println("Actual alert text---------->"+actualAlertText);

	        alert.accept();
	       driver.findElement(By.xpath("//div[@class='closeDlgIframe']")).click();
	       String pname= driver.findElement(By.xpath("//span[@data-bind='text: pname()']")).getText();
	       System.out.println('\n'+"patient name ------->"+pname);
	        driver.quit(); 
	   }

}
