package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		driver.get("https://www.macys.com/");
		//driver.findElement(By.xpath(//*[@id="nav-header"]/div/header/section/div/ul[2]/li[3]/a/span[2]));
		driver.findElement(By.linkText("Sign In")).click();
		
		}

}


