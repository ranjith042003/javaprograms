package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
               ChromeDriver obj=new ChromeDriver();
               obj.get("https://www.facebook.com/");
               obj.manage().window().maximize();
               
//               <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal-email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
//               obj.findElement(By.)

              // ID
        //      obj.findElement(By.id("email")).sendKeys("Ranjith");
               
           //  WebElement Name=obj.findElement(By.id("email"));
            //Name.sendKeys("Ranjith2003@gmail.com");
               
               //name
             //  obj.findElement(By.name("email")).sendKeys("Testing");
               
               //className
             //  obj.findElement(By.className("inputtext")).sendKeys("Tools");
               
               //tagname
         //  List<WebElement>link= obj.findElements(By.tagName("a"));
            //  System.out.println(link.size());
              
          //  int links=link.size();
           //System.out.println(links);
           
          //xpath(absolute)
        //   WebElement email=obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
          // email.sendKeys("Testing");
           
           //xpath(relative)
        //   WebElement Email=obj.findElement(By.xpath("//*[@id=\"email\"]"));
          // Email.sendKeys("TestingTools");
              
       //    linktext
              
           // obj.findElement(By.linkText("Forgotten password?")).click();
            
            //CSS selector
          //  obj.findElement(By.cssSelector("#email")).sendKeys("TestingFullStack");
              
              //linktext
              obj.findElement(By.linkText("Create a Page")).click();
              obj.findElement(By.id("email")).sendKeys("Ranjith");
              
	}

}
