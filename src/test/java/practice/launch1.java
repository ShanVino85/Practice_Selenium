package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch1 {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		WebDriver driver=new ChromeDriver();
//		
		
		//Through the WebdriverManager
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, null);
		
		
		//using select class//
		WebElement drop=driver.findElement(By.name("url"));
		Select select=new Select(drop);
		select.deselectByValue("search-alias=amazon-pharmacy");
		select.deselectByVisibleText("Amazon Pharmacy");
		select.deselectByIndex(4);
	
		/*// Selenium Webdriver intialization
		System.setProperty("webdriver.chrome.driver",path)
		WebDriver driver= new Chrome driver();
		WebDriver driver= new Firefox driver();
		WebDriver driver= new Edge driver();
		
		//Webdrivermanager setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new Chromedriver();
		
		//Actions Class//
		WebElement search=driver.findElement(By.id("navbar-brand"));
		Actions action=new Actions(driver);
		action.click(search).perform();
		
		//Auto suggestions//
		WebElement auto= driver.findElement(By.id("twotabsearchtextbox"));
		auto.sendKeys(books);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ENTER);*/
		
		
		
		
		
		
	
		

	

}}
