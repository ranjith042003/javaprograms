package com.WorkingonTextbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
		        ChromeDriver driver =  new ChromeDriver();

		        driver.get("https://www.example.com/radiobuttons");

		        // Find all radio buttons
		        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

		        // Use for-each loop to iterate over radio buttons
		        for (WebElement radioButton : radioButtons) {
		            // Check if radio button is not selected
		            if (!radioButton.isSelected()) {
		                // Select the radio button
		                radioButton.click();
		                break; // Break the loop after selecting one radio button
		            }
		        }

		        driver.quit();
		    }
		


	}


