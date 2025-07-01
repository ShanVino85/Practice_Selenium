package practice_java2025;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vino");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ram");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("10.Macys Drive,NewYork");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("vinoram12@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("2123456455");
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		WebElement lang=driver.findElement(By.xpath("//div[@id='msdd']"));
		lang.click();
		WebElement option=driver.findElement(By.xpath("//a[text()='Bulgarian']"));
		option.click();
		

		Thread.sleep(5000);
		WebElement drop=driver.findElement(By.id("Skills"));
		//drop.click();
		Select select=new Select(drop);
		select.selectByVisibleText("APIs");
		
		driver.quit();
		
//		WebElement search=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		Actions action=new Actions(driver);
//		action.click(search).sendKeys("Vino").perform();
//		
//		WebElement search=driver.findElement(By.id("navbar-brand"));
//		Actions action=new Actions(driver);
//		action.click(search).perform();
		

		
	}

}
