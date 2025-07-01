package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrap_covid {

	//public static void main(String[] args) {
		
		public static WebDriver Driver;
		@Test(priority=1)
		
		public void case001() throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			
			Driver  =new ChromeDriver();
			//Driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
			Driver.manage().window().maximize();
			 
			 Driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");
			 Thread.sleep(2000);
		}
	
		@Test(priority=2)
		public void case002() throws InterruptedException
		{
			/*WebElement hospital = Driver.findElement(By.xpath("//div[@class='card custom-card']//div[@id='collapseOne-1']"));
			hospital .click();
			WebElement hospital = Driver.findElement(By.xpath("//div[@class='card custom-card']/[1]//span[@.='Contact']"));
			hospital.click();*/
			
			int i;
			int noofhospital = Driver.findElements(By.xpath("//div[@class='card custom-card']")).size();
			System.out.println("no of Hospital  =" + noofhospital);
			
				for(i=1; i<=5 ;i++)
				{
			    String hospitalname = Driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//a")).getText();
				 System.out.println( i+ " ) " + hospitalname);
			    
			   Driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//a")).click();
				
			   Thread.sleep(5000);
			   Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			 String address= Driver.findElement(By.xpath("//div[@class='modal-content']//li//label")).getText();
			 System.out.println(i+")" +  address); 
			
			 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			 String phoneno = Driver.findElement(By.xpath("//div[@class='modal-content']//li//span")).getText();
			 System.out.println(i+")" +phoneno);
			
			 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 
			Driver.findElement(By.xpath("//div[@class='modal-content']//div//button//span")).click();
			Thread.sleep(10000);
			
			
			
			
			String ward=Driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//li[1] //div[@class='count-text']")).getText();
			System.out.println( i+")"+ward);
			
			String oxygen=Driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//li[2] //div[@class='count-text']")).getText();
			System.out.println( i+")"+ oxygen);
			
			String pres=Driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//li[3] //div[@class='count-text']")).getText();
			System.out.println( i+")"+pres);
			
			String ventilator=Driver.findElement(By.xpath("//div[@class='card custom-card']["+ i +"]//li[4] //div[@class='count-text']")).getText();
			System.out.println( i+")"+ ventilator);
			
			//Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//@Test
			
			//public static void case003()
			// Driver.close();
			 
			   
				} 

		}}
	



	


