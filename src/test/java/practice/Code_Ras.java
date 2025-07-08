package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Code_Ras {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shanj\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 // WebDriver driver=new ChromeDriver();
		
		  ChromeOptions options = new ChromeOptions();
		     options.addArguments("--remote-allow-origins=*");
		     options.addArguments("--disable-notifications");
		     WebDriver driver = new ChromeDriver(options);
		     
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver=new ChromeDriver();*/
		
		
		
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--remote-allow-origins=*");
			//ChromeDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.tarladalal.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//ul[@id='nav']/li/a[1]")).click();
			driver.findElement(By.xpath("//a[@id='ctl00_cntleftpanel_ttlhealthtree_tvTtlHealtht335']")).click();
			int s= driver.findElements(By.xpath("//span[@class='rcc_recipename']")).size();

			int s1= driver.findElements(By.xpath("//div[@id='pagination']/a")).size();
			for(int j=1;j<=23;j++)
			{
				driver.findElement(By.xpath("//div[@id='pagination']/a["+j+"]")).click();
			for(int i=1;i<=s;i++)
			{
				String ReceipeID=driver.findElement(By.xpath("//div[@class='recipelist']/article["+i+"]/div[2]/span")).getText();
				System.out.println("Reciepe ID: "+ReceipeID);
				String ReceipeName=driver.findElement(By.xpath("//div[@class='recipelist']/article["+i+"]/div[3]/span/a")).getText();
				System.out.println("Recipe Name: "+ ReceipeName);
				
				driver.findElement(By.xpath("//div[@class='recipelist']/article["+i+"]/div[3]/span/a")).click();
				String Ingradients=driver.findElement(By.xpath("//div[@id='rcpinglist']/div")).getText();
				System.out.println("Ingradients: "+Ingradients);
				String PrepTime=driver.findElement(By.xpath("//time[@itemprop='prepTime']")).getText();
				System.out.println("Preparation Time :"+PrepTime);
				String CookTime=driver.findElement(By.xpath("//time[@itemprop='cookTime']")).getText();
				System.out.println("Cook Time :"+CookTime);
				String PMethod=driver.findElement(By.xpath("//div[@id='ctl00_cntrightpanel_pnlRcpMethod']/div[1]/span/ol")).getText();
				System.out.println("Prepartion Metod :"+PMethod);
				String Nutrion=driver.findElement(By.xpath("//div[@id='rcpnuts']")).getText();
				System.out.println("Nutrition Values :"+Nutrion);
				String strUrl = driver.getCurrentUrl();
				System.out.println("Recipe URL :"+ strUrl);
				driver.navigate().back();

				//Testing purpose added code
				driver.quit();
			
			}
		}
		}
	
}
