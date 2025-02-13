package com.WorkingWithDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("http://omayo.blogspot.com/");
	       driver.manage().window().maximize();
	       WebElement course=driver.findElement(By.id("drop1"));
	 Select obj=new Select(course);
	      
	
	}

}
