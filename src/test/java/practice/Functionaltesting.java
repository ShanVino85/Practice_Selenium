package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functionaltesting {

	public static void main(String[] args) {
		
//	  Through the chrome driver
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		WebDriver driver=new ChromeDriver();
		
		
		
		//Through the WebdriverManager
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
	
		//Array declaration for getting more product
		int j=0;
		String[] itemneeded ={"Cucumber","Brocolli","Beetroot","Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++) 
		{
			String[] name=product.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			//array use less memory ,arraylist is used whenever complicated 
			//extracting the values
			
			List itemneededlist = Arrays.asList(itemneeded );  //Convert arrary to arraylist for search
			
			
			if( itemneededlist.contains(name)) {
				j++;
				//click to Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemneeded.length) {
					break;
				}
				
				
			}
			
		}
		
		
	}

}
