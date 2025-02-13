package com.WorkingWithMouseOverActions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver obj1 =  new ChromeDriver();
        obj1.get("https://www.greenstechnologys.com/");
        obj1.manage().window().maximize();
        WebElement course=obj1.findElement(By.linkText("COURSES"));
        Actions action=new Actions(obj1);
        action.moveToElement(course).build().perform();
        
        WebElement subcourse=obj1.findElement(By.linkText("Product Management Training"));
        Actions subaction=new Actions(obj1);
        subaction.moveToElement(subcourse).build().perform();
        
	}

}
