package com.WorkingonTextbox;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver =  new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.manage().window().maximize();
        //FIRSTNAME
        
	}

}
