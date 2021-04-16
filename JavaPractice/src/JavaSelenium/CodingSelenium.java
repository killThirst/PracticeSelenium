package JavaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingSelenium {

	 public static void main(String[] args) {  
	      
         // System Property for Chrome Driver   
      System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Desktop/Workspace/chromedriver.exe");  
        
           // Instantiate a ChromeDriver class.     
      WebDriver driver=new ChromeDriver();  
        
         // Launch Website  
      driver.navigate().to("http://www.javatpoint.com/");  
        
       //Maximize the browser  
        driver.manage().window().maximize();  
	 }
	
	
	
}
