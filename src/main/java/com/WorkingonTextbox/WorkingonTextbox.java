package com.WorkingonTextbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingonTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver =  new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 driver.manage().window().maximize();
		 //USERNAME
		 WebElement UserName=driver.findElement(By.id("username"));
		 UserName.sendKeys("RANJITH");
		 
		 //PASSWORD
		 WebElement Password=driver.findElement(By.id("password"));
		 Password.sendKeys("R@njith2003");
		 
		 //for printing in the console 
		 
		String userid= UserName.getAttribute("value");
		System.out.println(userid);
		
	String pwd=	Password.getAttribute("value");
	System.out.println(pwd);
	
	if(userid.equals(pwd))
	{
		System.out.println("same");
	}
	else {
		System.out.println("not same");
		
	}
		 
	}

}
