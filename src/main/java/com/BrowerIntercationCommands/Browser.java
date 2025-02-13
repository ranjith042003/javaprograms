package com.BrowerIntercationCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
 public static void main(String[]args) throws InterruptedException  {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
	 ChromeDriver obj=new ChromeDriver();
	 obj.get("https://www.amazon.in/");
	// obj.get("https://www.meesho.com/");
     Thread.sleep(5000);
	 
     obj.manage().window().maximize();
     
     String rr= obj.getPageSource();
     System.out.println(rr);
     
     String title=obj.getTitle();
     System.out.println(title);
     
     String url=obj.getCurrentUrl();
     System.out.println(url);
     
     obj.navigate().to("https://www.myntra.com/");
     obj.navigate().back();
     obj.navigate().forward();
     obj.navigate().refresh();
     obj.close();
     obj.quit();
 }
}
