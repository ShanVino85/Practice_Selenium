package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {
	
public static void main(String[] args) throws InterruptedException {	
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//	System.setProperty("webdriver.http.factory", "jdk-http-client");
//	WebDriver driver=new ChromeDriver();
	
	//Through the WebdriverManager
	 System.setProperty("webdriver.http.factory", "jdk-http-client");
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	
	
	  ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     options.addArguments("--disable-notifications");
	   //  WebDriver driver = new ChromeDriver(options);
	     
	
	  driver.get("https://www.google.com/");
	  Thread.sleep(5000);
	
	  

}
	}

