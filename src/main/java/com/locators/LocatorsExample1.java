package com.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//password
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yochana\\eclipse-workspace\\firstproject\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.facebook.com/");
        obj.manage().window().maximize();
       // <div class="_6luy _55r1 _1kbt _9nyh" id="passContainer"><input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal-pass" 
        //placeholder="Password" aria-label="Password"><div class="_9ls7 hidden_elem" id="u_0_3_Za"><a href="#" role="button"><div class="_9lsa"><div class="_9lsb" id="u_0_4_60"
        //></div></div></a></div></div>
        
        //ID
        obj.findElement(By.id("email")).sendKeys("Ranjith@gmail.com");
      //  obj.findElement(By.id("pass")).sendKeys("Ranjith@04");
        
        WebElement Password = obj.findElement(By.id("pass"));
	       //Password.sendKeys("Ranjith04");
	      // Password.sendKeys("Ranjith04@");
	       
	       //name	       
		    obj.findElement(By.name("pass")).sendKeys("Ranjith");
		    //or
		       //WebElement Password = obj.findElement(By.name("pass"));
		       //Password.sendKeys("Ranjith04");
		       
		     //Absolute Xpath
	      //  WebElement Passwords = obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		     	 //       Passwords.sendKeys("Ranji");
        
		     //relativexpath
		     	     //  obj.findElement(By.xpath("//*[@id='pass']")).sendKeys("Ranjith");
		     	      //CssSelector
		     		     obj.findElement(By.cssSelector("input[pass='Ranjith2003']"));
		     		     //or
		     		    //  WebElement Passwords=  obj.findElement(By.cssSelector("#pass"));
		     		      //Passwords.sendKeys("Ranjith2003");
		     		     
		     		    
		     		   	
		     		       
		     	        
	}

}
