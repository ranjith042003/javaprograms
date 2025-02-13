package com.ValidatinganApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatinganApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
         ChromeDriver driver =  new ChromeDriver();
         driver.get("https://www.bing.com");
         driver.manage().window().maximize();
       String  Expected_Title="bing";
       System.out.println(Expected_Title);
       
      String Actual_Title=driver.getTitle();
      System.out.println(Actual_Title);
      
      if(Expected_Title.equals(Actual_Title)) {
    	  
    	  System.out.println("True");
      }
      else {
    	  System.out.println("False");
      }
      if(Expected_Title.equalsIgnoreCase(Actual_Title)) {
    	  System.out.println("True");
      }
      else {
    	  System.out.println("False");
      }
if(Actual_Title.contains(Expected_Title)) {
    	  
    	  System.out.println("True");
      }
else {
	System.out.println("False");
}
	}

}
