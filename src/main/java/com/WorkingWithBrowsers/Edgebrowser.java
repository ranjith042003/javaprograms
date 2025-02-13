package com.WorkingWithBrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\msedgedriver.exe");
      EdgeDriver obj=new EdgeDriver();
      obj.get("https://www.ajio.com/");
      Thread.sleep(60);
      
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

      
      
      
      
      
      
      
      
      
      obj.getTitle();
	}

}
